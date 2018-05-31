package com.valens.Controller;

import com.valens.Services.TopicService;
import com.valens.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping(method = RequestMethod.GET)
    List<Topic> getTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/getTopics1")
    List<Topic> getTopics1(){
        return topicService.getAllTopics();
    }
}
