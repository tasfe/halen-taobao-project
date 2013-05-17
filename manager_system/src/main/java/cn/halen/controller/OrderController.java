package cn.halen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.halen.data.pojo.Order;
import cn.halen.service.ResultInfo;
import cn.halen.service.interfac.OrderServiceInterface;
import cn.halen.util.Paging;

@Controller
public class OrderController {

	@Autowired
	private OrderServiceInterface orderService;
	
	@RequestMapping(value="fenxiao/add_order_form")
	public String addForm(Model model) {
		
		return "fenxiao/add_order_form";
	}
	
	@RequestMapping(value="/order_list")
	public String list(Model model) {
		
		List<Order> list = orderService.listOrder(new Paging(), true, true, true);
		model.addAttribute("orderList", list);
		return "order_list";
	}
	
	@RequestMapping(value="/fenxiao/order_detail")
	public String orderDetail(Model model, @RequestParam("order_id") long orderId) {
		Order order = orderService.getByOrderId(orderId);
		model.addAttribute("order", order);
		return "fenxiao/order_detail";
	}
	
	@RequestMapping(value="fenxiao/add_order")
	public @ResponseBody ResultInfo addOrder(@RequestBody cn.halen.controller.formbean.Order order) {
		ResultInfo result = new ResultInfo();
		try {
			orderService.addOrder(order);
		} catch (Exception e) {
			result.setSuccess(false);
			if(e instanceof DuplicateKeyException ) {
				result.setErrorInfo("订单已经存在，请确定订单号不要重复!");
			} else {
				result.setErrorInfo("新建订单失败，请重试!");
			}
		}
		
//		ResultInfo info = validator.validate();
//		if(!info.isSuccess()) {
//			return info;
//		}
		return result;
	}
//	
//	@RequestMapping(value="huopin/update_goods_store")
//	public @ResponseBody ResultInfo updateGoodsStore(@RequestBody GoodsStore goodsStore) {
//		GoodsStoreValidator validator = new GoodsStoreValidator(goodsStore);
//		ResultInfo info = validator.validate();
//		if(!info.isSuccess()) {
//			return info;
//		}
//		return goodsService.updateGoodsStore(goodsStore);
//	}
}
