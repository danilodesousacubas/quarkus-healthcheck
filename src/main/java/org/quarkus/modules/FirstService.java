package org.quarkus.modules;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class FirstService {
    public FirstData getFirstData(){
        FirstData data = new FirstData();
        data.setName("Name it works");
        return data;
    }
}