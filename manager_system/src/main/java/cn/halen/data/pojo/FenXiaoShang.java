package cn.halen.data.pojo;

import java.util.Date;

public class FenXiaoShang {
	private int id; //自增id
	private String name; //姓名
	private String username; //登陆系统的用户名
	private String password; //登陆系统的密码
	private long deposit; //预存货款
	private float discount; //折扣
	private Date created;
	private Date modified;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getDeposit() {
		return deposit;
	}
	public void setDeposit(long deposit) {
		this.deposit = deposit;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
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
		return "FenXiaoShang [id=" + id + ", name=" + name + ", username="
				+ username + ", password=" + password + ", deposit=" + deposit
				+ ", discount=" + discount + ", created=" + created
				+ ", modified=" + modified + "]";
	}
	
}
