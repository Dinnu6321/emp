package com.org.mphasis.service;

import com.org.mphasis.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface EmployeeService {


    public void createEmployeeRecord(Employee employee);
    public void updateEmployeeRecord(Employee employee);
    public void deleteByEmployeeId(Integer id);
    public List<Employee> getAllEmployeeRecords();
}
