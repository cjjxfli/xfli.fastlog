package com.xfli.fastlog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.ILoggerFactory;

public class LoggerContext implements ILoggerFactory {
	
	public static final int ERROR = 1;
    public static final int WARN = 2;
    public static final int INFO = 3;
    public static final int DEBUG = 4;
    public static final int TRACE = 5;
	
	final Logger root;
    private Map<String, Logger> loggerCache;
    int resetCount = 0;
    private int size;
    private List<String> frameworkPackages;
    Map<String, Object> objectMap = new HashMap<String, Object>();
    
    public LoggerContext() {
        super();
        this.loggerCache = new ConcurrentHashMap<String, Logger>();

        this.root = new Logger(Logger.ROOT_LOGGER_NAME, null, this);
        this.root.setLevel(DEBUG);
        loggerCache.put(Logger.ROOT_LOGGER_NAME, root);
        initEvaluatorMap();
        this.frameworkPackages = new ArrayList<String>();
    }
    
    public void putObject(String key, Object value) {
        objectMap.put(key, value);
    }
    
    void initEvaluatorMap() {
        putObject("EVALUATOR_MAP", new HashMap<String, String>());
    }
	
    public final Logger getLogger(final Class<?> clazz) {
        return getLogger(clazz.getName());
    }

	public Logger getLogger(String name) {
		// TODO Auto-generated method stub
		if (name == null) {
            throw new IllegalArgumentException("name argument cannot be null");
        }
		int i = 0;
        Logger logger = root;

        // check if the desired logger exists, if it does, return it
        // without further ado.
        Logger childLogger = (Logger) loggerCache.get(name);
        // if we have the child, then let us return it without wasting time
        if (childLogger != null) {
            return childLogger;
        }

        // if the desired logger does not exist, them create all the loggers
        // in between as well (if they don't already exist)
        String childName;
        while (true) {
            int h = LoggerNameUtil.getSeparatorIndexOf(name, i);
            if (h == -1) {
                childName = name;
            } else {
                childName = name.substring(0, h);
            }
            // move i left of the last point
            i = h + 1;
            synchronized (logger) {
                childLogger = logger.getChildByName(childName);
                if (childLogger == null) {
                    childLogger = logger.createChildByName(childName);
                    loggerCache.put(childName, childLogger);
                    incSize();
                }
            }
            logger = childLogger;
            if (h == -1) {
                return childLogger;
            }
        }
	}
	
	private void incSize() {
        size++;
    }
	
	int size() {
        return size;
    }
}
