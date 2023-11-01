package com.nitin.microservices.learning.zuulGateServer.netflixzuulapigatewayserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulController {

    @GetMapping("/")
    public String testing(){
        return "ZUUL Gateway is Running";
    }
}
