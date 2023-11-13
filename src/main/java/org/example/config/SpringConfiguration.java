package org.example.config;

import org.example.Main.Mug;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringConfiguration {

    @Bean(name = "ArmanMug")
    Mug mug0(){
        Mug beanMug = new Mug();
        beanMug.setName("Arman's Mug");
        return beanMug;
    }

    @Bean(value = "DauletMug")
    Mug mug1(){
        Mug beanMug = new Mug();
        beanMug.setName("Daulet's mug");
        return beanMug;
    }

    @Bean
    @Primary
    Mug mug2(){
        Mug beanMug = new Mug();
        beanMug.setName("Gulnur's mug");
        return beanMug;
    }
}
