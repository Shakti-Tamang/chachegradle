package com.redis.cache.service;

import java.util.List;

import com.redis.cache.model.UserModel;

public interface SaveUser {

     void SaveUsers(UserModel model);

     List<UserModel> getAllUser();

}
