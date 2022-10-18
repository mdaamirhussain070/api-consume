package com.api.consume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping("api")
public class ControllerClass {


    @Autowired
    private RestTemplate restTemplate;
    private String url="https://restcountries.com/v3.1/all";
    private String url1="https://api.covidtracking.com/v1/states/info.json";

    @GetMapping("/info")
    public Object getCountriesInfo(){

        Object[] info=restTemplate.getForObject(url1,Object[].class);

        return Arrays.asList(info);
    }

}
