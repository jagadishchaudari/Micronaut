package com.jagadish.server1;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

//Controller for Server 1
// This server will be registered with eureka server for
// service discovery . please refer application.yml for
// eureka service properties
@Controller("/hello")
public class HelloController {

    @Get("/")
    public String index() {
        return "Hello from Micronaut Server1";
    }
}