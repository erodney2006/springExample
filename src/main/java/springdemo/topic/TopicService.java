package springdemo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<topic> topics =Arrays.asList(
			new topic("one","spring","Framework1"),
			new topic("two","Java","Framework2"),
			new topic("three","javaScript","Framework3")
			
			);
	public List<topic> getAllTopics(){
		return topics;
	}
	
	public topic getTopic(String id){
		return  topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}
}
