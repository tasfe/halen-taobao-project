package cn.halen.data.pojo;

import java.util.Date;

public class Goods {
	private long id;
	private String hid; //款号
	private String color;
	private int weight; //重量， 单位：g
	private int price; //单价， 单位：分
	private int thity_four = 0;
	private int thity_five = 0;
	private int thity_six = 0;
	private int thity_seven = 0;
	private int thity_eight = 0;
    private int thity_nine = 0;
	private int forty = 0;
	private int forty_one = 0;
	private int forty_two = 0;
	private int forty_three = 0;
	private int forty_four = 0;
	private int forty_five = 0;
	private Date created;
	private Date modified;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getHid() {
		return hid;
	}
	public void setHid(String hid) {
		this.hid = hid;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getThity_four() {
		return thity_four;
	}
	public void setThity_four(int thity_four) {
		this.thity_four = thity_four;
	}
	public int getThity_five() {
		return thity_five;
	}
	public void setThity_five(int thity_five) {
		this.thity_five = thity_five;
	}
	public int getThity_six() {
		return thity_six;
	}
	public void setThity_six(int thity_six) {
		this.thity_six = thity_six;
	}
	public int getThity_seven() {
		return thity_seven;
	}
	public void setThity_seven(int thity_seven) {
		this.thity_seven = thity_seven;
	}
	public int getThity_eight() {
		return thity_eight;
	}
	public void setThity_eight(int thity_eight) {
		this.thity_eight = thity_eight;
	}
	public int getThity_nine() {
		return thity_nine;
	}
	public void setThity_nine(int thity_nine) {
		this.thity_nine = thity_nine;
	}
	public int getForty() {
		return forty;
	}
	public void setForty(int forty) {
		this.forty = forty;
	}
	public int getForty_one() {
		return forty_one;
	}
	public void setForty_one(int forty_one) {
		this.forty_one = forty_one;
	}
	public int getForty_two() {
		return forty_two;
	}
	public void setForty_two(int forty_two) {
		this.forty_two = forty_two;
	}
	public int getForty_three() {
		return forty_three;
	}
	public void setForty_three(int forty_three) {
		this.forty_three = forty_three;
	}
	public int getForty_four() {
		return forty_four;
	}
	public void setForty_four(int forty_four) {
		this.forty_four = forty_four;
	}
	public int getForty_five() {
		return forty_five;
	}
	public void setForty_five(int forty_five) {
		this.forty_five = forty_five;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", hid=" + hid + ", color=" + color
				+ ", weight=" + weight + ", price=" + price + ", thity_four="
				+ thity_four + ", thity_five=" + thity_five + ", thity_six="
				+ thity_six + ", thity_seven=" + thity_seven + ", thity_eight="
				+ thity_eight + ", thity_nine=" + thity_nine + ", forty="
				+ forty + ", forty_one=" + forty_one + ", forty_two="
				+ forty_two + ", forty_three=" + forty_three + ", forty_four="
				+ forty_four + ", forty_five=" + forty_five + ", created="
				+ created + ", modified=" + modified + "]";
	}
}
