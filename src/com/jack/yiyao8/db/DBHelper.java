package com.jack.yiyao8.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.jack.yiyao8.constant.DbTableContant;

public class DBHelper extends SQLiteOpenHelper {

	Itables tables=new ItableImple();
	
	public DBHelper(Context context) {
		super(context, DbTableContant.DB_NAME, null, DbTableContant.DB_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		tables.createTable(db, DbTableContant.HEALTH_NEWS_TABLE_NAME);
		tables.createTable(db, DbTableContant.HOT_WORD_TABLE_NAME);
		tables.createTable(db, DbTableContant.HEALTH_KNOWLEDGE_TABLE_NAME);
		
		tables.createTable(db, DbTableContant.HEALTH_ASK_TABLE_NAME);
		tables.createTable(db, DbTableContant.HEALTH_BOOK_TABLE_NAME);
		tables.createTable(db, DbTableContant.DRUG_NEWS_TABLE_NAME);
		tables.createTable(db, DbTableContant.HEALTH_FOOD_TABLE_NAME);
		tables.createTable(db, DbTableContant.FOOD_HEAL_TABLE_NAME);
		tables.createTable(db, DbTableContant.SICK_FIND_TABLE_NAME);
		tables.createTable(db, DbTableContant.SYMPTOM_FIND_TABLE_NAME);
		
		tables.createTable(db, DbTableContant.sick_check_TABLE_NAME);
		tables.createTable(db, DbTableContant.surgery_project_TABLE_NAME);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
