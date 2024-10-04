package com.purush.demoSelect;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "tbl_users")
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId")
    private Long userId;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "email")
    private String email;
    @Column(name = "LastName")
    private String lastName;
    // Constructors
    public User() {
    }

    public User(String username, String email) {
        this.firstName = username;
        this.email = email;
    }
    // Getters and setters
    public Long getId() {
        return userId;
    }

    public void setId(Long id) {
        this.userId = id;
    }

    public String getUsername() {
        return firstName+" "+lastName;
    }

    public void setUsername(String username) {
        this.firstName = username;
    }

   // public String getEmail() {
   //     return email;
    //}

    public void setEmail(String email) {
        this.email = email;
    }


}
