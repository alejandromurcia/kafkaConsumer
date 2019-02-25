package com.uniandes.kafka.services;

import com.uniandes.kafka.consumer.Receiver;
import com.uniandes.kafka.models.BaseMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
class KafkaReceiveService extends Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaReceiveService.class);

	/**
     * This function listens to the notifications sent.
     *
     * @param message this param represents the received notifications events.
     */
    @KafkaListener(topics = "${kafka.topic.lmax}")
    public void receive(BaseMessage message) {
        LOGGER.info("CONSUMER KAFKA: received kafka, message='{}'", message.getBody());

    }
}