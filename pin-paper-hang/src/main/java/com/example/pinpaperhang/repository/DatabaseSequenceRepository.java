package com.example.pinpaperhang.repository;

import com.example.pinpaperhang.entity.DatabaseSequence;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface DatabaseSequenceRepository extends MongoRepository<DatabaseSequence, DatabaseSequence> {

}
