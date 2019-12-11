package wu.ink.learn.ch5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wu.ink.learn.ch5.dao.JpaUserRepository;
import wu.ink.learn.ch5.pojo.User;

@Controller
@RequestMapping("/jpa")
public class JpaController {
	@Autowired
	private JpaUserRepository jpaUserRepository = null;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser(Long id) {
		User user = jpaUserRepository.findById(id).get();
		return user;
	}
}
