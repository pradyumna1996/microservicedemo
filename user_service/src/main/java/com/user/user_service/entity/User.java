package com.user.user_service.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long userId;
    private String userName;
    private String userPhone;
    
    List<Contact> userContact = new ArrayList<>();
 
    
    

    public User(Long userId, String userName, String userPhone) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
    }


public User() {
}


    public User(Long userId, String userName, String userPhone, List<Contact> userContact) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userContact = userContact;
    }


    public Long getUserId() {
        return userId;
    }


    public void setUserId(Long userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserPhone() {
        return userPhone;
    }


    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }


    public List<Contact> getUserContact() {
        return userContact;
    }


    public void setUserContact(List<Contact> userContact) {
        this.userContact = userContact;
    }
 
    
    

    
}
