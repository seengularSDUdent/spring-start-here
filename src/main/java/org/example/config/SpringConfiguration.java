package org.example.config;

import org.example.Main.Mug;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    Mug mug(){
        Mug beanMug = new Mug();
        beanMug.setName("Arman's Mug");
        return beanMug;
    }
}
