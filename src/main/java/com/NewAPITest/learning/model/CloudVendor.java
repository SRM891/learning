package com.NewAPITest.learning.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cloud_vendor_info")
public class CloudVendor {
    @Id
    private String Id;
    private String Name;
    private String product;
    private String Address;

    public CloudVendor() {
    }

    public CloudVendor(String id, String name, String product, String address) {
        Id = id;
        Name = name;
        this.product = product;
        Address = address;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "CloudVendor{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", product='" + product + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
