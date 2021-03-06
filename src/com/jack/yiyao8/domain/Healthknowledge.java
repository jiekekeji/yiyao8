package com.jack.yiyao8.domain;

/**
 * 健康知识
 * 
 * @author Administrator
 */
public class Healthknowledge {

	private String title;
	private String img;
	private int count;
	private int fcount;
	private int rcount;
	private String author;
	private int loreclass;
	private String className;
	private String md;
	private String time;
	private long id;
	
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getLoreclass() {
		return loreclass;
	}
	public void setLoreclass(int loreclass) {
		this.loreclass = loreclass;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMd() {
		return md;
	}
	public void setMd(String md) {
		this.md = md;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Healthknowledge [title=" + title + ", img=" + img + ", count="
				+ count + ", fcount=" + fcount + ", rcount=" + rcount
				+ ", author=" + author + ", loreclass=" + loreclass
				+ ", className=" + className + ", md=" + md + ", time=" + time
				+ ", id=" + id + "]";
	}
}
