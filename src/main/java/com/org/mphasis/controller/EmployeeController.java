package com.org.mphasis.controller;


import com.org.mphasis.model.Employee;
import com.org.mphasis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    /* c r u d*/


    @Autowired
    EmployeeService employeeService;
    @PostMapping("/create")
    public void createEmployeeRecord(@RequestBody Employee employee) {
        employeeService.createEmployeeRecord(employee);
    }

    @PutMapping("/update")
    public void updateEmployeeRecord(@RequestBody Employee employee) {
        employeeService.updateEmployeeRecord(employee);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteByEmployeeId(@PathVariable Integer id) {
        employeeService.deleteByEmployeeId(id);
    }

    @GetMapping("/getAlla")
    public List<Employee> getAllEmployeeRecords() {
      List<Employee>list=employeeService.getAllEmployeeRecords();
      return list;
    }


}
