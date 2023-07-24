package com.example.spring5.Customer;

import  java.time.LocalDateTime;
public class Member {

    private  long id;
    private  String email;
    private  String password;
    private  String name;
    private  LocalDateTime registerDateTime;

    public Member(String email, String password, String name, LocalDateTime registerDateTime) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.registerDateTime = registerDateTime;
    }

    public  void setId(long id) {
        this.id = id;
    }
    public Long getId() {
        return this.id;
    }
    public  void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public  void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }
    public  void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public java.time.LocalDateTime getRegisterDateTime() {
        return registerDateTime;
    }

    public  void changePassword(String oldPassword, String newPassword) {
        if(!password.equals(oldPassword))
            throw new WrongIdPasswordException();
        this.password = newPassword;
    }
}
