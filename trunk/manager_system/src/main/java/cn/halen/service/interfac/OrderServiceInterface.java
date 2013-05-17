package cn.halen.service.interfac;

import java.util.List;

import cn.halen.controller.formbean.GoodsStore;
import cn.halen.data.pojo.Order;
import cn.halen.exception.UnderstockException;
import cn.halen.exception.UpdateZeroException;
import cn.halen.util.Paging;

public interface OrderServiceInterface {
	List<Order> listOrder(Paging paging, boolean templateLazy, boolean orderDetailLazy, boolean fenXiaoShangLazy);
	List<Order> listOrderByFenXiaoShang(Paging paging, boolean templateLazy, boolean orderDetailLazy, boolean fenXiaoShangLazy);
	int addOrder(cn.halen.controller.formbean.Order formOrder);
	Order getByOrderId(long orderId);
	int addOrderDetail(GoodsStore goodsStore) throws UnderstockException, UpdateZeroException;
}
