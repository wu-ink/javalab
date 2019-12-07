package wu.ink.learn.ch4.service.impl;

import org.springframework.stereotype.Service;

import wu.ink.learn.ch4.pojo.User;
import wu.ink.learn.ch4.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public void printUser(User user) {
		if (user == null) {
			throw new RuntimeException("检查用户参数是否为空……");
		}
		System.out.println("id = " + user.getId());
		System.out.println("\tusername = " + user.getUserName());
		System.out.println("\tnote = " + user.getNote());
	}

	@Override
	public void manyAspects() {
		System.out.println("测试多个切面顺序");
	}
}
