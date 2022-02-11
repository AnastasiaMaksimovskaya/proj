package com.store_server.persistence.entity.store.products;

import com.store_server.persistence.entity.store.Product;
import com.store_server.persistence.entity.store.brands.SneakerBrand;
import com.store_server.type.SneakerPurpose;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "sneakers")
public class Sneaker extends Product {
    private Integer size;

    @ManyToOne
    private SneakerBrand sneakerBrand;

    @Enumerated(EnumType.STRING)
    private SneakerPurpose sneakerPurpose;

}
