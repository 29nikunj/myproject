package com.example.demo.topic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    //returning objects from controller( response is a list and Spring MVC will automatically convert it to json and sent back as http response)

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){

//        return Arrays.asList(
//                new Topic("spring","spring framework","spring framework desscription"),
//                new Topic("spring","spring framework","spring framework desscription"),
//                new Topic("spring","spring framework","spring framework desscription")
//
//
//
//        );

        return topicService.getAllTopics();


    }


    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){

        return topicService.getTopic(id);

    }

    @RequestMapping(value = "/topics",method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){

        topicService.addTopic(topic);

    }

    @RequestMapping(value = "/topics/{id}",method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id){

        topicService.updateTopic(id,topic);

    }



    @RequestMapping(value = "/topics/{id}",method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id){

        topicService.deleteTopic(id);

    }
}
