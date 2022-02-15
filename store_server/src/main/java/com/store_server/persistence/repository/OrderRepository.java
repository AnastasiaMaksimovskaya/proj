package com.store_server.persistence.repository;

import com.store_server.persistence.entity.store.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends BaseRepository<Order> {
}
