package com.store_server.persistence.repository.products;

import com.store_server.persistence.entity.store.products.Dumbbell;
import com.store_server.persistence.repository.ProductRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DumbbellRepository extends ProductRepository<Dumbbell> {
}
