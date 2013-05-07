package cn.halen.data.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.halen.data.DataConfig;
import cn.halen.data.pojo.Goods;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataConfig.class})
public class GoodsDaoTest {

	@Autowired
	private GoodsDao goodsDao;
	
	@Test
	public void testListGoods() {
		List<Goods> list = goodsDao.list();
		System.out.println(list.size());
	}
	
	@Test
	public void testGetGoodsById() {
		Goods goods = goodsDao.get(1L);
		System.out.println(goods);
	}
	
	@Test
	public void testAddGoods() throws Exception {
		Goods goods = goodsDao.get(1L);
		goods.setHid("test");
		goodsDao.addGoods(goods);
	}
	
	@Test
	public void testUpdateGoodsBase() {
		Goods goods = goodsDao.get(1L);
		System.out.println(goods);
		goods.setColor("blue1");
		goodsDao.updateBase(goods);
		goods = goodsDao.get(1L);
		System.out.println(goods);
	}
	
	@Test
	public void testUpdateGoodsStore() {
		Goods goods = goodsDao.get(1L);
		System.out.println(goods);
		goods.setThity_four(104);
		int count = goodsDao.updateStore(goods);
		System.out.println(count);
		goods = goodsDao.get(1L);
		System.out.println(goods);
	}
}
