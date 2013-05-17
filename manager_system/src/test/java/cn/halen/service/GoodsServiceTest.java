package cn.halen.service;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.halen.data.DataConfig;
import cn.halen.data.mapper.AreaMapper;
import cn.halen.service.ServiceConfig;
import cn.halen.service.top.AreasService;

import com.taobao.api.ApiException;
import com.taobao.api.domain.Area;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataConfig.class, ServiceConfig.class})
public class GoodsServiceTest {
	@Autowired
	private GoodsService goodsService;
	@Test
	public void test_updateSkuQuantity() throws ApiException, JSONException {
		long id = 2;
		
		boolean result = goodsService.updateSkuQuantity(id);
	}
}
