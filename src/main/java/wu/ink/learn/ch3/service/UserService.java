package wu.ink.learn.ch3.service;

import org.springframework.stereotype.Service;

import wu.ink.learn.ch3.pojo.User;

@Service
public class UserService {
	public void printUser(User user) {
		System.out.println("ID:" + user.getId());
		System.out.println("用户名称:" + user.getUserName());
		System.out.println("备注:" + user.getNote());
	}
}
