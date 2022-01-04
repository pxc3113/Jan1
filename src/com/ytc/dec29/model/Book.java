package com.ytc.dec29.model;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Objects;
public class Book {
    private Integer id;
    private String name;
    private Integer price;
    private String show;
    private Integer bookUp;
    private BookType bookType;
    private User user;

    public Book() {
    }

    public Book(Integer id, String name, Integer price, String show, BookType bookType, User user, Integer bookUp) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.show = show;
        this.bookType = bookType;
        this.user = user;
        this.bookUp = bookUp;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getShow() {
        return this.show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public BookType getBookType() {
        return this.bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getBookUp() {
        return this.bookUp;
    }

    public void setBookUp(Integer bookUp) {
        this.bookUp = bookUp;
    }

    public Book id(Integer id) {
        setId(id);
        return this;
    }

    public Book name(String name) {
        setName(name);
        return this;
    }

    public Book price(Integer price) {
        setPrice(price);
        return this;
    }

    public Book show(String show) {
        setShow(show);
        return this;
    }

    public Book bookType(BookType bookType) {
        setBookType(bookType);
        return this;
    }

    public Book user(User user) {
        setUser(user);
        return this;
    }

    public Book bookUp(Integer bookUp) {
        setBookUp(bookUp);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(name, book.name) && Objects.equals(price, book.price) && Objects.equals(show, book.show) && Objects.equals(bookType, book.bookType) && Objects.equals(user, book.user) && Objects.equals(bookUp, book.bookUp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, show, bookType, user, bookUp);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", price='" + getPrice() + "'" +
            ", show='" + getShow() + "'" +
            ", bookType='" + getBookType() + "'" +
            ", user='" + getUser() + "'" +
            ", bookUp='" + getBookUp() + "'" +
            "}";
    }

}