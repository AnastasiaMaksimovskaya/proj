package com.store_server.persistence.entity.store.brands;

import com.store_server.persistence.entity.store.Brand;
import com.store_server.persistence.entity.store.products.Ball;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "ball_brand")
public class BallBrand extends Brand {

    @OneToMany(
            mappedBy = "ballBrand")
    private Set<Ball> balls;

    public BallBrand(){
        super();
        this.balls = new HashSet<>();
    }
}
