package com.demo.UniversityApplication.UA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String major;
    private int hallTicket;

    public Student(String name, int age, String major, int hallTicket) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.hallTicket = hallTicket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getHallTicket() {
        return hallTicket;
    }

    public void setHallTicket(int hallTicket) {
        this.hallTicket = hallTicket;
    }
}


