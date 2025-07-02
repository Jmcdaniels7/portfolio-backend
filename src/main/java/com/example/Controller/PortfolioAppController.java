package com.example.Controller;

import com.example.Entity.Project;
import com.example.Service.ProjectService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

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

    @GetMapping("/project/search")
    public ResponseEntity<List<Project>> getProjectByFrameworkOrByLanguage(@RequestParam String search) {
        List<Project> projects = projectService.getProjectByFrameworkOrByLanguage(search);
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    //made this endpoint because Postman wasn't returning results for a while
    @GetMapping("/project")
    public ResponseEntity<List<Project>> findAllProjects() {
        List<Project> project = projectService.getAllProjects();
        return new ResponseEntity<>(project, HttpStatus.OK);
    }
}
