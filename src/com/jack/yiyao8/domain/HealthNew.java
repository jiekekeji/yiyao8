package com.jack.yiyao8.domain;

/**
 * 单条健康咨询概要
 * 
 * @author Administrator
 *
 */
public class HealthNew {

	private long id;
	/**
	 * 资讯的标题
	 */
	private String title;
	/**
	 * 资讯的所属分类
	 */
	private String tag;
	private int count;
	private int fcount;
	private int rcount;
	/**
	 * 资讯的作者
	 */
	private String author;
	private int focal;
	private String md;
	/**
	 * 资讯的创建时间
	 */
	private String time;
	/**
	 * 图片地址，需加上主机名
	 */
	private String img;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
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

	public int getFocal() {
		return focal;
	}

	public void setFocal(int focal) {
		this.focal = focal;
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

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "SingleNews [id=" + id + ", title=" + title + ", tag=" + tag
				+ ", count=" + count + ", fcount=" + fcount + ", rcount="
				+ rcount + ", author=" + author + ", focal=" + focal + ", md="
				+ md + ", time=" + time + ", img=" + img + "]";
	}

}
