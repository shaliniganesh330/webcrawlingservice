package com.stackroute.controller;

import com.stackroute.domain.Question;
import com.stackroute.service.WebCrawlingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1")
//@CrossOrigin(origins = "*")

public class WebCrawlingController {

    private WebCrawlingService webCrawlingService;

    @Autowired
    public WebCrawlingController(WebCrawlingService webCrawlingService){this.webCrawlingService=webCrawlingService;}

    @PostMapping("question")
    public ResponseEntity<?> postQuestion(){
     return null;
    }

    @GetMapping ("question/{questionId}")
    public ResponseEntity<?> getQuestionById(@PathVariable int questionId,@RequestBody Question question){
     return  null;
    }

    @GetMapping("questions")
    public ResponseEntity<?> getAllQuestions(){
     return null;
    }

    @GetMapping("topic")
    public ResponseEntity<?> getQuestionOfTopic(){
     return  null;
    }
}
