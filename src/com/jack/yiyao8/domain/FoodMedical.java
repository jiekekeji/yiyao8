package com.jack.yiyao8.domain;
/**
 * 食疗大全
 * @author Administrator
 */
public class FoodMedical {

    private String name;
    private String img;
    private String menu;
    private String bar;
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
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getBar() {
		return bar;
	}
	public void setBar(String bar) {
		this.bar = bar;
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
		return "FoodMedical [name=" + name + ", img=" + img + ", menu=" + menu
				+ ", bar=" + bar + ", count=" + count + ", fcount=" + fcount
				+ ", rcount=" + rcount + ", id=" + id + "]";
	}
}
