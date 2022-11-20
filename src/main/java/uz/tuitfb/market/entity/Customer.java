package uz.tuitfb.market.entity;

import uz.tuitfb.market.constant.Country;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_sequence")
    @SequenceGenerator(name = "customer_sequence", sequenceName = "customer_sequence")
    @Column(name = "id")
    private Integer id;
    @Column(name = "address")
    private String address;
    @Enumerated(EnumType.STRING)
    @Column(name = "country")
    private Country country;
    @Column(name = "phone_number")
    private String phoneNumber;

    public Customer(Integer id, String address, Country country, String phoneNumber) {
        this.id = id;
        this.address = address;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}