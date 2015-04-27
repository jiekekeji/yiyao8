package com.jack.yiyao8.domain;
/**
 * 热词
 * @author Administrator
 */
public class HotWord{

	private String title;
	private String img;
	private String keywords;
	private int count;
	private int fcount;
	private int rcount;
	private int id;
	private String from;
	private String time;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getFcount() {
		return fcount;
	}
	public void setFcount(int fcount) {
		this.fcount = fcount;
	}
	public int getRcount() {
		return rcount;
	}
	public void setRcount(int rcount) {
		this.rcount = rcount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "HotWord [title=" + title + ", img=" + img + ", keywords="
				+ keywords + ", count=" + count + ", fcount=" + fcount
				+ ", rcount=" + rcount + ", id=" + id + ", from=" + from
				+ ", time=" + time + "]";
	}
	
}
