package com.jack.yiyao8.domain;

/**
 * 健康咨询的查询参数
 * 
 * @author Administrator
 */
public class QueryParameter {

	/**
	 * 请求页数，默认是1
	 */
	private static final int DEFAULT_PAGE = 1;
	/**
	 * 每页返回的条数，默认是20
	 */
	private static final int DEFAULT_LIMIT = 20;
	/**
	 * 排序方式 id：最新时间，count：访问数，默认是id，按最新时间。
	 */
	private static final String DEFAULT_TYPE = "id";
	/**
	 * id：这里是指新闻分类的ID 默认为 0 ，也就是全部。
	 */
	private static final long NEWSCLASS_ID = 0;
	/**
	 * 请求的页数，第几页
	 */
	private int page;
	/**
	 * 每页返回的条数
	 */
	private int limit;
	/**
	 * 排序方式 id：最新时间，count：访问数，默认是id，按最新时间。
	 */
	private String type;
	/**
	 * id：这里是指新闻分类的ID 默认为 null ，也就是全部。
	 */
	private long id;
	/**
	 * 查询的时间
	 */
	private long queryTime;

	public QueryParameter() {
		this.page = DEFAULT_PAGE;
		this.limit = DEFAULT_LIMIT;
		this.type = DEFAULT_TYPE;
		this.id = NEWSCLASS_ID;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getQueryTime() {
		return queryTime;
	}

	public void setQueryTime(long queryTime) {
		this.queryTime = queryTime;
	}

	@Override
	public String toString() {
		return "HealthNewQueryParameter [page=" + page + ", limit=" + limit
				+ ", type=" + type + ", id=" + id + ", queryTime=" + queryTime
				+ "]";
	}

}
