package com.example.securityjwt.common;

public class RoleConstants {
    public static final String ADMIN = "hasRole('ROLE_ADMIN')";
    public static final String ALLOW_ALL_ROLE = "hasAnyAuthority('ROLE_ADMIN', 'ROLE_USER')";
    public static final String USER = "hasRole('ROLE_USER')";

    private RoleConstants() {
    }
}
