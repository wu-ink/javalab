package wu.ink.learn.ch5.controller;

import java.util.List;

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
	
	@RequestMapping("/getUserById")
	@ResponseBody
	public User getUserById(Long id) {
		User user = jpaUserRepository.getUserById(id);
		return user;
	}
	
	@RequestMapping("/findUsers")
	@ResponseBody
	public List<User> findUsers(String userName, String note) {
		return jpaUserRepository.findUsers(userName, note);
	}
	
	@RequestMapping("/findByUserNameLike")
	@ResponseBody
	public List<User> findByUserNameLike(String userName) {
		List<User> userList = jpaUserRepository.findByUserNameLike("%" + userName + "%");
		return userList;
	}
	
	@RequestMapping("/findByUserNameLikeOrNoteLike")
	@ResponseBody
	public List<User> findByUserNameLikeOrNoteLike(String userName, String note) {
		String userNameLike = "%" + userName + "%";
		String noteLike = "%" + note + "%";
		List<User> userList = jpaUserRepository.findByUserNameLikeOrNoteLike(userNameLike, noteLike);
		return userList;
	}
}
