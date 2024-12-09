package com.parking.parkinglot.entities;

import jakarta.persistence.*;

@Entity
public class UserGroup {
    @GeneratedValue
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String userGroup;

    private String username;

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}