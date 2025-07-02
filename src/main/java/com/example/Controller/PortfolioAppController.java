package com.example.Controller;

import com.example.Entity.Project;
import com.example.Service.ProjectService;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PortfolioAppController {

    private ProjectService projectService;

    //@Autowired
    public PortfolioAppController(ProjectService projectService)
    {
        this.projectService = projectService;
    }

    @GetMapping("/search")
    public List<Project> getProjectByFrameworkOrByLanguage(@RequestParam String search) {
        System.out.println("Received search param: " + search);
        return projectService.getProjectByFrameworkOrByLanguage(search);
    }
    
}
