package com.store_server.persistence.entity.store;

import com.store_server.persistence.entity.BaseEntity;
import com.store_server.persistence.entity.user.User;
import com.store_server.type.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @ManyToOne(cascade = {
    })
    private Shop shop;

    @ManyToMany(mappedBy = "orders", cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    private Set<Product> products;

    @ManyToOne
    private User user;

    public Order() {
        super();
        this.products = new HashSet<>();
    }
}
