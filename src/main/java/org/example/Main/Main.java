package org.example.Main;

import org.example.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Mug sampleMug = new Mug();
        sampleMug.setName("Someone's Mug");

        Supplier<Mug> mugSupplier = () -> sampleMug;

        context.registerBean("someMug", Mug.class, mugSupplier, bc -> bc.setPrimary(true));

        //Testing

        Mug mugInContext = context.getBean(Mug.class);
        System.out.println(mugInContext);
    }
}