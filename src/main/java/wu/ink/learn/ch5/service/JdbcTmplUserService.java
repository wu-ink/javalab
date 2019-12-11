package wu.ink.learn.ch5.service;

import java.util.List;

import wu.ink.learn.ch5.pojo.User;

public interface JdbcTmplUserService {
	public User getUser(Long id);
	public List<User> findUsers(String userName, String note);
	public int insertUser(User user);
	public int updateUser(User user);
	public int deleteUser(Long id);
}
