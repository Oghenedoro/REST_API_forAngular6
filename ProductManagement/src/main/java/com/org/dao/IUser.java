package com.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.org.entities.User;

public interface IUser extends JpaRepository<User, Long>{

	public User findByUserId(Long userId);
}
