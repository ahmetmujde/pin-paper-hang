package com.example.pinpaperhang.service;

import org.springframework.stereotype.Service;

@Service
public class TokenService {

    public String createToken() {
        return Double.toString(Math.random());
    }
}
