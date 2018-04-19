package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

import com.xfli.fastlog.LoggerContext;


public class StaticLoggerBinder implements LoggerFactoryBinder {

	private static StaticLoggerBinder SINGLETON = new StaticLoggerBinder();
    
    private boolean initialized = false;
    private LoggerContext defaultLoggerContext = new LoggerContext();
    
    private StaticLoggerBinder() {
    }

    public static StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }

    static void reset() {
        SINGLETON = new StaticLoggerBinder();
        SINGLETON.init();
    }

    static {
        SINGLETON.init();
    }
    
    void init(){
    	initialized = true;
    }
	
	public ILoggerFactory getLoggerFactory() {
        if (!initialized) {
            return defaultLoggerContext;
        }
        return defaultLoggerContext;
	}

	public String getLoggerFactoryClassStr() {
		return this.getClass().getName();
	}

}
