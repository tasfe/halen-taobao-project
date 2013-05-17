package cn.halen.service.top;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.halen.data.DataConfig;
import cn.halen.service.ServiceConfig;

import com.taobao.api.ApiException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataConfig.class, ServiceConfig.class})
public class ItemPropsServiceTest {
	@Autowired
	private ItemPropsService itemPropsService;
	@Test
	public void test_import2db() throws ApiException, JSONException {
		itemPropsService.import2db();
	}
	
	@Test
	public void test_list1() {
		itemPropsService.list1();
	}
	
	@Test
	public void test_list2() {
		itemPropsService.list2();
	}
}
