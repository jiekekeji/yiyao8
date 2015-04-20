package com.jack.yiyao8.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

/**
 * 与app相关的的辅助类
 * @author Administrator
 *
 */
public class AppUtils {

	/**
	 * 获取应用程序版本名称信息
	 * @param context
	 * @return String 成功返回app当前版本号，否则返回null
	 */
	public static String getVersionName(Context context) {
		try {
			PackageManager packageManager = context.getPackageManager();
			PackageInfo packageInfo = packageManager.getPackageInfo(
					context.getPackageName(), 0);
			return packageInfo.versionName;

		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
