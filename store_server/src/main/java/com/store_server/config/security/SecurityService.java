package com.store_server.config.security;

public interface SecurityService {

    boolean isAuthenticated();

    void autoLogin(String username, String password);

    boolean existsByEmail(String email);
}
