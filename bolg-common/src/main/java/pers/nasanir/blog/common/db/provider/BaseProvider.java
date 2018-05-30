package pers.nasanir.blog.common.db.provider;

import pers.nasanir.blog.common.common.entity.AbstractVO;
import pers.nasanir.blog.common.common.entity.BaseVO;
import pers.nasanir.blog.common.sql.factroy.SqlFactroy;

public class BaseProvider {
	public String query(AbstractVO vo) {
		String sql = SqlFactroy.createSqlBuilder().getQuerySql(vo).getSql();
		vo.setSql(sql);
		return sql;
	}
}
