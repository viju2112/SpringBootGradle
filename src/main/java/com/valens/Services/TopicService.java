package com.valens.Services;

import com.valens.model.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    public List<Topic> getAllTopics(){
        return Arrays.asList(new Topic("Java",10),new Topic("Scala",5));
    }
}
