package cn.halen.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.halen.data.mapper.GoodsMapper;
import cn.halen.data.pojo.Goods;
import cn.halen.service.top.ItemService;

@Service
public class GoodsService {
	private static final Logger logger = LoggerFactory.getLogger(GoodsService.class);
	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private ItemService itemService;
	
	public boolean updateSkuQuantity(long id) {
		Goods goods = goodsMapper.getById(id);
		return false;
	}
}
