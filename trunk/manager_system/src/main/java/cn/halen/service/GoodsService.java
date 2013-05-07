package cn.halen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.halen.data.dao.GoodsDao;
import cn.halen.data.pojo.Goods;

@Service
public class GoodsService implements GoodsServiceInterface {
	@Autowired
	private GoodsDao goodsDao;

	@Override
	public ResultInfo updateGoodsBase(Goods goods) {
		ResultInfo resultInfo = new ResultInfo();
		try {
			int result = goodsDao.updateBase(goods);
			if(result!=1) {
				resultInfo.setSuccess(false);
				resultInfo.setErrorInfo("����ʧ��, ������!");
			}
		} catch(Exception e) {
			resultInfo.setSuccess(false);
			resultInfo.setErrorInfo("����ʧ��, ��ǰϵͳ�����д���Ʒ�������ظ�!");
		}
		return resultInfo;
	}

	@Override
	public List<Goods> list() {
		return goodsDao.list();
	}

	@Override
	public Goods getById(long id) {
		return goodsDao.get(id);
	}
	
	
}
