package com.jack.yiyao8.domain;
/**
 * 健康图书推荐
 * @author Administrator
 *
 */
public class HealthBook {
	/**
	 * 书名
	 */
	private String name;
	// "img/book/00002874.jpg",
	private String img;
	// "江苏人民出版社",
	private String from;
	// ": "麦玲玲",
	private String author;
	
	private String summary;
	
	private String bookclass;
	
	private String count;
	
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

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getBookclass() {
		return bookclass;
	}

	public void setBookclass(String bookclass) {
		this.bookclass = bookclass;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
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
		return "HealthBook [name=" + name + ", img=" + img + ", from=" + from
				+ ", author=" + author + ", summary=" + summary
				+ ", bookclass=" + bookclass + ", count=" + count + ", fcount="
				+ fcount + ", rcount=" + rcount + ", id=" + id + "]";
	}
}
