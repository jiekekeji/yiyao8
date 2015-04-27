package com.jack.yiyao8.net;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
/**
 * 网络请求队列
 * @author Administrator
 */
public class JsonQueue{

	private static RequestQueue mQueue=null;
	
	public static RequestQueue getQueue(Context c){
		if (mQueue==null) {
			synchronized (JsonQueue.class) {
				if (mQueue==null) {
					mQueue=Volley.newRequestQueue(c);
				}
			}
		}
		
		return mQueue;
	}
	
}
