package com.jack.yiyao8.domain;
/**
 * 健康食谱
 * @author Administrator
 *
 */
public class CookBook {

	/**
	 * ": "青花椒炖童子鸡",
	 */
	private String name;
	private String img;
	private String tag;
	private String food;
	private int count;
	private int fcount;
	private int rcount;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
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
	@Override
	public String toString() {
		return "CookBook [name=" + name + ", img=" + img + ", tag=" + tag
				+ ", food=" + food + ", count=" + count + ", fcount=" + fcount
				+ ", rcount=" + rcount + ", id=" + id + "]";
	}
}
