package wu.ink.learn.ch5.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import wu.ink.learn.ch5.pojo.User;

public interface JpaUserRepository extends JpaRepository<User, Long> {
	List<User> findByUserNameLike(String userName);
	User getUserById(Long id);
	List<User> findByUserNameLikeOrNoteLike(String userName, String note);
	
	@Query("from user where user_name like concat('%', ?1, '%') and note like concat('%', ?2, '%')")
	public List<User> findUsers(String userName, String note);
}
