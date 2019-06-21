package com.neo.model;

import lombok.Data;

@Data
public class RecordDomain {
    private String userId;
    private String userName;
    private String bookId;
    private  String bookName;
    private String operation;
    private String opDate;
    private String author;
    private String press;
    private String bookDate;
    private String bookType;
    private int cnt;
    private String period;
    private String content;
    private String photo;
}
