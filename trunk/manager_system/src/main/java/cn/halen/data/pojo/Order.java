package cn.halen.data.pojo;

import java.util.Date;
import java.util.List;

import cn.halen.data.OrderStatus;

public class Order {
	private long id; //自增id
	private long tao_id;
	private String name; //客户姓名
	private String phone; //客户联系电话
	private String address; //联系地址
	private String postcode; //邮编
	private String delivery;
	private int delivery_money;
	private int template_id;
	private int total_weight; //所有鞋子的总重量
	private int goods_count;
	private int huokuan; //货款
	private int fenxiaoshang_id;
	private int status;
	private Date created;
	private Date modified;
	
	private Template template; //快递费
	private FenXiaoShang fenxiaoshang; //分销商
	private OrderStatus orderStatus; //表示订单状态
	private List<OrderDetail> list;
	
	public void computeDeliveryMoney() {
		int money = 0;
		if(total_weight<=template.getBase()) {
			money = template.getBase();
		} else {
			int added = (total_weight-template.getBase())/1000 + 1;
			money = template.getBase() + added*template.getPerAdd();
		}
		delivery_money = money;
	}
	
	public void addHuokuan(int huokuan) {
		this.huokuan += huokuan;
	}
	public void cutHuokuan(int huokuan) {
		this.huokuan -= huokuan;
	}
	public void addWeight(int weight) {
		total_weight += weight;
	}
	
	public void cutWeight(int weight) {
		total_weight -= weight;
	}
	
	public List<OrderDetail> getList() {
		return list;
	}
	public void setList(List<OrderDetail> list) {
		this.list = list;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public int getTotal_weight() {
		return total_weight;
	}
	public void setTotal_weight(int total_weight) {
		this.total_weight = total_weight;
	}
	public int getHuokuan() {
		return huokuan;
	}
	public void setHuokuan(int huokuan) {
		this.huokuan = huokuan;
	}
	public FenXiaoShang getFenxiaoshang() {
		return fenxiaoshang;
	}
	public void setFenxiaoshang(FenXiaoShang fenxiaoshang) {
		this.fenxiaoshang = fenxiaoshang;
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
	
	public long getTao_id() {
		return tao_id;
	}

	public void setTao_id(long tao_id) {
		this.tao_id = tao_id;
	}

	public int getDelivery_money() {
		return delivery_money;
	}

	public void setDelivery_money(int delivery_money) {
		this.delivery_money = delivery_money;
	}

	public int getGoods_count() {
		return goods_count;
	}

	public void setGoods_count(int goods_count) {
		this.goods_count = goods_count;
	}

	public Template getTemplate() {
		return template;
	}
	public void setTemplate(Template template) {
		this.template = template;
	}
	
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public int getTemplate_id() {
		return template_id;
	}

	public void setTemplate_id(int template_id) {
		this.template_id = template_id;
	}

	public int getFenxiaoshang_id() {
		return fenxiaoshang_id;
	}

	public void setFenxiaoshang_id(int fenxiaoshang_id) {
		this.fenxiaoshang_id = fenxiaoshang_id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", tao_id=" + tao_id + ", name=" + name
				+ ", phone=" + phone + ", address=" + address + ", postcode="
				+ postcode + ", delivery=" + delivery + ", delivery_money="
				+ delivery_money + ", template_id=" + template_id
				+ ", total_weight=" + total_weight + ", goods_count="
				+ goods_count + ", huokuan=" + huokuan + ", fenxiaoshang_id="
				+ fenxiaoshang_id + ", status=" + status + ", created="
				+ created + ", modified=" + modified + ", template=" + template
				+ ", fenxiaoshang=" + fenxiaoshang + ", orderStatus="
				+ orderStatus + ", list=" + list + "]";
	}
}
