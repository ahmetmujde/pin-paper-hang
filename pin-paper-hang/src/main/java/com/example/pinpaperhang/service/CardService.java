package com.example.pinpaperhang.service;

import com.example.pinpaperhang.dto.request.CardCreateRequest;
import com.example.pinpaperhang.entity.Card;
import com.example.pinpaperhang.entity.UserCard;
import com.example.pinpaperhang.exception.ApiRequestException;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CardService {
    private final UserCardService userCardService;

    private final SequenceGeneratorService sequenceGeneratorService;

    public void createCard(String token, CardCreateRequest requestCard) {

        Optional<UserCard> optUserCard = userCardService.findUserCard(token);

        if (optUserCard.isPresent()) {
            UserCard userCard = optUserCard.get();

            Card newCard = new Card();
            newCard.setId(sequenceGeneratorService.generateSequence(userCard.getToken()));
            newCard.setContent(requestCard.getContent());
            newCard.setImportant(requestCard.isImportant());
            newCard.setCreatedDate(java.time.LocalDate.now().toString());
            newCard.setUpdatedDate(null);

            userCard.getCards().add(newCard);

            userCardService.saveUserCard(userCard);

        } else {
            throw new ApiRequestException("Kullanıcı Bulunamadı!");
        }

    }

}
