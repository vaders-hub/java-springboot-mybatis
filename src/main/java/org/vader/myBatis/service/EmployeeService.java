package org.vader.myBatis.service;


import org.vader.myBatis.repository.EmployeeMyBatisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vader.myBatis.model.Employee;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMyBatisRepository employeeMyBatisRepository;

    public List<Employee> findAll() {
        return employeeMyBatisRepository.findAll();
    }

    public ArrayList<HashMap<String, Object>> findAllList() {
        return employeeMyBatisRepository.findAllList();
    }
}