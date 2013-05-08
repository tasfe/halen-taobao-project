package cn.halen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.halen.data.dao.FenXiaoShangDao;
import cn.halen.data.dao.OrderDao;
import cn.halen.data.dao.OrderDetailDao;
import cn.halen.data.pojo.Order;
import cn.halen.service.interfac.OrderServiceInterface;
import cn.halen.util.Paging;
@Service
public class OrderService implements OrderServiceInterface {

	@Autowired
	private OrderDao orderDao;
	@Autowired
	private FenXiaoShangDao fenXiaoShangDao;
	@Autowired
	private OrderDetailDao orderDetailDao;
	
	@Override
	public List<Order> listOrder(Paging paging, boolean templateLazy,
			boolean orderDetailLazy, boolean fenXiaoShangLazy) {
		List<Order> list = orderDao.listOrder(paging.getStart(), paging.getSize());
		if(!templateLazy) {
			
		}
		
		return list;
	}

	@Override
	public List<Order> listOrderByFenXiaoShang(Paging paging,
			boolean templateLazy, boolean orderDetailLazy,
			boolean fenXiaoShangLazy) {
		// TODO Auto-generated method stub
		return null;
	}

}
