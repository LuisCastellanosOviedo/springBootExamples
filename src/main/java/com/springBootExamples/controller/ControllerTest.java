package com.springBootExamples.controller;

import com.springBootExamples.dto.Employee;
import com.springBootExamples.dto.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {



  @GetMapping(value = "/")
  public  String getRandomvalue(){
    return "from speirngboot exameple";
  }

  @GetMapping(value = "/employee/{id}")
  public Employee getEmployee(@PathVariable(value = "id") String  id){

  return Employee.builder()
      .company("My company")
      .id(id)
      .person(Person.builder()
          .age(33)
          .name("donald biden")
          .build())
      .build();
  }

  @PostMapping(value ="/employee" )
  public Employee postEmployee(@RequestBody Employee employee){
    employee.setId("99");
    return employee;
  }

}
