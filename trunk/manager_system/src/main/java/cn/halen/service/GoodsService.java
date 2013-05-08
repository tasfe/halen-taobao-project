package cn.halen.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.halen.controller.formbean.GoodsBase;
import cn.halen.controller.formbean.GoodsStore;
import cn.halen.data.dao.GoodsDao;
import cn.halen.data.pojo.Goods;
import cn.halen.exception.UpdateZeroException;
import cn.halen.service.interfac.GoodsServiceInterface;

@Service
public class GoodsService implements GoodsServiceInterface {
	private static final Logger logger = LoggerFactory.getLogger(GoodsService.class);
	@Autowired
	private GoodsDao goodsDao;

	@Override
	public ResultInfo updateGoodsBase(GoodsBase goodsBase) {
		ResultInfo resultInfo = new ResultInfo();
		try {
			int result = goodsDao.updateBase(goodsBase);
			if(result!=1) {
				resultInfo.setSuccess(false);
				resultInfo.setErrorInfo("更新失败, 请重试!");
			}
		} catch(UpdateZeroException e) {
			resultInfo.setSuccess(false);
			resultInfo.setErrorInfo("更新失败, 请重试!");
		} catch(Exception e) {
			resultInfo.setSuccess(false);
			resultInfo.setErrorInfo("更新失败, 当前系统内已有此商品，不能重复!");
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

	@Override
	public ResultInfo updateGoodsStore(GoodsStore goodsStore) {
		ResultInfo resultInfo = new ResultInfo();
		try {
			Goods goods = goodsDao.get(goodsStore.getId());
			if(goods.getModified().getTime()!=goodsStore.getModified().getTime()) {
				logger.debug("modified data miss consistency, modified: {}, db modified: {}", goodsStore.getModified(), goods.getModified());
				resultInfo.setSuccess(false);
				resultInfo.setErrorInfo("更新失败, 请重试!");
				return resultInfo;
			}
			GoodsStore old = new GoodsStore();
			BeanUtils.copyProperties(goods, old);
			if(goodsStore.getType()==1) {
				old.add(goodsStore);
			} else if(goodsStore.getType()==0) {
				boolean result = old.cut(goodsStore);
				if(!result) {
					resultInfo.setSuccess(false);
					resultInfo.setErrorInfo("更新失败, 库存不足!");
					return resultInfo;
				}
			}
			goodsDao.updateStore(old);
		} catch(Exception e) {
			resultInfo.setSuccess(false);
			resultInfo.setErrorInfo("更新失败, 请重试!");
		}
		return resultInfo;
	}
}
