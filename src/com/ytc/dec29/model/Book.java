package com.ytc.dec29.model;
import java.util.Objects;
public class Book {
    private Integer id;
    private String name;
    private Integer price;
    private String show;
    private Integer typeId;
    private Integer userId;
    private Integer bookUp;

    public Book() {
    }

    public Book(Integer id, String name, Integer price, String show, Integer typeId, Integer userId, Integer bookUp) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.show = show;
        this.typeId = typeId;
        this.userId = userId;
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

    public Integer getTypeId() {
        return this.typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Book typeId(Integer typeId) {
        setTypeId(typeId);
        return this;
    }

    public Book userId(Integer userId) {
        setUserId(userId);
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
        return Objects.equals(id, book.id) && Objects.equals(name, book.name) && Objects.equals(price, book.price) && Objects.equals(show, book.show) && Objects.equals(typeId, book.typeId) && Objects.equals(userId, book.userId) && Objects.equals(bookUp, book.bookUp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, show, typeId, userId, bookUp);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", price='" + getPrice() + "'" +
            ", show='" + getShow() + "'" +
            ", typeId='" + getTypeId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", bookUp='" + getBookUp() + "'" +
            "}";
    }

}
