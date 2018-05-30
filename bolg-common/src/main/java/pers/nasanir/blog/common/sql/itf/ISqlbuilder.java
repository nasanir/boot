package pers.nasanir.blog.common.sql.itf;

import pers.nasanir.blog.common.common.entity.AbstractVO;
import pers.nasanir.blog.common.sql.entity.SqlVO;

public interface ISqlbuilder {
	public SqlVO getQuerySql(AbstractVO vo);
}
