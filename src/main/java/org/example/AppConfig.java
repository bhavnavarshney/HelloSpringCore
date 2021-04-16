package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
    // Creating Bean using Beam Tag
//    @Bean
//    public Samsung getPhone() {
//        return new Samsung();
//    }
//
//    @Bean
//    public MobileProcessor getProcessor() {
//        return new Snapdragon();
//    }

    // Can I create Bean without the Bean tag? - Yes!
    // 1. Add @Component above every class/bean!
    // 2. Add @ComponentScan to this class

}
