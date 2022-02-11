package com.store_server.persistence.entity.store.brands;

import com.store_server.persistence.entity.store.Brand;
import com.store_server.persistence.entity.store.products.Sneaker;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "sneaker_brand")
public class SneakerBrand extends Brand {

    @OneToMany(
            mappedBy = "sneakerBrand")
    private Set<Sneaker> sneakers;

    public SneakerBrand(){
        super();
        this.sneakers = new HashSet<>();
    }
}
