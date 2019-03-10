package com.stackroute.service;

import com.stackroute.domain.Topic;
import com.stackroute.repository.WebCrawlingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WebCrawlingServiceImpl implements WebCrawlingService{
    private WebCrawlingRepository webCrawlingRepository;

    @Autowired
    public WebCrawlingServiceImpl(WebCrawlingRepository webCrawlingRepository){this.webCrawlingRepository=webCrawlingRepository;}

    //Overrided method for saving searched questions//
    @Override
    public void saveTopic(Topic topic) {
        webCrawlingRepository.save(topic);
    }

    //Overrided method for getQuestionsByTopic//
    @Override
    public List<Topic> getQuestionsByTopic(String topic) { return webCrawlingRepository.findByTopic(topic); }

    @Override
    public List<Topic> getQuestion(List<String> topic) {
        return topic.stream().flatMap(t -> webCrawlingRepository.findByTopic(t).stream()).collect(Collectors.toList());
    }
}
