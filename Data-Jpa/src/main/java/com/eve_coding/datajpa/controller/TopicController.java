package com.eve_coding.datajpa.controller;

import com.eve_coding.datajpa.model.Topic;
import com.eve_coding.datajpa.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(value = "/topics/save",method = RequestMethod.POST)
    public void saveTopic(@RequestBody Topic topic){
        topic.setTopicDate(LocalDateTime.now());
        topicService.save(topic);
    }
}
