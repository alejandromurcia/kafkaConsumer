package com.uniandes.kafka.consumer;

import com.uniandes.kafka.models.BaseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;

@Service
public class Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    @Value("${kafka.max-poll:1}")
    public static int COUNT;

    private CountDownLatch latch = new CountDownLatch(COUNT);

    public CountDownLatch getLatch() {
        return latch;
    }

    @KafkaListener(topics = "${kafka.topic.basic}")
    public void receive(BaseMessage messages) {
        LOGGER.info("start of batch receive");

        LOGGER.info("end of batch receive");
    }
}
