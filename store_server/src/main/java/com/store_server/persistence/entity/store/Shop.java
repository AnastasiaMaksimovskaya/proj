package com.store_server.persistence.entity.store;

import com.store_server.persistence.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "shops")
public class Shop extends BaseEntity {

    @AttributeOverride(name = "id", column = @Column(name = "shop_id"))

    private String name;
    private String address;
    private String openTime;
    private String closedTime;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REMOVE
    })
    @JoinTable(
            name = "shop_product",
            joinColumns = @JoinColumn(name = "shop_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))

    private Set<Product> products;


    @OneToMany(
            mappedBy = "shop")
    private Set<Order> orders;

    public Shop() {
        super();
        this.orders = new HashSet<>();
        this.products= new HashSet<>();
    }
}
