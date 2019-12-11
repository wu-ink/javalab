package wu.ink.learn.ch5.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import wu.ink.learn.ch5.pojo.User;

public interface JpaUserRepository extends JpaRepository<User, Long>{
}
