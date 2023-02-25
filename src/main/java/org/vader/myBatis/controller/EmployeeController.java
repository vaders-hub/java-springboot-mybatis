package org.vader.myBatis.controller;

import org.vader.myBatis.model.Employee;
import org.vader.myBatis.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping(value = "/api/v1/app/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    public ResponseEntity<?> findAll() {
        ArrayList<HashMap<String, Object>>  employee = employeeService.findAllList();

        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}
