package com.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.org.entities.Role;
import com.org.entities.User;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	public Role findByRoleName(String roleName);
	public Role findByRoleId(Long id);
		
		
	
}
