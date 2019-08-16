
package com.java.demo.bean;

import java.util.Date;


public class News {
      private int id;
    private String title;
    private String summary;
    private String content;
    private Authors authors;
    private Date createAt;

    public News() {
    }


    public News(int id, String title, String summary, String content, Authors authors, Date createAt) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.content = content;
        this.authors = authors;
        this.createAt = createAt;
    }
int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Authors getAuthors() {
        return authors;
    }

    public void setAuthors(Authors authors) {
        this.authors = authors;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    
    
}
