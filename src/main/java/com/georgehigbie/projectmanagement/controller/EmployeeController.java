package com.georgehigbie.projectmanagement.controller;

import com.georgehigbie.projectmanagement.dao.ProjectRepository;
import com.georgehigbie.projectmanagement.entities.Employee;
import com.georgehigbie.projectmanagement.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepo;

    @GetMapping("/new")
    public String displayEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new-employee";
    }

    @PostMapping("/save")
    public String createEmployeeModel(Employee employee, Model model){
        employeeRepo.save(employee);
        return "redirect:/employees/new";
    }

    @PostMapping("/save")
    public String createEmployee(Employee employee, Model model){
        employeeRepo.save(employee);
        return "redirect:/employees/new";
    }

}
