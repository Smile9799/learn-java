package com.eve_coding.datajpa.service;

import com.eve_coding.datajpa.model.Topic;
import com.eve_coding.datajpa.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public void save(Topic topic){
        topicRepository.save(topic);
    }
}
