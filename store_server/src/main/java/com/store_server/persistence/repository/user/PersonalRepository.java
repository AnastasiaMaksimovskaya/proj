package com.store_server.persistence.repository.user;

import com.store_server.persistence.entity.user.Personal;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends UserRepository<Personal> {
    Personal findPersonalByEmail(String email);
}
