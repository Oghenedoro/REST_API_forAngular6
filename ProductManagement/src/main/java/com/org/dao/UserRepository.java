package com.org.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUserId(Long id);
	public User findByUserName(String userName); 
}
