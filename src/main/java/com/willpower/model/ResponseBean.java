package com.willpower.model;

/**
 * 公共的响应封装类
 * @param <T>
 */
public class ResponseBean<T> {

    private T data;

    private int code;

    private String message;

    public ResponseBean(T data, int code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public ResponseBean() {
    }

    public T getResponse() {
        return data;
    }

    public void setResponse(T response) {
        this.data = response;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseBean{" +
                "data=" + (data == null ? "" : data.toString()) +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
