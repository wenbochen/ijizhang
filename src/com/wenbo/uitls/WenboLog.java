package com.wenbo.uitls;

import android.util.Log;

public class WenboLog {
	 static boolean IS_DEBUG = false;
	 static String TAG = "wenbo";
	/**
	 * debug日志,
	 * @param msg
	 */
	  public static final void debug(String msg) {
	        if (IS_DEBUG) {
	            Log.d(TAG, msg);
	        }
	    }
	  /**
	   * 打印log,info 日志
	   * @param msg
	   */
	  public static final void info(String msg) {
			  Log.i(TAG, msg);
	  }

}
