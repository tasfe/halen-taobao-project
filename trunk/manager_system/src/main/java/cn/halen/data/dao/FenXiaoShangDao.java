package cn.halen.data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cn.halen.data.pojo.FenXiaoShang;

@Repository
public class FenXiaoShangDao {
	@Value("${list.fenxiaoshang}")
	private String sqlListFenXiaoShang;
	@Value("${get.fenxiaoshang.by.id}")
	private String sqlGetFenXiaoShangById;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<FenXiaoShang> list() {
		
		List<FenXiaoShang> list = jdbcTemplate.query(sqlListFenXiaoShang, new FenXiaoShangRowMapper());
		return list;
	}
	
	public FenXiaoShang get(final long id) {
		FenXiaoShang fenXiaoShang = jdbcTemplate.queryForObject(sqlGetFenXiaoShangById, new Object[] {id}, new FenXiaoShangRowMapper());
		return fenXiaoShang;
	}
}

class FenXiaoShangRowMapper implements RowMapper<FenXiaoShang> {

	@Override
	public FenXiaoShang mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		FenXiaoShang fenXiaoShang = new FenXiaoShang();
		fenXiaoShang.setId(rs.getInt("id"));
		fenXiaoShang.setName(rs.getString("name"));
		fenXiaoShang.setUsername(rs.getString("username"));
		fenXiaoShang.setPassword(rs.getString("password"));
		fenXiaoShang.setDeposit(rs.getLong("deposit"));
		fenXiaoShang.setDiscount(rs.getFloat("discount"));
		fenXiaoShang.setCreated(rs.getTimestamp("created"));
		fenXiaoShang.setModified(rs.getTimestamp("modified"));
		return fenXiaoShang;
	}
}
