/**
 * Project Name:dubbo-parent
 * <p>
 * File Name:Log4j2Logger
 * <p>
 * Package Name:com.alibaba.dubbo.common.logger.log4j2
 * <p>
 * Date:2016/10/1 22:09
 * <p>
 * Copyright (c) 2016, clxhhsy@126.com All Rights Reserved.
 */
package com.alibaba.dubbo.common.logger.log4j2;


import com.alibaba.dubbo.common.logger.Logger;


/**
 * ClassName: Log4j2Logger <br/>
 *
 * date: 2016/10/1 22:09 <br/>
 *
 * @author lichen
 * @version 1.0
 * @since JDK 1.6
 */
public class Log4j2Logger implements Logger
{
//    private static final String FQCN = FailsafeLogger.class.getName();

    private final org.slf4j.Logger logger;

    public Log4j2Logger(org.slf4j.Logger logger)
    {
        this.logger = logger;
    }

    @Override
    public void trace(String msg)
    {
        logger.trace(msg);
    }

    @Override
    public void trace(Throwable e)
    {
        logger.trace(e == null ? null : e.getMessage());
    }

    @Override
    public void trace(String msg, Throwable e)
    {
        logger.trace(msg, e);
    }

    @Override
    public void debug(String msg)
    {
        logger.debug(msg);
    }

    @Override
    public void debug(Throwable e)
    {
        logger.debug(e == null ? null : e.getMessage());
    }

    @Override
    public void debug(String msg, Throwable e)
    {
        logger.debug(msg, e);
    }

    @Override
    public void info(String msg)
    {
        logger.info(msg);
    }

    @Override
    public void info(Throwable e)
    {
        logger.info(e == null ? null : e.getMessage());
    }

    @Override
    public void info(String msg, Throwable e)
    {
        logger.info(msg, e);
    }

    @Override
    public void warn(String msg)
    {
        logger.warn(msg);
    }

    @Override
    public void warn(Throwable e)
    {
        logger.warn(e == null ? null : e.getMessage());
    }

    @Override
    public void warn(String msg, Throwable e)
    {
        logger.warn(msg, e);
    }

    @Override
    public void error(String msg)
    {
        logger.error(msg);
    }

    @Override
    public void error(Throwable e)
    {
        logger.error(e == null ? null : e.getMessage());
    }

    @Override
    public void error(String msg, Throwable e)
    {
        logger.error(msg, e);
    }

    @Override
    public boolean isTraceEnabled()
    {
        return logger.isTraceEnabled();
    }

    @Override
    public boolean isDebugEnabled()
    {
        return logger.isDebugEnabled();
    }

    @Override
    public boolean isInfoEnabled()
    {
        return logger.isInfoEnabled();
    }

    @Override
    public boolean isWarnEnabled()
    {
        return logger.isWarnEnabled();
    }

    @Override
    public boolean isErrorEnabled()
    {
        return logger.isErrorEnabled();
    }
}
