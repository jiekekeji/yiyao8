package com.jack.yiyao8.domain;
/**
 * 病状查找
 * @author Administrator
 */
public class SymptomFind {

	 private String name;
	 private String img;
	 private String place;
	 private int count;
	 private int rcount;
	 private int fcount;
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
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getRcount() {
		return rcount;
	}
	public void setRcount(int rcount) {
		this.rcount = rcount;
	}
	public int getFcount() {
		return fcount;
	}
	public void setFcount(int fcount) {
		this.fcount = fcount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "SymptomFind [name=" + name + ", img=" + img + ", place="
				+ place + ", count=" + count + ", rcount=" + rcount
				+ ", fcount=" + fcount + ", id=" + id + "]";
	}
}
