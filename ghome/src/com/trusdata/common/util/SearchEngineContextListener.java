package com.trusdata.common.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 
 * @author JBDING
 *
 */
public class SearchEngineContextListener implements ServletContextListener {


    private Thread thread = null;
    private IndexProcessor runnable = null;

    @Override
    public void contextInitialized(ServletContextEvent event) {
        runnable = new IndexProcessor();
        thread = new Thread(runnable);
        thread.start();
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        if (thread != null) {
            runnable.terminate();
            try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
}
