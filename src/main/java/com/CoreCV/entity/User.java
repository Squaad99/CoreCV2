package com.CoreCV.entity;


import com.CoreCV.model.UserModel;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public User() {}

    public User(User user) {
        this.email = user.getEmail();
        this.username = user.getUsername();
        this.id = user.getId();
        this.password = user.getPassword();
    }

    public User(UserModel userModel){
        this.id = userModel.getUserId();
        this.email = userModel.getEmail();
        this.username = userModel.getUsername();
        this.password = userModel.getPassword();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
