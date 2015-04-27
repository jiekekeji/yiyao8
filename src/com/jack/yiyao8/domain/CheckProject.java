package com.jack.yiyao8.domain;
/**
 * 检查项目
 * @author Administrator
 */
public class CheckProject {

	private String name;
	private String img;
	private String menu;
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

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
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
		return "CheckProject [name=" + name + ", img=" + img + ", menu=" + menu
				+ ", count=" + count + ", rcount=" + rcount + ", fcount="
				+ fcount + ", id=" + id + "]";
	}
}
