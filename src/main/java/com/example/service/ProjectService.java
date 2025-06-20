package com.example.service;

import com.example.entity.Project;
import com.example.repository.ProjectRepository;

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
    

    public List<Project> getProjectByFrameworkOrByLanguage(String search)
    {
        return projectRepository.findProjectByProjectFrameworkOrByLanguage(search);
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
