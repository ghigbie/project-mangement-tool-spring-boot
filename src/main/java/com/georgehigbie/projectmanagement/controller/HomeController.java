package com.georgehigbie.projectmanagement.controller;

import com.georgehigbie.projectmanagement.dao.EmployeeRepository;
import com.georgehigbie.projectmanagement.dao.ProjectRepository;
import com.georgehigbie.projectmanagement.entities.Employee;
import com.georgehigbie.projectmanagement.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ProjectRepository proRepo;

    @Autowired
    EmployeeRepository employeeRepo;

    @GetMapping("/")
    public String displayHome(Model model){
        List<Project> projects = proRepo.findAll();
        model.addAttribute("projectsList", projects);

        List<Employee> employee = employeeRepo.findAll();
        model.addAttribute("employeesList", employee);
        return "home";
    }
}
