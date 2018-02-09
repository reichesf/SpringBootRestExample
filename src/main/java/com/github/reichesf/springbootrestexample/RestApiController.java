package com.github.reichesf.springbootrestexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController
{
    @RequestMapping("/")
    public String index()
    {
        return "Greetings from " + this.getClass().getSimpleName() + '!' + System.getProperty("line.separator");
    }
}
