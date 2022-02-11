package com.store_server.persistence.entity.store.products;

import com.store_server.persistence.entity.store.Product;
import com.store_server.type.Color;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "dumbbells")
public class Dumbbell extends Product {
    private Double weight;

    @Enumerated(EnumType.STRING)
    private Color color;
}
