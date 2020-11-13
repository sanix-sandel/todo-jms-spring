package com.sanix.todojms.config;

import com.sanix.todojms.ToDoProducer;
import com.sanix.todojms.domain.ToDo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToDoSender {

    @Bean
    public CommandLineRunner sendToDos(@Value("${todojms.destination}") String destination,
                                       ToDoProducer producer){
        return args ->{
            producer.sendTo(destination, new ToDo("workout tomorrow morning !"));
        };
    }
}
