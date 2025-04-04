package com.redis.cache.apiresponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ApiResponse<T> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("message")
    private String message;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("statusCode")
    private int statusCode;

    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("data")
    private T data;

   
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("statusCode")
    private List<T> dataList;

    
    
}
