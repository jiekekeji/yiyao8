package com.jack.yiyao8.db;

import android.database.sqlite.SQLiteDatabase;

import com.jack.yiyao8.constant.DbTableContant;

public class ItableImple implements Itables {

	@Override
	public void createTable(SQLiteDatabase db, String tableName) {
		String[] columns = { DbTableContant.BaseTableColumns.TABLE_ID,
				DbTableContant.BaseTableColumns.QUERY_PAGE,
				DbTableContant.BaseTableColumns.QUERY_LIMIT,
				DbTableContant.BaseTableColumns.QUERY_TYPE,
				DbTableContant.BaseTableColumns.QUERY_ID,
				DbTableContant.BaseTableColumns.QUERY_TIME };

		String[] types = { "integer", "char(10)", "char(3)", "char(3)",
				"char(10)", "varchar(20)" };

		String[] defins = { "primary key autoincrement" };

		String sql = createTableSql(tableName, columns, types, defins);

		db.execSQL(sql);

	}

	/**
	 * 拼接建表语句
	 * 
	 * @param tableName
	 *            表名
	 * @param columns
	 *            字段
	 * @param types
	 *            字段的类型
	 * @param defins
	 *            字段的限制条件
	 * @return String sql
	 */
	private String createTableSql(String tableName, String[] columns,
			String[] types, String[] defins) {
		StringBuilder sql = new StringBuilder();
		sql.append("create table").append(" ").append(tableName).append("(");
		for (int i = 0; i < columns.length; i++) {

			sql.append(columns[i]).append(" ").append(types[i]);
			if (defins != null && defins.length > i) {

				if (i == columns.length - 1) {
					sql.append(" ").append(defins[i]).append(");");
				} else {
					sql.append(" ").append(defins[i]).append(",");
				}
			} else {
				if (i == columns.length - 1) {
					sql.append(");");
				} else {
					sql.append(" ").append(",");
				}
			}
		}
		return sql.toString();
	}

}
