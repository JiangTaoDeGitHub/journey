package com.example.demo.entity;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 4220515347228129741L;
    private Integer id;
    private String username;
    private Integer age;
    private String message;

    public User() {
    }

    public User(Integer id, String username, Integer age, String message) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.message = message;
    }
}
