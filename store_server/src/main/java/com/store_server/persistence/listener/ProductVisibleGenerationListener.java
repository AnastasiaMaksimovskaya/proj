package com.store_server.persistence.listener;

import com.store_server.persistence.entity.store.Product;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

public class ProductVisibleGenerationListener {

    @PostLoad
    @PostPersist
    @PostUpdate
    public static void generateCubeVisible(Product product) {
        product.setVisible(product.getAmount() != null &&
                product.getAmount() > 0 &&
                product.getPrice() != null &&
                product.getPrice() > 0);
    }
}
