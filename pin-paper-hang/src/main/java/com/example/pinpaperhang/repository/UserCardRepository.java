package com.example.pinpaperhang.repository;

import com.example.pinpaperhang.entity.UserCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;


public interface UserCardRepository extends MongoRepository<UserCard, UserCard> {

    @Query("{token : ?0 }")
    Optional<UserCard> findUserCardByToken(String token);


}
