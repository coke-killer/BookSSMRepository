package com.example.demo.bean;

public class Book {
    private Integer id;
    private Integer uId;
    private String isbn;
    private String name;
    private String price;
    private String publisher;
    private String pages;
    private String cover;

    public Book(Integer id, Integer uId, String isbn, String name, String price, String publisher, String pages, String cover) {
        this.id = id;
        this.uId = uId;
        this.isbn = isbn;
        this.name = name;
        this.price = price;
        this.publisher = publisher;
        this.pages = pages;
        this.cover = cover;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Book() {
    }
}
