package com.store_server.persistence.repository.brands;

import com.store_server.persistence.entity.store.brands.BallBrand;
import com.store_server.persistence.repository.BrandRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BallBrandRepository extends BrandRepository<BallBrand> {
}
