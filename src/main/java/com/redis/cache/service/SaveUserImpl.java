package com.redis.cache.service;

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

}
