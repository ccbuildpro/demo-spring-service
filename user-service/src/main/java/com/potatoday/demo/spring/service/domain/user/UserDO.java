package com.potatoday.demo.spring.service.domain.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDO implements Serializable {
    private Long uid;
    private String account;
    private String password;
    private Integer dataStatus;
    private String gmtCreate;
    private String gmtModified;
    private Long modifiedBy;

}