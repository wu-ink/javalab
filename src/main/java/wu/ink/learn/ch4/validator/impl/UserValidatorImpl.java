package wu.ink.learn.ch4.validator.impl;

import wu.ink.learn.ch4.pojo.User;
import wu.ink.learn.ch4.validator.UserValidator;

public class UserValidatorImpl implements UserValidator {

	@Override
	public boolean validate(User user) {
		System.out.println("引入新的接口：" + UserValidator.class.getSimpleName());
		return user != null;
	}

}
