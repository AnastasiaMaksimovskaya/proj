package com.store_server.persistence.entity.store.brands;

import com.store_server.persistence.entity.store.Brand;
import com.store_server.persistence.entity.store.products.Uniform;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "uniform_brand")
public class UniformBrand extends Brand {

    @OneToMany(
            mappedBy = "uniformBrand")
    private Set<Uniform> uniforms;

    public UniformBrand(){
        super();
        this.uniforms = new HashSet<>();
    }
}
