package com.jack.yiyao8.service;

import android.app.IntentService;
import android.content.Intent;

public class CheckAppVersionService extends IntentService{
	
	/**
	 * 必须定义一个无参数的构造方法，
	 * 并调用super(name)进行初始化，否则出错。 
	 */
	public CheckAppVersionService() {
		super("CheckAppVersionService");
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		// TODO Auto-generated method stub
		
	}

}
