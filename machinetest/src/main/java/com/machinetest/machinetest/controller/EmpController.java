package com.machinetest.machinetest.controller;

import com.machinetest.machinetest.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmpController extends GenericController<Employee>{
}
