package com.neo.model;

import lombok.Data;

@Data
public class UserDomain {
    private Integer userId;
    private String userName;
    private String sex;
    private String phone;
    private String email;
    private String photo;
    private String myInterest;
}
