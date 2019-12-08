package com.georgehigbie.projectmanagement.controller;

import com.georgehigbie.projectmanagement.dao.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    ProjectRepository proRepo;

    @GetMapping("/")
    public String displayHome(Model model){

    }
}
