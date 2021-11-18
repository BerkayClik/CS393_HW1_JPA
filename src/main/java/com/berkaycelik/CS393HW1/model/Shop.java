package com.berkaycelik.CS393HW1.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_SHOP")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "NAME",length = 30)
    private String name;

    @Column(name = "ADDRESS",length = 50)
    private String address;

    @OneToMany(mappedBy = "shop",cascade = CascadeType.MERGE)
    private List<Customer> customers = new ArrayList<>();

    @OneToMany(mappedBy = "shop",cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
