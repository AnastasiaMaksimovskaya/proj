package com.store_server.persistence.entity.store;

import com.store_server.persistence.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "products")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Product extends BaseEntity {

    @AttributeOverride(name = "id", column = @Column(name = "product_id"))

    private Integer price;

    @Column(columnDefinition = "TEXT")
    private String description;
    private String name;

    private String image;
    private Integer amount;
    private Boolean visible;


    @ManyToMany(mappedBy = "products", cascade = {
            CascadeType.PERSIST
    })
    private Set<Shop> shops;

    @ManyToMany(cascade = {
            CascadeType.MERGE,
            CascadeType.REMOVE
    })
    @JoinTable(
            name = "product_order",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id"))
    private Set<Order> orders;


    public Product() {
        super();
        this.orders = new HashSet<>();
        this.shops = new HashSet<>();
    }
}
