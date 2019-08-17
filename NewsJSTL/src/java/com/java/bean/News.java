package com.java.bean;

import java.util.Date;
import javafx.print.Printer;

public class News {

    private int id;
    private String title;
    private String images;
    private String summary;
    private String content;
    private Authors authors;
    private String created_at;

    public News() {
    }

    public News(int id, String title, String images, String summary, String content, Authors authors, String created_at) {
        this.id = id;
        this.title = title;
        this.images = images;
        this.summary = summary;
        this.content = content;
        this.authors = authors;
        this.created_at = created_at;
    }

    public int getId() {
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

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
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

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

   
    
}
