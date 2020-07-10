package com.baidu.longjt.util;

import lombok.Data;

/**
 * @param <T> 传入返回的类和状态码信息，或者直接返回状态码
 */
@Data
public class ResponseEntity<T> {
    private int status;
    private String message;
    private T data;

    /**
     * 不传入参数，直接返回状态码和信息，适用于增删改等返回操作
     * @param <T>
     * @return
     */
    public static <T> ResponseEntity<T> success(){
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setStatus(ReturnState.SUCCESS.getStatus());
        entity.setMessage(ReturnState.SUCCESS.getMsg());
        return entity;
    }

    /**
     * 传入返回的数据，状态码和信息，适用于返回查询的数据和状态
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseEntity<T> success(T data){
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setStatus(ReturnState.SUCCESS.getStatus());
        entity.setMessage(ReturnState.SUCCESS.getMsg());
        entity.setData(data);
        return entity;
    }

    /**
     * 用于打印错误的信息，不需要传入参数
     * @param <T>
     * @return
     */
    public static <T> ResponseEntity<T> error(){
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setStatus(ReturnState.ERROR.getStatus());
        entity.setMessage(ReturnState.ERROR.getMsg());
        return entity;
    }
    public static <T> ResponseEntity<T> serviceError(){
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setStatus(ReturnState.SERVICE_ERROR.getStatus());
        entity.setMessage(ReturnState.SERVICE_ERROR.getMsg());
        return entity;
    }
    public static <T> ResponseEntity<T> daoError(){
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setStatus(ReturnState.DAO_ERROR.getStatus());
        entity.setMessage(ReturnState.DAO_ERROR.getMsg());
        return entity;
    }
//    public static <T> ResponseEntity<T> error(T data){
//        ResponseEntity<T> entity = new ResponseEntity<>();
//        entity.setStatus(ReturnState.ERROR.getStatus());
//        entity.setMessage(ReturnState.ERROR.getMsg());
//        entity.setData(data);
//        return entity;
//    }

}
