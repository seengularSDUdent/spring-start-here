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

    @Bean
    String string(){
        return "Just a String";
    }

    @Bean
    Integer nine(){
        return 9;
    }
}
