package com.jack.yiyao8.domain;
/**
 * 药品直达
 * @author Administrator
 *
 */
public class Drug {

	/**
	 * ": "吉松"
	 */
	private String name;
	/**
	 * ": "img/drug/20150313102024_173.jpg",
	 */
	private String image;
	/**
	 * ": 182,
	 */
	private int category;
	/**
	 * ": 653,
	 */
	private int count;
	private int fcount;
	private int rcount;
	/**
	 * ": "解热镇痛",
	 */
	private String PType;
	/**
	 * "鲁南贝特制药有限公司",
	 */
	private String factory;
	private int price;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
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

	public String getPType() {
		return PType;
	}

	public void setPType(String pType) {
		PType = pType;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Drug [name=" + name + ", image=" + image + ", category="
				+ category + ", count=" + count + ", fcount=" + fcount
				+ ", rcount=" + rcount + ", PType=" + PType + ", factory="
				+ factory + ", price=" + price + ", id=" + id + "]";
	}
}
