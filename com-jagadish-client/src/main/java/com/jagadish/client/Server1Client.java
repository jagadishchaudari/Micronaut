package com.jagadish.client;

import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

// client to connect to server1 thru eureka service discovery
// This client will be registered with Eureka server with this
// below mentioned client Id
@Client(id = "com-jagadish-server1")
public interface Server1Client {

    @Get("/hello") //GET rest end point for server 1
    public String helloFromServer1();
}