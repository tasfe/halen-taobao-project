//package cn.halen.service;
//
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import cn.halen.controller.formbean.GoodsStore;
//import cn.halen.data.OrderStatus;
//import cn.halen.data.dao.DeliveryDao;
//import cn.halen.data.dao.FenXiaoShangDao;
//import cn.halen.data.dao.GoodsDao;
//import cn.halen.data.dao.OrderDao;
//import cn.halen.data.dao.OrderDetailDao;
//import cn.halen.data.dao.TemplateDao;
//import cn.halen.data.dao.UserDao;
//import cn.halen.data.pojo.Delivery;
//import cn.halen.data.pojo.FenXiaoShang;
//import cn.halen.data.pojo.Goods;
//import cn.halen.data.pojo.Order;
//import cn.halen.data.pojo.OrderDetail;
//import cn.halen.data.pojo.Template;
//import cn.halen.exception.UnderstockException;
//import cn.halen.exception.UpdateZeroException;
//import cn.halen.filter.FenXiaoShangHolder;
//import cn.halen.service.interfac.OrderServiceInterface;
//import cn.halen.util.Paging;
//@Service
//public class OrderService implements OrderServiceInterface {
//
//	private Logger logger = LoggerFactory.getLogger(OrderService.class);
//	@Autowired
//	private OrderDao orderDao;
//	@Autowired
//	private FenXiaoShangDao fenXiaoShangDao;
//	@Autowired
//	private OrderDetailDao orderDetailDao;
//	@Autowired
//	private TemplateDao templateDao;
//	@Autowired
//	private UserDao userDao;
//	@Autowired
//	private DeliveryDao deliveryDao;
//	@Autowired
//	private GoodsDao goodsDao;
//	
//	@Override
//	public List<Order> listOrder(Paging paging, boolean templateLazy,
//			boolean orderDetailLazy, boolean fenXiaoShangLazy) {
//		List<Order> list = orderDao.listOrder(paging.getStart(), paging.getSize());
//		if(!templateLazy) {
//			
//		}
//		
//		return list;
//	}
//	
//	private Order getOrderById(long id) {
//		Order order = orderDao.getById(id);
//		Template template = templateDao.getById(order.getTemplate().getId());
//		order.setTemplate(template);
//		return order;
//	}
//	
//	public int addOrder(cn.halen.controller.formbean.Order formOrder) {
//		Order order = new Order();
//		order.setOrder_id(formOrder.getOrderId());
//		order.setName(formOrder.getName());
//		order.setPhone(formOrder.getPhone());
//		order.setPostcode(formOrder.getPostcode());
//		order.setAddress(formOrder.getAddress());
//		
//		Delivery delivery = deliveryDao.getById(formOrder.getDeliveryId());
//		order.setDelivery(delivery.getName());
//		
//		Template template = templateDao.getTemplateByCityDelivery(formOrder.getCityId(), formOrder.getDeliveryId());
//		order.setTemplate(template);
//		
//		FenXiaoShang fenXiaoShang = FenXiaoShangHolder.get();
//		order.setFenxiaoshang(fenXiaoShang);
//		return orderDao.addOrder(order);
//	}
//
//	@Override
//	public List<Order> listOrderByFenXiaoShang(Paging paging,
//			boolean templateLazy, boolean orderDetailLazy,
//			boolean fenXiaoShangLazy) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Order getByOrderId(long orderId) {
//		logger.debug("Query order by order_id {}", orderId);
//		Order order = orderDao.getByOrderId(orderId);
//		return order;
//	}
//
//	@Override
//	public int addOrderDetail(GoodsStore goodsStore) throws UnderstockException, UpdateZeroException {
//		//�����
//		Goods goods = goodsDao.get(goodsStore.getId());
//		GoodsStore old = new GoodsStore();
//		BeanUtils.copyProperties(goods, old);
//		boolean result = old.cut(goodsStore);
//		if(!result) {
//			throw new UnderstockException("�����Ʒʧ�ܣ���治��!");
//		}
//		goodsDao.updateStore(old);
//		//���order detail
//		OrderDetail orderDetail = new OrderDetail();
//		BeanUtils.copyProperties(goodsStore, orderDetail);
//		Order order = getOrderById(goodsStore.getOrderId());
//		orderDetail.setOrder(order);
//		orderDetail.setGoods(goods);
//		float discount = getDiscount();
//		orderDetail.setPrice(goods.getPrice());
//		int huokuan = (int) ((goods.getPrice() * goodsStore.getCount()) * discount);
//		orderDetail.setHuokuan(huokuan);
//		orderDetail.setDiscount(discount);
//		orderDetailDao.addOrderDetail(orderDetail);
//		//����order 
//		order.addHuokuan(huokuan);
//		order.addWeight(goodsStore.getCount()*goods.getWeight());
//		order.computeDeliveryMoney();
//		order.addGoodsCount(goodsStore.getCount());
//		order.setStatus(OrderStatus.HaveGoods);
//		
//		
//		return 0;
//	}
//	
//	private float getDiscount() {
//		//��ʱֱ�ӷ��ط����̵��ۿۣ������Ľ�
//		FenXiaoShang fenxiaoshang = FenXiaoShangHolder.get();
//		return fenxiaoshang.getDiscount();
//	}
//
//}
