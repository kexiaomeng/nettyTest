package com.sun.nari.springbootnetty;

import org.apache.juli.logging.Log;
import org.springframework.boot.actuate.endpoint.AbstractExposableEndpoint;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

@Configuration
@Endpoint(id = "myendpoint")
public class MyEndPoint {

    @ReadOperation
    public String getCustom() {
        return "MyName is ." ;
    }

}
