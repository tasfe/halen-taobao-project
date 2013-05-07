package cn.halen.service;

import java.util.List;

import cn.halen.data.pojo.Goods;

public interface GoodsServiceInterface {
	ResultInfo updateGoodsBase(Goods goods);
	List<Goods> list();
	Goods getById(long id);
}
