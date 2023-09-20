package com.example.pinpaperhang.controller;


import com.example.pinpaperhang.dto.request.CardCreateRequest;
import com.example.pinpaperhang.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("card")
public class CardController {
    private final CardService cardService;

    @PutMapping
    public void createCard(@RequestParam(name = "token") String token, @RequestBody CardCreateRequest requestCard) {
        cardService.createCard(token, requestCard);
    }
}


