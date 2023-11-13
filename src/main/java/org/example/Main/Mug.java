package org.example.Main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class Mug {
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
