package cn.halen.data.pojo;

import java.util.Date;

public class OrderDetail {
	private long id; //自增id
	private long order_id;
	private long sku_id;
	private int quantity;
	private int price;
	private float discount;
	private int weight;
	private int huokuan;
	private int status;
	private Date created;
	private Date modified;
	
	private Order order; //指向order表的id
	private Sku sku; //指向sku表的id
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
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Sku getSku() {
		return sku;
	}
	public void setSku(Sku sku) {
		this.sku = sku;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
	public int getHuokuan() {
		return huokuan;
	}
	public void setHuokuan(int huokuan) {
		this.huokuan = huokuan;
	}
	
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	public long getSku_id() {
		return sku_id;
	}
	public void setSku_id(long sku_id) {
		this.sku_id = sku_id;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", order_id=" + order_id + ", sku_id="
				+ sku_id + ", quantity=" + quantity + ", price=" + price
				+ ", discount=" + discount + ", weight=" + weight
				+ ", huokuan=" + huokuan + ", status=" + status + ", created="
				+ created + ", modified=" + modified + ", order=" + order
				+ ", sku=" + sku + "]";
	}
}
