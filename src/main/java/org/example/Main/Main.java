package org.example.Main;

import org.example.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Mug sampleMug = context.getBean(Mug.class);
        System.out.println(sampleMug.getName());

        Integer sampleInteger = context.getBean(Integer.class);
        System.out.println(sampleInteger.intValue());
        System.out.println(sampleInteger);
        System.out.println(sampleInteger.equals(sampleInteger.intValue()));

        String sampleString = context.getBean(String.class);
        System.out.println(sampleString.toString());
        System.out.println(sampleString);
        System.out.println(sampleString.equals(sampleString.toString()));
    }
}