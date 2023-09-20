package com.example.pinpaperhang.dto.request;

import lombok.Data;

@Data
public class CardCreateRequest {
    private String content;

    private boolean important;
}
