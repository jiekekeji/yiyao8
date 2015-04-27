package com.jack.yiyao8.domain;

/**
 * 一次查询的缓存信息
 * 
 * @author Administrator
 */
public class CacheInfo {

	private int id;
	/**
	 * 查询的时间
	 */
	private String time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "CacheInfo [id=" + id + ", time=" + time + "]";
	}
}
