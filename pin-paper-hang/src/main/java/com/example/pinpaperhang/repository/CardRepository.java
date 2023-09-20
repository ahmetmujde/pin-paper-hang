package com.example.pinpaperhang.repository;

import com.example.pinpaperhang.entity.Card;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CardRepository extends MongoRepository<Card, Card> {

}
