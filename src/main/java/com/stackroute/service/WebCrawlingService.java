package com.stackroute.service;

import com.stackroute.domain.Topic;

import java.util.List;

public interface WebCrawlingService {
    void saveTopic(Topic topic);

    List<Topic> getQuestionsByTopic(String topic);

    List<Topic> getQuestion(List<String> topic);


}
