package com.boot.mongoDb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoDbRepo extends MongoRepository<MongoDbModel, Integer>
{

}
