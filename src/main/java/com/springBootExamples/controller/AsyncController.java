package com.springBootExamples.controller;

import com.springBootExamples.async.AsyncTestClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

  @Autowired
  private AsyncTestClass asyncTestClass;

  @GetMapping(value = "/async")
  public String asyncTest(){
     asyncTestClass.asyncMethod();

     return "async sended";
  }

}
