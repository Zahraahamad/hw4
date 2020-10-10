package com.example.hw8;

import java.io.Serializable;

public class thelist implements Serializable {
    private String name;
    private String authorName;
    private int image;
    private int totalPages;
    private String genre;




    public thelist(String name, String authorName, int image, int totalPages) {
        this.name = name;
        this.authorName = authorName;
        this.image = image;
        this.totalPages = totalPages;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
