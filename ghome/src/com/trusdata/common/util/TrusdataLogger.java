package com.trusdata.common.util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * 开发日志处理类.
 * 
 * @author JBDING
 */
public class TrusdataLogger {
	private Logger logger = null;
	// 日志信息
	private String logInfo = null;

	// 当前对象
	StackTraceElement[] items = null;

	// 当前对象的行数
	int line = 0;

	// 当前对象的方法名
	String MethodName = null;

	/**
	 * 构造函数.
	 * 
	 * @param clsName
	 *            类名
	 */

	public TrusdataLogger(Class<?> clazz) {
		this.logger = LogManager.getLogger(clazz);
	}

	/**
	 * 开始日志.
	 */
	public void enter() {
		// 获取当前对象
		this.items = Thread.currentThread().getStackTrace();

		// 获取行数
		this.line = this.items[2].getLineNumber();

		// 获取方法名
		this.MethodName = this.items[2].getMethodName();

		this.logInfo = MethodName + ":" + line;
		this.logInfo = String.format("%-20s - %s", this.logInfo) + " IS START.";

		// 输出日志
		this.logger.info(this.logInfo);
	}

	/**
	 * Debug日志.
	 * 
	 * @param message
	 *            日志信息
	 */
	public void debug(String msg) {
		// 获取当前对象
		this.items = Thread.currentThread().getStackTrace();

		// 获取行数
		this.line = this.items[2].getLineNumber();

		// 获取方法名
		this.MethodName = this.items[2].getMethodName();

		this.logInfo = MethodName + ":" + line;
		this.logInfo = String.format("%-20s - %s", this.logInfo, msg);

		// 输出日志
		logger.debug(this.logInfo);
	}

	/**
	 * Error日志.
	 * 
	 * @param errormessage
	 *            错误信息
	 */
	public void error(String msg) {
		// 获取当前对象
		this.items = Thread.currentThread().getStackTrace();

		// 获取行数
		this.line = this.items[2].getLineNumber();

		// 获取方法名
		this.MethodName = this.items[2].getMethodName();

		this.logInfo = MethodName + ":" + line;
		this.logInfo = String.format("%-20s - %s", this.logInfo, msg);

		// 输出日志
		logger.error(this.logInfo);
	}

	/**
	 * 致命错误
	 * 
	 * @param fatalmessage
	 *            错误信息
	 */
	public void fatal(String msg) {
		// 获取当前对象
		this.items = Thread.currentThread().getStackTrace();

		// 获取行数
		this.line = this.items[2].getLineNumber();

		// 获取方法名
		this.MethodName = this.items[2].getMethodName();

		this.logInfo = MethodName + ":" + line;
		this.logInfo = String.format("%-20s - %s", this.logInfo, msg);

		// 输出日志
		logger.fatal(this.logInfo);
	}

	/**
	 * 日志结束.
	 * 
	 * @param methodName
	 *            函数名
	 */
	public void end() {
		// 获取当前对象
		this.items = Thread.currentThread().getStackTrace();

		// 获取行数
		this.line = this.items[2].getLineNumber();

		// 获取方法名
		this.MethodName = this.items[2].getMethodName();

		this.logInfo = MethodName + ":" + line;
		this.logInfo = String.format("%-20s - %s", this.logInfo) + " IS END.";

		// 输出日志
		this.logger.info(this.logInfo);
	}
}
