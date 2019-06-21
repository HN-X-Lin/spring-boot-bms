package com.neo.model;

import lombok.Data;

@Data
public class AdminDomain {
    private String role;
    private int adminId;
    private String adminName;
    private String sex;
    private String photo;
    private String phone;
    private String email;
    private String remark;

}
