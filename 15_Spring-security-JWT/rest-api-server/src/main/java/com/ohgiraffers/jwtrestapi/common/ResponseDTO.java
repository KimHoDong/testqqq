package com.ohgiraffers.jwtrestapi.common;

import org.springframework.http.HttpStatus;

public class ResponseDTO {

    private int status;     // HTTP 응답 상태코드
    private String message; // HTTP 응답 메시지
    private Object data;    // HTTP 응답 데이터

    public ResponseDTO() {
    }

    /* HttpStatus 클래스 사용
    *  HttpStatus enum 타입에서 String 으로 매핑된 int 값을 뽑기 위해 value() 메소드 사용. */
    public ResponseDTO(HttpStatus status, String message, Object data) {
        this.status = status.value();
        this.message = message;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "data=" + data +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
