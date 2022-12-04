package com.mpjavaspringapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mpjavaspringapi.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT FROM User WHERE email = ?1 AND password = ?2")
	public User login(String email, String password);
}
