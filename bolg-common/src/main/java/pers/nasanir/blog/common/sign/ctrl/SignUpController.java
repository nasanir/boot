package pers.nasanir.blog.common.sign.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pers.nasanir.blog.common.sign.itf.ISignUpService;

@RestController
public class SignUpController {
	@Autowired
	private ISignUpService  signUpService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/signup")
	public String signUp() {
		return signUpService.signup();
	}
}
