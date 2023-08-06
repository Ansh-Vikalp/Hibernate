package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS_TBL")
public class Address {
    @Id
    private int addressId;
    @Column(length = 150, nullable = false)
    private String streetName;
    @Column(length = 150, nullable = false)
    private String city;
    @Column(length = 20, nullable = false)
    private String pin;

    public Address() {
        super();
    }

    public Address(int addressId, String streetName, String city, String pin) {
        this.addressId = addressId;
        this.streetName = streetName;
        this.city = city;
        this.pin = pin;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address [ addressID= " + this.addressId + " streetName= " + this.streetName + " city= " + this.city
                + " pin= " + this.pin + " ]";
    }

}
