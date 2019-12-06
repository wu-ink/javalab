package wu.ink.learn.ch4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wu.ink.learn.ch4.pojo.User;
import wu.ink.learn.ch4.service.UserService;
import wu.ink.learn.ch4.validator.UserValidator;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService = null;
	
	@RequestMapping("/print")
	@ResponseBody
	public User printUser(Long id, String userName, String note) {
		User user = new User();
		user.setId(id);
		user.setUserName(userName);
		user.setNote(note);
		if (id == null) {
			user = null;
		}
		userService.printUser(user);
		return user;
	}
	
	@RequestMapping("/vp")
	@ResponseBody
	public User validateAndPrint(Long id, String userName, String note) {
		User user = new User();
		user.setId(id);
		user.setUserName(userName);
		user.setNote(note);
		if (id == null) {
			user = null;
		}
		UserValidator userValidator = (UserValidator)userService;
		if (userValidator.validate(user)) {
			userService.printUser(user);
		}
		else {
			System.out.println("User is null");
		}
		return user; 
	}
}
