package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "tbl_feedBack",schema = "SEARCH_ENGINE")
public class FeedBack {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String query;

    @Column
    private long docId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public long getDocId() {
        return docId;
    }

    public void setDocId(long docId) {
        this.docId = docId;
    }
}
