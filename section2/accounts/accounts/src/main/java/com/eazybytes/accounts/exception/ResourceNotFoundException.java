package com.eazybytes.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String resourseName , String fieldName , Object fieldValue){
        super(String.format("%s not found with the given input %s : %s ",resourseName,fieldName,fieldValue));
    }
}
