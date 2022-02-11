package com.store_server.persistence.entity.store.products;

import com.store_server.persistence.entity.store.Product;
import com.store_server.persistence.entity.store.brands.UniformBrand;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "uniforms")
public class Uniform extends Product {
    @Enumerated(EnumType.STRING)
    private Size size;
    private String fabric;
    @ManyToOne
    private UniformBrand uniformBrand;
    enum Size{
        S,M,L,XS,XL,XXL
    }
}

