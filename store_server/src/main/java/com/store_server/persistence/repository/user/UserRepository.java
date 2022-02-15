package com.store_server.persistence.repository.user;

import com.store_server.persistence.entity.user.User;
import com.store_server.persistence.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository<U extends User> extends BaseRepository<U> {

    U findByEmail(String email);

    boolean existsByEmail(String email);

}
