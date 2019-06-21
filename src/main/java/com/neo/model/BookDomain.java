package com.neo.model;

import lombok.Data;

@Data
public class BookDomain {
    private int bookId;
    private String bookName;
    private String author;
    private String press;
    private String bookDate;
    private String bookType;
    private String bookDesc;
    private String photo;
    private int cnt;
}
