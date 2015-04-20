package com.jack.yiyao8;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.jack.yiyao8.activity.IndexActivity;
import com.jack.yiyao8.activity.NavActivity;
import com.jack.yiyao8.activity.base.BaseActivity;
import com.jack.yiyao8.constant.FileNameContant;
import com.jack.yiyao8.service.CheckAppVersionService;

/**
 * app启动的第一个activity
 * 
 * @author Administrator
 */
public class AppLaunchActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_launch);
		checkAppVersion();
		
		initView();
	}

	/**
	 * 开启一个服务在后台去检测app版本
	 */
	private void checkAppVersion() {
		Intent intent=new Intent(this, CheckAppVersionService.class);
		startService(intent);
	}


	private void initView() {
		ImageView iv=(ImageView) findViewById(R.id.app_luanch_img);
		Animation anim = AnimationUtils.loadAnimation(this, R.anim.app_luanch_amin);
		iv.startAnimation(anim);
		anim.setAnimationListener(new MyAnimationListener());
	}
	
	/**
	 * 动画播放监听 
	 * @author Administrator
	 */
	class MyAnimationListener implements AnimationListener{

		@Override
		public void onAnimationStart(Animation animation) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onAnimationEnd(Animation animation) {
			// TODO Auto-generated method stub
			skip();
		}



		@Override
		public void onAnimationRepeat(Animation animation) {
			// TODO Auto-generated method stub
			
		}
		
	}

	/**
	 * 跳转到相应页面
	 */
	private void skip() {
		if (isFirstStart()) {
			openNavActivity();
		}else {
			openIndexActivity();
		}
		
	}
	
	/**
	 * 检测是否是第一次登陆
	 */
	private boolean isFirstStart() {
		SharedPreferences sp = getSharedPreferences(
				FileNameContant.AppLaunchInfo.LAUNCH_LFILE_NAME,
				Activity.MODE_PRIVATE);
		
		return sp.getBoolean(
				FileNameContant.AppLaunchInfo.IS_FIRST_LUANCH, false);

	}
	
	/**
	 * 第一次开启app
	 * 进入导航页
	 */
	private void openNavActivity(){
		Intent i=new Intent(this, NavActivity.class);
		startActivity(i);
		this.finish();
	}
	
	/**
	 * 进入首页
	 */
	private void openIndexActivity(){
		Intent i=new Intent(this, IndexActivity.class);
		startActivity(i);
		this.finish();
	}
	
}
