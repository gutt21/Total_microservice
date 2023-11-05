package com.example.producer.myconfig;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafakatopic {

	
	
	
	@Bean
	public NewTopic newTopic() {
		return TopicBuilder.name( new Common().topi).build();
	}
	
	
	
}
