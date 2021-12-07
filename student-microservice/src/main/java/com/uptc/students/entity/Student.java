package com.uptc.students.entity;

import java.util.Date;

public class Student {
     
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Date createAt;
    private Byte[] photo;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getCreateAt() {
        return createAt;
    }
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
    public Byte[] getPhoto() {
        return photo;
    }
    public void setPhoto(Byte[] photo) {
        this.photo = photo;
    } 

 
    
}
