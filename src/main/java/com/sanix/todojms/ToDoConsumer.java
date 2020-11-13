package com.sanix.todojms;

import com.sanix.todojms.domain.ToDo;
import com.sanix.todojms.repository.ToDoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.validation.*;

@Component
public class ToDoConsumer {

    private Logger log= LoggerFactory.getLogger(ToDoConsumer.class);

    private ToDoRepository repository;

    public ToDoConsumer(ToDoRepository repository){
        this.repository=repository;
    }

    @JmsListener(destination="${todojms.destination}", containerFactory="jmsFactory")
    public void processToDo(@Valid ToDo todo){
        log.info("Consumer> "+todo);
        log.info("ToDo created> "+this.repository.save(todo));
    }
}
