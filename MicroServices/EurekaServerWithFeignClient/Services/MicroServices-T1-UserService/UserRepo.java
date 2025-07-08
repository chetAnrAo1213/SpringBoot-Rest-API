package com.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.boot.entites.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, String>
{
	@Query("select i from UserEntity i where i.userId=:x")
	public UserEntity getUserById(@Param("x")String id);
} 