package com.store_server.persistence.entity.store.products;

import com.store_server.persistence.entity.store.Product;
import com.store_server.persistence.entity.store.brands.BallBrand;
import com.store_server.type.BallPurpose;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="balls")
public class Ball extends Product {
    private Integer size;

    @ManyToOne
    private BallBrand ballBrand;

    @Enumerated(EnumType.STRING)
    private BallPurpose ballPurpose;
}
