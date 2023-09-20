package com.example.pinpaperhang.service;

import com.example.pinpaperhang.entity.UserCard;
import com.example.pinpaperhang.repository.UserCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserCardService {

    private final TokenService tokenService;

    private final UserCardRepository userCardRepository;

    private final SequenceGeneratorService sequenceGeneratorService;

    public void addUserCard() {
        UserCard newUserCard = new UserCard();

        newUserCard.setId(sequenceGeneratorService.generateSequence(UserCard.SEQUENCE_NAME));
        newUserCard.setToken(tokenService.createToken());

        userCardRepository.insert(newUserCard);
    }

    public Optional<UserCard> findUserCard(String token) {
        return userCardRepository.findUserCardByToken(token);
    }

    public void saveUserCard(UserCard userCard) {
        userCardRepository.save(userCard);
    }
}
