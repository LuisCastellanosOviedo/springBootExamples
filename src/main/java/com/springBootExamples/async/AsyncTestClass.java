package com.springBootExamples.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncTestClass {

  @Async
  public void  asyncMethod(){
    System.out.println("ANTES DEL SLEEP DE 1000");
    try {
      Thread.sleep(7000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("DESPUES  DEL SLEEP DE 1000");

  }


}
