package pers.nasanir.blog.common.db.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import pers.nasanir.blog.common.common.entity.AbstractVO;
import pers.nasanir.blog.common.db.impl.IJdbcBaseService;
import pers.nasanir.blog.common.db.orm.CrudDaoImpl;
import pers.nasanir.blog.common.db.orm.JdbcBaseDao;

@Service("jdbcBaseService")
public class JdbcBaseServiceImpl implements IJdbcBaseService {

	@Autowired
	private JdbcBaseDao jdbcBaseDao;

	public AbstractVO query(AbstractVO vo) {
		// TODO Auto-generated method stub
		vo=jdbcBaseDao.query(vo);
		return vo;
	}

}
