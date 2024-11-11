package com.parking.parkinglot.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
  private Long id;

  private String username;

  private String email;

  private String password;

  private List<Cars> cars = new ArrayList<>();

  @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
  public List<Cars> getCars() {
    return cars;
  }

  public void setCars(List<Cars> cars) {
    this.cars = cars;
  }

  @Column(name = "password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Column(name = "email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Column(name = "username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setId(Long id) {
    this.id = id;
  }

    @Id
    @GeneratedValue
    public Long getId() {
    return id;
  }
}