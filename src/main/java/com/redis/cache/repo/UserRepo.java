package com.redis.cache.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redis.cache.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel,Long> {

}
