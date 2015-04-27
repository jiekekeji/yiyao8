package com.jack.yiyao8.dao.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.jack.yiyao8.constant.DbTableContant;
import com.jack.yiyao8.dao.CommonDao;
import com.jack.yiyao8.db.DBHelper;
import com.jack.yiyao8.domain.CacheInfo;
import com.jack.yiyao8.domain.QueryParameter;

public class CommonImple implements CommonDao<QueryParameter> {

	private SQLiteDatabase db;

	public CommonImple(Context context) {
		db = new DBHelper(context).getWritableDatabase();
	}

	@Override
	public long insert(QueryParameter parameter, String tableName) {
		ContentValues values = new ContentValues();
		values.put(DbTableContant.BaseTableColumns.QUERY_TYPE,
				parameter.getType());
		values.put(DbTableContant.BaseTableColumns.QUERY_LIMIT,
				parameter.getLimit());
		values.put(DbTableContant.BaseTableColumns.QUERY_PAGE,
				parameter.getPage());
		values.put(DbTableContant.BaseTableColumns.QUERY_TIME,
				parameter.getQueryTime());

		return db.insert(tableName, null, values);
	}

	@Override
	public int delete(long id, String tableName) {
		String[] whereArgs = { id + "" };

		return db.delete(DbTableContant.HEALTH_NEWS_TABLE_NAME,
				DbTableContant.BaseTableColumns.TABLE_ID + "=?", whereArgs);
	}

	@Override
	public CacheInfo query(QueryParameter parameter, String tableName) {
		CacheInfo cacheInfo=null;
		//需要查询的列
		String[] columns={DbTableContant.BaseTableColumns.TABLE_ID,DbTableContant.BaseTableColumns.QUERY_TIME};
		//查询条件
		StringBuilder sb=new StringBuilder();
		sb.append(DbTableContant.BaseTableColumns.QUERY_PAGE).append("=?")
		.append(" ").append("and").append(" ")
		.append(DbTableContant.BaseTableColumns.QUERY_LIMIT).append("=?")
		.append(" ").append("and").append(" ")
		.append(DbTableContant.BaseTableColumns.QUERY_TYPE).append("=?");
		//查询参数
		String[] selectionArgs={parameter.getPage()+"",parameter.getLimit()+"",parameter.getType()};
		Cursor cursor=db.query(tableName, columns, sb.toString(), selectionArgs, null, null, null);
		
		if (cursor.moveToNext()) {
			cacheInfo=new CacheInfo();
			cacheInfo.setId(cursor.getColumnIndex(DbTableContant.BaseTableColumns.TABLE_ID));
			cacheInfo.setId(cursor.getColumnIndex(DbTableContant.BaseTableColumns.QUERY_TIME));
		}
		return cacheInfo;
	}
}
