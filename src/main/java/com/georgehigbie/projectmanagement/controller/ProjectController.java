package com.georgehigbie.projectmanagement.controller;

import com.georgehigbie.projectmanagement.dao.ProjectRepository;
import com.georgehigbie.projectmanagement.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectRepository proRepo;

    @GetMapping("/new")
    public String displayProjectForm(Model model) {
        Project project = new Project();
        model.addAttribute("project", project);
        return "new-project";
    }

    @PostMapping("/save")
    public String createProjectModel(Project project, Model model) {
        proRepo.save(project);
        return "redirect:/projects/new"; //use redirect to prevent duplicate submissions
    }

}
