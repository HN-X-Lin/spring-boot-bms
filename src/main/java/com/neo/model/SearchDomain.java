package com.neo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Data
@Document(indexName = "mytest",type = "book")
public class SearchDomain {
    @Id
    private Integer bookId;
    @Field(analyzer = "ik_max_word")
    private String bookName;
    @Field(analyzer = "ik_max_word")
    private String author;
    @Field(analyzer = "ik_max_word")
    private String press;
    private String bookDate;
    @Field(analyzer = "ik_max_word")
    private String bookType;
    private String bookDesc;
    private String photo;
    private int cnt;
}
