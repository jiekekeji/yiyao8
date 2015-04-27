package com.jack.yiyao8.activity;

import android.os.Bundle;
import android.util.Log;

import com.jack.yiyao8.R;
import com.jack.yiyao8.activity.base.BaseActivity;
import com.jack.yiyao8.constant.DbTableContant;
import com.jack.yiyao8.dao.CommonDao;
import com.jack.yiyao8.dao.impl.CommonImple;
import com.jack.yiyao8.domain.CacheInfo;
import com.jack.yiyao8.domain.QueryParameter;
/**
 * 首页
 * @author Administrator
 */
public class IndexActivity extends BaseActivity {

	protected static final String TAG = IndexActivity.class.getName();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_index);
		CommonDao<QueryParameter> dao=new CommonImple(this);
		QueryParameter parameter=new QueryParameter();
		parameter.setLimit(5);
		parameter.setPage(6);
		
		dao.insert(parameter, DbTableContant.DRUG_NEWS_TABLE_NAME);
		
		CacheInfo info=dao.query(parameter, DbTableContant.DRUG_NEWS_TABLE_NAME);
		if (info!=null) {
			Log.i(TAG, info.getId()+"");
		}
		
	
	}



	

	
	


}
