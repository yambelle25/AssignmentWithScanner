package com.ccsd.library.members;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "members")
public class Member {
    @Id
    private String id;
    private String name;
    private List<String> borrowedBooks;

    // Constructors
    public Member() {}

    public Member(String name, List<String> borrowedBooks) {
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<String> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
