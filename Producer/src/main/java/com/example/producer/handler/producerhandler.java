package com.example.producer.handler;

import org.springframework.kafka.core.KafkaTemplate;
import com.launchdarkly.eventsource.MessageEvent;
import com.launchdarkly.eventsource.background.BackgroundEventHandler;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class producerhandler implements BackgroundEventHandler{

	
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private String topic;
	
	public producerhandler(KafkaTemplate<String, String> kafkaTemplate, String topic) {
		super();
		this.kafkaTemplate = kafkaTemplate;
		this.topic = topic;
	}

	
	
	@Override
	public void onOpen() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClosed() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMessage(String event, MessageEvent messageEvent) throws Exception {
		
		System.out.println("messsage");
		log.info(String.format("Event data", messageEvent.getData()));
		System.out.println("messsage cdsfdsfs");
		kafkaTemplate.send(topic,messageEvent.getData());
		
	}

	@Override
	public void onComment(String comment) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onError(Throwable t) {
		// TODO Auto-generated method stub
		
	}

	
	

}
