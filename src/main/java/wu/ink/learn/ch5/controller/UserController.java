package wu.ink.learn.ch5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wu.ink.learn.ch5.enumeration.SexEnum;
import wu.ink.learn.ch5.pojo.User;
import wu.ink.learn.ch5.service.JdbcTmplUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private JdbcTmplUserService jdbcTmplUserService;

	@RequestMapping("/add")
	@ResponseBody
	public User addUser(String userName, int sex, String note) {
		User user = new User();
		user.setUserName(userName);
		user.setSex(SexEnum.getEnumById(sex));
		user.setNote(note);
		if (jdbcTmplUserService.insertUser(user) == 1) {
			return user;
		}
		else {
			return null;
		}
	}
}
