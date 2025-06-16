package com.example.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectId;
    private String projectName;
    private String projectFramework;
    private String projectURL;

    @ElementCollection
    private List<String> projectLanguages;

    public Project() {}

    public Project(Integer projectId, String projectName, String projectFramework, String projectURL, List<String> projectLanguages) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectFramework = projectFramework;
        this.projectURL = projectURL;
        this.projectLanguages = projectLanguages;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectFramework() {
        return projectFramework;
    }

    public void setProjectFramework(String projectFramework) {
        this.projectFramework = projectFramework;
    }

    public String getProjectURL() {
        return projectURL;
    }

    public void setProjectURL(String projectURL) {
        this.projectURL = projectURL;
    }

    public List<String> getProjectLanguages() {
        return projectLanguages;
    }

    public void setProjectLanguages(List<String> projectLanguages) {
        this.projectLanguages = projectLanguages;
    }
}
