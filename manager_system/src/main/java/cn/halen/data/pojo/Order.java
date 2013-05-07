package cn.halen.data.pojo;

import java.util.Date;
import java.util.List;

public class Order {
	private long id; //����id
	private long order_id; //�Ա�����id
	private String name; //�ͻ�����
	private String phone; //�ͻ���ϵ�绰
	private String address; //��ϵ��ַ
	private String postcode; //�ʱ�
	private int kuaidifei; //��ݷ�
	private int total_weight; //����Ь�ӵ�������
	private int huokuan; //����
	private FenXiaoShang fenxiaoshang; //������
	private int status; //��ʾ����״̬
	private Date created;
	private Date modified;
	
	private List<OrderDetail> list;
	
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
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
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
	public int getKuaidifei() {
		return kuaidifei;
	}
	public void setKuaidifei(int kuaidifei) {
		this.kuaidifei = kuaidifei;
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
		return "Order [id=" + id + ", order_id=" + order_id + ", name=" + name
				+ ", phone=" + phone + ", address=" + address + ", postcode="
				+ postcode + ", kuaidifei=" + kuaidifei + ", total_weight="
				+ total_weight + ", huokuan=" + huokuan + ", fenxiaoshang="
				+ fenxiaoshang + ", status=" + status + ", created=" + created
				+ ", modified=" + modified + ", list=" + list + "]";
	}
	
}
