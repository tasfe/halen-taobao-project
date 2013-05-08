package cn.halen.controller;

import java.util.List;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.halen.controller.formbean.GoodsBase;
import cn.halen.controller.formbean.GoodsBaseValidator;
import cn.halen.controller.formbean.GoodsStore;
import cn.halen.controller.formbean.GoodsStoreValidator;
import cn.halen.data.pojo.Goods;
import cn.halen.service.ResultInfo;
import cn.halen.service.interfac.GoodsServiceInterface;

@Controller
public class GoodsController {

	@Autowired
	private GoodsServiceInterface goodsService;
	
	@RequestMapping(value="huopin/goods_list")
	public String list(Model model) {
		
		List<Goods> list = goodsService.list();
		model.addAttribute("goodsList", list);
		return "huopin/goods_list";
	}
	
	@RequestMapping(value="huopin/get_goods_by_id")
	public @ResponseBody Goods getGoodsById(@RequestParam("id") long id) throws JSONException {
		
		Goods goods = goodsService.getById(id);
		return goods;
	}
	
	@RequestMapping(value="huopin/update_goods_base")
	public @ResponseBody ResultInfo updateGoodsBase(@RequestBody GoodsBase goodsBase) {
		GoodsBaseValidator validator = new GoodsBaseValidator(goodsBase);
		ResultInfo info = validator.validate();
		if(!info.isSuccess()) {
			return info;
		}
		return goodsService.updateGoodsBase(goodsBase);
	}
	
	@RequestMapping(value="huopin/update_goods_store")
	public @ResponseBody ResultInfo updateGoodsStore(@RequestBody GoodsStore goodsStore) {
		GoodsStoreValidator validator = new GoodsStoreValidator(goodsStore);
		ResultInfo info = validator.validate();
		if(!info.isSuccess()) {
			return info;
		}
		return goodsService.updateGoodsStore(goodsStore);
	}
}
