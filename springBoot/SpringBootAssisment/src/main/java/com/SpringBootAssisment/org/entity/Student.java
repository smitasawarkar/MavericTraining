package com.SpringBootAssisment.org.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
    private double id;

    private String name;

    private String email;

    private String dept;

    private String courses;

    

    

    public Student() {

        super();

        // TODO Auto-generated constructor stub

    }

    public Student(int id,String name, String email, String dept, String courses) {

        super();

        this.id=id;

        this.name = name;

        this.email = email;

        this.dept = dept;

        this.courses = courses;

    }

    public double getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public String getName() {

        return name;

    }

    public void setEame(String name) {

        this.name = name;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public String getDept() {

        return dept;

    }

    public void setDept(String dept) {

        this.dept = dept;

    }

    public String getCourses() {

        return courses;

    }

    public void setCourses(String courses) {

        this.courses = courses;

    }

    @Override

    public String toString() {

        return "Student [name=" + name + ", email=" + email + ", dept=" + dept + ", Courses=" + courses + "]";

    }

    

    

    

}

 