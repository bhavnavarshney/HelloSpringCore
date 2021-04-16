package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Primary needs to be used if there are 2 classes implementing same interface and you don't know whichone should be called. Alternative of this is Qualifier (Check Samsung.java)
@Component
public class MediaTek implements MobileProcessor{
    public void process() {
        System.out.println("MediaTek: I'm the best!");
    }
}
