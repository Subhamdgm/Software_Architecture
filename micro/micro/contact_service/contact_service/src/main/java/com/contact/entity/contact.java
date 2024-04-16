package com.contact.entity;

public class contact {
    private Long cId;
    private String email;
    private String contactname;
    private Long userId;

    public contact(Long cId, String email, String contactname, Long userId) {
        this.cId = cId;
        this.email = email;
        this.contactname = contactname;
        this.userId = userId;
    }

    public contact() {
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
