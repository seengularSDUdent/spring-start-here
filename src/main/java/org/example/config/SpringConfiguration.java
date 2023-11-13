package org.example.config;

import org.example.Main.Mug;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    Mug mug0(){
        Mug beanMug = new Mug();
        beanMug.setName("Arman's Mug");
        return beanMug;
    }

    @Bean
    Mug mug1(){
        Mug beanMug = new Mug();
        beanMug.setName("Daulet's mug");
        return beanMug;
    }

    @Bean
    Mug mug2(){
        Mug beanMug = new Mug();
        beanMug.setName("Gulnur's mug");
        return beanMug;
    }
}
