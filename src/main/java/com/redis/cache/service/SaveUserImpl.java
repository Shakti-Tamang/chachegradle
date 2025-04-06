package com.redis.cache.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.redis.cache.model.UserModel;
import com.redis.cache.repo.UserRepo;

// ./gradlew clean build
// gradlew clean build
// gradle build --refresh-dependencies

// ./gradlew clean build publishToMavenLocal

// ./gradlew bootRun

// ./gradlew dependencies


@Service
public class SaveUserImpl  implements SaveUser{

    private final UserRepo userRepo;
public SaveUserImpl(UserRepo userRepo){
    this.userRepo=userRepo;

}

    @Override
    public void SaveUsers(UserModel model) {
      userRepo.save(model);
    }

    @Override
    @Cacheable(value = "userCache", key = "#userId")
    public List<UserModel> getAllUser() {
      List<UserModel>list=userRepo.findAll();

      return list.isEmpty()? new ArrayList<>(): list;
    }

}
