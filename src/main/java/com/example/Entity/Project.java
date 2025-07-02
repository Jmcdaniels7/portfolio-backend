package com.example.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "project_framework")
    private String projectFramework;

    @Column(name = "project_url")
    private String projectURL;

    @ElementCollection
    @CollectionTable(name = "project_project_languages", joinColumns = @JoinColumn(name = "project_project_id"))
    @Column(name = "project_languages")
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


/* 
 INSERT INTO project (project_framework, project_name, project_url)
VALUES 
('Spring Boot/React', 'Portfolio Project', ' https://jmcdaniels7.github.io/PortfolioJM/'),
('Django', 'Job Blog 1.0', 'https://github.com/Jmcdaniels7/ProjectsJM/tree/main/Django/Job%20Blog%20Project'),
('Flask', 'Stock Trading Simulator', 'https://github.com/Jmcdaniels7/ProjectsJM/tree/main/Flask/Stock%20Trading%20Project'),
('Django', 'Twisted Tooth Fairy Ecommerce', 'https://github.com/Jmcdaniels7/ProjectsJM/tree/main/Django/Twisted%20Tooth%20Fairy'),
('Django/React', 'Job Blog 2.0', 'https://github.com/Jmcdaniels7/ProjectsJM/tree/main/Django/Job%20Blog%202.0'),
('N/A', 'Java DSA practice', 'https://github.com/Jmcdaniels7/ProjectsJM/tree/main/Java/dsa'),
('N/A', 'Weavers Solitaire', 'https://github.com/Jmcdaniels7/ProjectsJM/tree/main/C%2B%2B/Weavers%20Solitaire%20Project%20DS'),
('N/A', 'Hogwarts Database Design', 'https://github.com/Jmcdaniels7/ProjectsJM/tree/main/C%2B%2B/Hogwarts%20DataBase%20Design/DatabaseDesignC%2B%2B'),
('N/A', 'Messi Joes Restaurant POS', 'https://github.com/Jmcdaniels7/ProjectsJM/tree/main/C%2B%2B/Restraunt%20POS%20Project'),
('N/A', 'Warrior', 'https://github.com/Jmcdaniels7/ProjectsJM/tree/main/C%2B%2B/%20Warrior%20Game%20Project'),
('N/A', 'Resume WebPage', 'https://github.com/Jmcdaniels7/ProjectsJM/tree/main/First%20Projects/Resume%20Page%20Project'),
('N/A', 'Jiu jitsu HTML', 'https://github.com/Jmcdaniels7/ProjectsJM/blob/main/First%20Projects/JiuJitsu%20Computer%20science%20website.txt');


INSERT INTO project_project_languages (project_project_id, project_languages)
VALUES 
(1, 'Java'),
(1, 'SQL'),
(1, 'HTML'),
(1, 'CSS'),
(1, 'JavaScript'),
(2, 'Python'),
(2, 'SQL'),
(2, 'HTML'),
(2, 'CSS'),
(2, 'JavaScript'),
(3, 'Python'),
(3, 'HTML'),
(3, 'CSS'),
(3, 'JavaScript'),
(4, 'Python'),
(4, 'SQL'),
(4, 'HTML'),
(4, 'CSS'),
(4, 'JavaScript'),
(5, 'Python'),
(5, 'SQL'),
(5, 'HTML'),
(5, 'CSS'),
(5, 'JavaScript'),
(6, 'Java'),
(7, 'C++'),
(8, 'C++'),
(8, 'SQL'),
(9, 'C++'),
(10, 'C++'),
(11, 'HTML'),
(11, 'CSS'),
(12, 'HTML'),
(12, 'CSS');

*/
