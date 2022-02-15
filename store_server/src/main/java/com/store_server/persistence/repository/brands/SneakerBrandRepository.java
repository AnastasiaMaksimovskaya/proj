package com.store_server.persistence.repository.brands;

import com.store_server.persistence.entity.store.brands.SneakerBrand;
import com.store_server.persistence.repository.BrandRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SneakerBrandRepository extends BrandRepository<SneakerBrand> {
}
