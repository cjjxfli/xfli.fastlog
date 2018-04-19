package com.xfli.fastlog;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.slf4j.Marker;

public final class Logger implements org.slf4j.Logger,Serializable {
    // The effective levelInt is the assigned levelInt and if null, a levelInt is
    // inherited form a parent.
    transient private int effectiveLevelInt;
    /**
     * The parent of this category. All categories have at least one ancestor
     * which is the root category.
     */
    transient private Logger parent;
	final transient LoggerContext loggerContext;
    /**
     * The name of this logger
     */
    private String name;
    /**
     * The children of this logger. A logger may have zero or more children.
     */
    transient private List<Logger> childrenList;

	public Logger(String rootLoggerName, Object object, LoggerContext loggerContext) {
		// TODO Auto-generated constructor stub
		this.name = rootLoggerName;
        this.parent = (Logger)object;
        this.loggerContext = loggerContext;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return "xfli.fastlog";
	}

	public boolean isTraceEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public void trace(String msg) {
		// TODO Auto-generated method stub
		System.out.println("trace");
	}

	public void trace(String format, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("trace");
	}

	public void trace(String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		System.out.println("trace");
	}

	public void trace(String format, Object... arguments) {
		// TODO Auto-generated method stub
		System.out.println("trace");
	}

	public void trace(String msg, Throwable t) {
		// TODO Auto-generated method stub
		System.out.println("trace");
	}

	public boolean isTraceEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	public void trace(Marker marker, String msg) {
		// TODO Auto-generated method stub
		System.out.println("trace");
	}

	public void trace(Marker marker, String format, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("trace");
	}

	public void trace(Marker marker, String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		System.out.println("trace");
	}

	public void trace(Marker marker, String format, Object... argArray) {
		// TODO Auto-generated method stub
		System.out.println("trace");
	}

	public void trace(Marker marker, String msg, Throwable t) {
		// TODO Auto-generated method stub
		System.out.println("trace");
	}

	public boolean isDebugEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public void debug(String msg) {
		// TODO Auto-generated method stub
		System.out.println("debug");
	}

	public void debug(String format, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("debug");
	}

	public void debug(String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		System.out.println("debug");
	}

	public void debug(String format, Object... arguments) {
		// TODO Auto-generated method stub
		System.out.println("debug");
	}

	public void debug(String msg, Throwable t) {
		// TODO Auto-generated method stub
		System.out.println("debug");
	}

	public boolean isDebugEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	public void debug(Marker marker, String msg) {
		// TODO Auto-generated method stub
		System.out.println("debug");
	}

	public void debug(Marker marker, String format, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("debug");
	}

	public void debug(Marker marker, String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		System.out.println("debug");
	}

	public void debug(Marker marker, String format, Object... arguments) {
		// TODO Auto-generated method stub
		System.out.println("debug");
	}

	public void debug(Marker marker, String msg, Throwable t) {
		// TODO Auto-generated method stub
		System.out.println("debug");
	}

	public boolean isInfoEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public void info(String msg) {
		// TODO Auto-generated method stub
		System.out.println("info");
	}

	public void info(String format, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("info");
	}

	public void info(String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		System.out.println("info");
	}

	public void info(String format, Object... arguments) {
		// TODO Auto-generated method stub
		System.out.println("info");
	}

	public void info(String msg, Throwable t) {
		// TODO Auto-generated method stub
		System.out.println("info");
	}

	public boolean isInfoEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	public void info(Marker marker, String msg) {
		// TODO Auto-generated method stub
		System.out.println("info");
	}

	public void info(Marker marker, String format, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("info");
	}

	public void info(Marker marker, String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		System.out.println("info");
	}

	public void info(Marker marker, String format, Object... arguments) {
		// TODO Auto-generated method stub
		System.out.println("info");
	}

	public void info(Marker marker, String msg, Throwable t) {
		// TODO Auto-generated method stub
		System.out.println("info");
	}

	public boolean isWarnEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public void warn(String msg) {
		// TODO Auto-generated method stub
		System.out.println("warn");
	}

	public void warn(String format, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("warn");
	}

	public void warn(String format, Object... arguments) {
		// TODO Auto-generated method stub
		System.out.println("warn");
	}

	public void warn(String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		System.out.println("warn");
	}

	public void warn(String msg, Throwable t) {
		// TODO Auto-generated method stub
		System.out.println("warn");
	}

	public boolean isWarnEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	public void warn(Marker marker, String msg) {
		// TODO Auto-generated method stub
		System.out.println("warn");
	}

	public void warn(Marker marker, String format, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("warn");
	}

	public void warn(Marker marker, String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		System.out.println("warn");
	}

	public void warn(Marker marker, String format, Object... arguments) {
		// TODO Auto-generated method stub
		System.out.println("warn");
	}

	public void warn(Marker marker, String msg, Throwable t) {
		// TODO Auto-generated method stub
		System.out.println("warn");
	}

	public boolean isErrorEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public void error(String msg) {
		// TODO Auto-generated method stub
		System.out.println("error");
	}

	public void error(String format, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("error");
	}

	public void error(String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		System.out.println("error");
	}

	public void error(String format, Object... arguments) {
		// TODO Auto-generated method stub
		System.out.println("error");
	}

	public void error(String msg, Throwable t) {
		// TODO Auto-generated method stub
		System.out.println("error");
	}

	public boolean isErrorEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	public void error(Marker marker, String msg) {
		// TODO Auto-generated method stub
		System.out.println("error");
	}

	public void error(Marker marker, String format, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("error");
	}

	public void error(Marker marker, String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		System.out.println("error");
	}

	public void error(Marker marker, String format, Object... arguments) {
		// TODO Auto-generated method stub
		System.out.println("error");
	}

	public void error(Marker marker, String msg, Throwable t) {
		// TODO Auto-generated method stub
		System.out.println("error");
	}

	public void setLevel(int debug) {
		// TODO Auto-generated method stub
		
	}
	
    Logger getChildByName(final String childName) {
        if (childrenList == null) {
            return null;
        } else {
            int len = this.childrenList.size();
            for (int i = 0; i < len; i++) {
                final Logger childLogger_i = (Logger) childrenList.get(i);
                final String childName_i = childLogger_i.getName();

                if (childName.equals(childName_i)) {
                    return childLogger_i;
                }
            }
            // no child found
            return null;
        }
    }

    /**
     * The default size of child list arrays. The JDK 1.5 default is 10. We use a
     * smaller value to save a little space.
     */

    Logger createChildByName(final String childName) {
        int i_index = LoggerNameUtil.getSeparatorIndexOf(childName, this.name.length() + 1);
        if (i_index != -1) {
            throw new IllegalArgumentException("For logger [" + this.name + "] child name [" + childName
                            + " passed as parameter, may not include '.' after index" + (this.name.length() + 1));
        }

        if (childrenList == null) {
            childrenList = new CopyOnWriteArrayList<Logger>();
        }
        Logger childLogger;
        childLogger = new Logger(childName, this, this.loggerContext);
        childrenList.add(childLogger);
        childLogger.effectiveLevelInt = this.effectiveLevelInt;
        return childLogger;
    }
}
