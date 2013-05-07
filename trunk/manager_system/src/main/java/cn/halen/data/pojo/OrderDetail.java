package cn.halen.data.pojo;

import java.util.Date;

public class OrderDetail {
	private long id; //自增id
	private Order order; //指向order表的id
	private Goods goods; //指向goods表的id
	private int thity_four;
	private int thity_five;
	private int thity_six;
	private int thity_seven;
	private int thity_eight;
	private int thity_nine;
	private int forty;
	private int forty_one;
	private int forty_two;
	private int forty_three;
	private int forty_four;
	private int forty_five;
	private int total_weight; //所有鞋子的总重量
	private Date created;
	private Date modified;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
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
	public int getTotal_weight() {
		return total_weight;
	}
	public void setTotal_weight(int total_weight) {
		this.total_weight = total_weight;
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
		return "OrderDetail [id=" + id + ", order=" + order + ", goods="
				+ goods + ", thity_four=" + thity_four + ", thity_five="
				+ thity_five + ", thity_six=" + thity_six + ", thity_seven="
				+ thity_seven + ", thity_eight=" + thity_eight
				+ ", thity_nine=" + thity_nine + ", forty=" + forty
				+ ", forty_one=" + forty_one + ", forty_two=" + forty_two
				+ ", forty_three=" + forty_three + ", forty_four=" + forty_four
				+ ", forty_five=" + forty_five + ", total_weight="
				+ total_weight + ", created=" + created + ", modified="
				+ modified + "]";
	}
	
}
