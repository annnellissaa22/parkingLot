package com.parking.parkinglot.common;

import com.parking.parkinglot.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class UserDto {
    Long id;
    String username;
    List<Car> cars = new ArrayList<>();

    public UserDto(Long id, String username, List<Car> cars) {
        this.id = id;
        this.username = username;
        this.cars = cars;
    }
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public List<Car> getCars() {
        return cars;
    }



}
