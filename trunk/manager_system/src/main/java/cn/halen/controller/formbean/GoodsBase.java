package cn.halen.controller.formbean;

import java.util.Date;

import javax.validation.constraints.Min;

public class GoodsBase {
	private long id;
	private String hid; //���
	private String color;
	@Min(0)
	private int weight; //������ ��λ��g
	@Min(0)
	private int price; //���ۣ� ��λ����
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
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
}
