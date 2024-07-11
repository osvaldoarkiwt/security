package com.projeto.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeraHash {
    
    
    
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String senha = "iwt@123";
        System.out.println("teste");
        System.out.println(encoder.encode(senha));
    }

}
