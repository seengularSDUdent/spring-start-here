package org.example.Main;

import org.example.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Mug primaryMug = context.getBean(Mug.class);
        System.out.println(primaryMug.getName());

        Mug sampleMug0 = context.getBean("ArmanMug", Mug.class);
        System.out.println(sampleMug0.getName());

        Mug sampleMug1 = context.getBean("DauletMug", Mug.class);
        System.out.println(sampleMug1.getName());

        Mug sampleMug2 = context.getBean("mug2", Mug.class);
        System.out.println(sampleMug2.getName());
    }
}