package com.store_server.persistence.repository;

import com.store_server.persistence.entity.store.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository<P extends Product> extends BaseRepository<Product> {

}
