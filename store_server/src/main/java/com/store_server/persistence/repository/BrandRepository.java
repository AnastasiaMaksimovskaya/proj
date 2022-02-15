package com.store_server.persistence.repository;

import com.store_server.persistence.entity.store.Brand;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository<B extends Brand> extends BaseRepository<Brand>{
}
