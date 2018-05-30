package pers.nasanir.blog.common.db.impl;

import java.util.List;

import pers.nasanir.blog.common.common.entity.AbstractVO;
import pers.nasanir.blog.common.common.entity.VOSet;

public interface IJdbcBaseService<T> {
	public AbstractVO query(AbstractVO vo);
}
