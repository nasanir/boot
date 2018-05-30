package pers.nasanir.blog.common.user.itf;

import pers.nasanir.blog.common.user.entity.UserVO;

public interface IUserService {
	
	void addUser(UserVO userVO);
	
	void deleteUser(UserVO userVO);
	
	void modifyUser(UserVO userVO);
	
	UserVO findUser(UserVO userVO);	
}	
