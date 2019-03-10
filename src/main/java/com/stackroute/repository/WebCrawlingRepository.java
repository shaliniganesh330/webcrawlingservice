package com.stackroute.repository;

import com.stackroute.domain.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface WebCrawlingRepository extends MongoRepository<Topic,String> {
    public List<Topic> findByTopic(String topic);
}
