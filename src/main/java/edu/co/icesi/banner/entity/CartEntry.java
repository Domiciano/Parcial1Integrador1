package edu.co.icesi.banner.entity;

import jakarta.persistence.*;

@Entity
public class CartEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;


    @ManyToOne
    @JoinColumn(name = "productID")
    private Product product;


    public CartEntry() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
