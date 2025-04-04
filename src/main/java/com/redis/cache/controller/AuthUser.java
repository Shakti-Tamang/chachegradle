package com.redis.cache.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redis.cache.apiresponse.ApiResponse;
import com.redis.cache.model.UserModel;
import com.redis.cache.service.SaveUser;

import jakarta.validation.Valid;

@RestController
@Validated

@RequestMapping("api/v1/auth")
public class AuthUser {

    private final SaveUser saveUser;

    public AuthUser(SaveUser saveUser){
        this.saveUser = saveUser;
    }


    public ResponseEntity<ApiResponse>saveUsers(@Valid @RequestBody UserModel model){
        saveUser.SaveUser(model);
        
        ApiResponse apiResponse=ApiResponse.builder().message("success").statusCode(HttpStatus.OK.value()).build();
        return ResponseEntity.status(HttpStatus.OK).body(apiResponse);

    }


    
}
