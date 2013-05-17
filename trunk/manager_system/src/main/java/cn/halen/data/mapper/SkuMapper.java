package cn.halen.data.mapper;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.halen.data.pojo.Sku;

public class SkuMapper extends SqlSessionDaoSupport {

	public int insert(Sku sku) {
		int count = getSqlSession().insert("cn.halen.data.mapper.SkuMapper.insert", sku);
		return count;
	}
	
	public int delete(int id) {
		int count = getSqlSession().delete("cn.halen.data.mapper.SkuMapper.delete", id);
		return count;
	}
	
	public int update(Sku sku) {
		int count = getSqlSession().update("cn.halen.data.mapper.SkuMapper.update", sku);
		return count;
	}
}
