package com.sanix.todojms.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix="todojms")
public class ToDoProperties {

    private String destination;
}
