package com.jack.yiyao8.domain;
/**
 * 健康一问
 * @author Administrator
 *
 */
public class HealthAsk {

    private String title;
    private int askclass;
    private String classname;
    private int count;
    private int scount;
    private int id;
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAskclass() {
		return askclass;
	}
	public void setAskclass(int askclass) {
		this.askclass = askclass;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getScount() {
		return scount;
	}
	public void setScount(int scount) {
		this.scount = scount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "HealthAsk [title=" + title + ", askclass=" + askclass
				+ ", classname=" + classname + ", count=" + count + ", scount="
				+ scount + ", id=" + id + "]";
	}
}
