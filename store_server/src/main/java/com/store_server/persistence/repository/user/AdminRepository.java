package com.store_server.persistence.repository.user;

import com.store_server.persistence.entity.user.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends UserRepository<Admin> {
    Admin findAdminByEmail(String email);
}
