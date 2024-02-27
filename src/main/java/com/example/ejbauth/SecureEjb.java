package com.example.ejbauth;

import jakarta.annotation.security.DenyAll;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ejb.Singleton;

@Singleton
@RolesAllowed(value = "admin")
//@PermitAll
//@DenyAll
public class SecureEjb {
    public String secureMethodInEjb(){
        return "Secure string";
    }
}
