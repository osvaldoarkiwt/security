package com.projeto.security.model.dto;

public record LoginResponse(String accessToken,String userName, Long expiresIn) {
    
}