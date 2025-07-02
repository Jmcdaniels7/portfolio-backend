package com.example.Service;

import com.example.Entity.Project;
import com.example.Repository.ProjectRepository;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    ProjectRepository projectRepository;

    
    public ProjectService(ProjectRepository projectRepository)
    {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects()
    {
        return projectRepository.findAll();
    }
    

    public List<Project> getProjectByFrameworkOrByLanguage(String search) {
        List<Project> result = projectRepository.findProjectByProjectFrameworkOrByLanguage(search);
        return result;
    }


    /* 
    public List<Project> getProjectByFramework(String framework)
    {
        return projectRepository.findProjectByProjectFramework(framework);
    }

    public List<Project> getProjectByLanguage(String language)
    {
        return projectRepository.findProjectByProjectLanguages(language);
    }
    */
}
