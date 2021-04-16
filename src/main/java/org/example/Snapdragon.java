package org.example;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor{

    public void process() {
        System.out.println("Snapdragon: I'm a super fast processor");
    }
}
