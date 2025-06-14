package com.example.controller;

import com.example.entity.Project;
import com.example.service.ProjectService;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class PortfolioAppController {

    private ProjectService projectService;

    //@Autowired
    public PortfolioAppController(ProjectService projectService)
    {
        this.projectService = projectService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Project>> getProjectByFrameworkOrByLanguage(@RequestParam String search) {
        return ResponseEntity.ok(projectService.getProjectByFrameworkOrByLanguage(search));
    }


    //endpoints for later
    /* 
    @GetMapping("/project/{framework}")
    public ResponseEntity<List<Project>> getProjectByFramework(@PathVariable String framework) {
        return ResponseEntity.ok(projectService.getProjectByFramework(framework));
    }

    @GetMapping("/project/{language}")
    public ResponseEntity<List<Project>> getProjectByLanguage(@PathVariable String language) {
        return ResponseEntity.ok(projectService.getProjectByLanguage(language));
    }
    */
    
}
