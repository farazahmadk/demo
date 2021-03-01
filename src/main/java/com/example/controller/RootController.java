package com.example.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/root")
public class RootController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String root() {
        return "Hello world!";
    }
}
