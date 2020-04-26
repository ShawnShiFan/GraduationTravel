package com.kenny.travel.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response implements Serializable {

    private Integer code;

    private String msg;

    private Object data;
}
