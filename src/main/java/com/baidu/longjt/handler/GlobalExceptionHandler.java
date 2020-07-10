package com.baidu.longjt.handler;

import com.baidu.longjt.util.DaoException;
import com.baidu.longjt.util.ResponseEntity;
import com.baidu.longjt.util.ServiceException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public <T> ResponseEntity<T> handlerException(Exception ex){
        if(ex instanceof ServiceException) {
            return ResponseEntity.serviceError();
        }else if(ex instanceof DaoException){
            return ResponseEntity.daoError();
        }else {
            return ResponseEntity.error();
        }
    }
    
}
