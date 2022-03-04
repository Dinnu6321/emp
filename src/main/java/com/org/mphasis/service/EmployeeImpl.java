package com.org.mphasis.service;

import com.org.mphasis.model.Employee;
import com.org.mphasis.reposiroty.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void createEmployeeRecord(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void updateEmployeeRecord(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteByEmployeeId(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getAllEmployeeRecords() {
        return employeeRepository.findAll();
    }
}
