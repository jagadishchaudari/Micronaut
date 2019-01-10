package com.jagadish.client;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

//Controller for the Client application
@Controller("/hello")
public class HelloController {

    private Server1Client server1Client;
    private Server2Client server2Client;

    //This is example for Setter type Dependency Injection
    HelloController(Server1Client server1Client,Server2Client server2Client) {
        this.server1Client = server1Client;
        this.server2Client = server2Client;
    }

    @Get("/server1")
    public String serv1Contoller() {
        return server1Client.helloFromServer1();
    }

    @Get("/server2")
    public String serv2Contoller() {
        return server2Client.helloFromServer2();
    }
}