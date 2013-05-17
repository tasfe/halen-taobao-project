package cn.halen.data.mapper;

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
public class GoodsMapperTest {
	@Autowired
	private GoodsMapper goodsMapper;
	@Test
	public void test_list() {
		List<Goods> list = goodsMapper.list();
		for(Goods goods : list) {
			System.out.println(goods);
		}
	}
	
	@Test
	public void test_insert() {
		Goods goods = new Goods();
		goods.setHid("goods-2");
		//goods.setDefault();
		goodsMapper.insert(goods);
	}
	
	@Test
	public void test_getById() {
		Goods goods = goodsMapper.getById(2);
//		System.out.println(goods);
//		goods.setTao_id(1111111);
//		goodsMapper.update(goods); //update goods
//		goods = goodsMapper.getById(1);
		System.out.println(goods);
	}
}
