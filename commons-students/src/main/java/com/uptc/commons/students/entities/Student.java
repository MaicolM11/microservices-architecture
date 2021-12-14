package com.uptc.commons.students.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Date createAt;
    private Byte[] photo;

    public Student() {

    }

    public Student(Long id, String name, String lastName, String email, Date createAt, Byte[] photo) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.createAt = createAt;
        this.photo = photo;
    }

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

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id != null && this.id.equals(s.id);
    }

}
