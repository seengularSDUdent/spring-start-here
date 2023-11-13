package org.example.Main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Mug {

    @PostConstruct
    public void init(){
        this.name = "Vadim's Mug";
    }
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
