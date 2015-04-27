package com.jack.yiyao8.dao;

import com.jack.yiyao8.domain.CacheInfo;

public interface CommonDao<QueryParameter> {

	/**
	 * 将记录插入到表中
	 * 
	 * @param TableName
	 *            需要插入的表名
	 * @return long
	 */
	long insert(QueryParameter parameter, String tableName);

	/**
	 * 删除表中的记录
	 * 
	 * @param id
	 *            需要删除记录的id
	 * @param TableName
	 *            表名
	 * @return int
	 */
	int delete(long id, String tableName);

	/**
	 * 查询该次请求的缓存信息
	 * 
	 * @param parameter
	 * @param TableName
	 *            表名
	 * @return CacheInfo
	 */
	CacheInfo query(QueryParameter parameter, String tableName);

}
