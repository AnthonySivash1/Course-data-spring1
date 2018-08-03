package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
private List<Topic> topics= new ArrayList<>(Arrays.asList(
		
		new Topic("Spring","Spring","Spring"),
		//new Topic("Spring1","Spring1","Spring1"),
		new Topic("Spring2","Spring2","Spring2")
		
		));

  //get all topics
    public List<Topic> getAllTopics(){
    	List<Topic> topics=new ArrayList<>();
    	topicRepository.findAll().forEach(topics::add);
    	return topics;
    }
    //get oject by id
    public Optional<Topic> getTopic(String id)
    {
    	
    	return topicRepository.findById(id);
    }
//post emthod
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		
	}
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
		
	}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topicRepository.deleteById(id);
	}
}

