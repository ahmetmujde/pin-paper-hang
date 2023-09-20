package com.example.pinpaperhang.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

@Data
public class Card {

    @Transient
    public static final String SEQUENCE_NAME = "cards_sequence";

    @Id
    private long id;

    private String content;

    private boolean important;

    private String createdDate;

    private String updatedDate;
}
