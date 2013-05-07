package cn.halen.controller;

import java.util.List;

import javax.validation.Valid;

import org.json.JSONException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.halen.controller.formbean.GoodsBase;
import cn.halen.controller.formbean.GoodsBaseValidator;
import cn.halen.data.pojo.Goods;
import cn.halen.service.GoodsServiceInterface;
import cn.halen.service.ResultInfo;

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
	public @ResponseBody GoodsBase getGoodsById(@RequestParam("id") long id) throws JSONException {
		
		//resp.setContentType("text/json");
		Goods goods = goodsService.getById(id);
		GoodsBase goodsBase = new GoodsBase();
		BeanUtils.copyProperties(goods, goodsBase);
		return goodsBase;
//		JSONObject json = new JSONObject();
//		json.put("id", goods.getId());
//		json.put("hid", goods.getHid());
//		json.put("color", goods.getColor());
//		json.put("weight", goods.getWeight());
//		json.put("price", goods.getPrice());
//		writer.print(json.toString());
	}
	
	@RequestMapping(value="huopin/update_goods_base")
	public @ResponseBody ResultInfo updateGoodsBase(@RequestBody @Valid  GoodsBase goodsBase) {
		GoodsBaseValidator validator = new GoodsBaseValidator(goodsBase);
		ResultInfo info = validator.validate();
		if(!info.isSuccess()) {
			return info;
		}
		
		Goods goods = new Goods();
		BeanUtils.copyProperties(goodsBase, goods);
		return goodsService.updateGoodsBase(goods);
	}
}
