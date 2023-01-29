package com.example.customer;

public class Customer {

    private Long id;
    private String nif;
    private String name;

    public Customer() {
    }

    public Customer(Long id, String nif, String name) {
        this.id = id;
        this.nif = nif;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
