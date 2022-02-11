package com.store_server.persistence.entity.user;

import com.store_server.persistence.entity.BaseEntity;
import com.store_server.persistence.entity.store.Order;
import com.store_server.type.RoleType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private Boolean enabled;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_type", nullable = false)
    private RoleType roleType;

    @OneToMany(
            mappedBy = "user")
    private Set<Order> orders;

    public User() {
        super();
        this.orders = new HashSet<>();
        this.enabled = true;
    }
}
