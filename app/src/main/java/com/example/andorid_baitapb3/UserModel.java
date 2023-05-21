package com.example.andorid_baitapb3;

import java.io.Serializable;

public class UserModel implements Serializable {
    private String name;
    private String email;
    private String passwords;
    private String phone;


    public UserModel(String name, String email, String passwords, String phone) {
        this.name = name;
        this.email = email;
        this.passwords = passwords;
        this.phone = phone;
    }

    public UserModel() {

    }


    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPasswords() {
        return passwords;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", passwords='" + passwords + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
