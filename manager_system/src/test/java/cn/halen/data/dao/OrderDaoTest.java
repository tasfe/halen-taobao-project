package cn.halen.data.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.halen.data.DataConfig;
import cn.halen.data.pojo.FenXiaoShang;
import cn.halen.data.pojo.Order;
import cn.halen.data.pojo.Template;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataConfig.class})
public class OrderDaoTest {
	@Autowired
	private OrderDao orderDao;
	@Test
	public void testAddOrder() {
		Order order = new Order();
		order.setOrder_id(1654876546548L);
		order.setName("��־��");
		order.setPhone("15157197713");
		order.setAddress("�����У��������");
		order.setPostcode("310009");
		Template template = new Template();
		template.setId(1);
		order.setTemplate(template);
		FenXiaoShang fenxiaoshang = new FenXiaoShang();
		fenxiaoshang.setId(1);
		order.setFenxiaoshang(fenxiaoshang);
		orderDao.addOrder(order);
	}
	
	@Test
	public void testListOrder() {
		List<Order> list = orderDao.listOrder(0, 2);
		System.out.println(list.size());
	}
}
