package com.rbac.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rbac.model.User;
@Repository
public interface UserRepository  extends JpaRepository<User, Integer>  {

	User findByUserName(String userName);
}
