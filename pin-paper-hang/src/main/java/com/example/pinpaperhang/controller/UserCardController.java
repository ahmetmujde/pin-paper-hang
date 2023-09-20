package com.example.pinpaperhang.controller;


import com.example.pinpaperhang.service.UserCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("user-card")
public class UserCardController {

    private final UserCardService userCardService;

    @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createCard() {
        userCardService.addUserCard();
    }

}

