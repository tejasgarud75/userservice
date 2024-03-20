package com.user.entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Data
@Setter
@Getter
@NoArgsConstructor
public class User {

    private Long userId;
    private String userName;
    private String phone;
    private ArrayList<Contact> contact = new ArrayList<>();

    public User(Long userId, String userName, String phone) {
        this.userId = userId;
        this.userName = userName;
        this.phone = phone;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setContact(ArrayList<Contact> contact) {
        this.contact = contact;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Contact> getContact() {
        return contact;
    }
}
