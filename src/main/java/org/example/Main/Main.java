package org.example.Main;

import org.example.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Mug primaryMug = context.getBean(Mug.class);

        System.out.println(primaryMug);
        primaryMug.setName("No one's Mug");
        System.out.println(primaryMug.getName());
    }
}