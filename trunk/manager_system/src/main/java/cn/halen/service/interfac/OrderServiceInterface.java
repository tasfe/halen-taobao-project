package cn.halen.service.interfac;

import java.util.List;

import cn.halen.data.pojo.Order;
import cn.halen.util.Paging;

public interface OrderServiceInterface {
	List<Order> listOrder(Paging paging, boolean templateLazy, boolean orderDetailLazy, boolean fenXiaoShangLazy);
	List<Order> listOrderByFenXiaoShang(Paging paging, boolean templateLazy, boolean orderDetailLazy, boolean fenXiaoShangLazy);
}
