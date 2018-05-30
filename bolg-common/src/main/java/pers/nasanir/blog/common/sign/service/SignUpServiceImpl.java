package pers.nasanir.blog.common.sign.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import pers.nasanir.blog.common.db.impl.IJdbcBaseService;
import pers.nasanir.blog.common.db.orm.JdbcBaseDao;
import pers.nasanir.blog.common.db.service.JdbcBaseServiceImpl;
import pers.nasanir.blog.common.sign.itf.ISignUpService;
import pers.nasanir.blog.common.user.entity.UserVO;

@Service("signUpService")
public class SignUpServiceImpl implements ISignUpService {

	@Autowired
	private IJdbcBaseService jdbcBaseService;

	@Override
	public String signup() {

		// TODO Auto-generated method stub

		UserVO userVO = new UserVO();
		userVO.setUsercode("nasanir");
		userVO=(UserVO) jdbcBaseService.query(userVO);
		
		return userVO.getEmail();

	}

}
