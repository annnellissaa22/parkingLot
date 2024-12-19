package com.parking.parkinglot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "cars")
public class Car {
    @GeneratedValue
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull(message = "Owner cannot be null")
    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    @NotNull(message = "Parking spot cannot be null")
    @Column(name = "parking_spot")
    private String parkingSpot;

    @NotNull(message = "License plate cannot be null")
    @Column(name = "license_plate")
    private String licensePlate;

    private CarPhoto photo;

    @Size(min = 3, max = 100)
    @Column(unique = true, nullable = false, length = 100)
    public String getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(String parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    @Size(min = 3, max = 100)
    @Column(unique = true, nullable = false, length = 100)
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Size(min = 3, max = 100)
    @Column(unique = true, nullable = false, length = 100)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Size(min = 3, max = 100)
    @Column(unique = true, nullable = false, length = 100)
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public CarPhoto getPhoto() {
        return photo;
    }

    public void setPhoto(CarPhoto photo) {
        this.photo = photo;
    }
}