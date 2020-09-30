package com.JBDL.Assignment1;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    String name;
    String authorName;
    int cost;

    @Version
    Timestamp timestamp;

    public Book() {

    }

    public Book(long id, String name, String authorName, int cost, Timestamp timestamp) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

}
