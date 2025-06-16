package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Project;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;



import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

    //magic queries
    //List<Project> findProjectByProjectFramework(String projectFramework);
    //List<Project> findProjectByProjectLanguages(String projectLanguage);

    //utilizing query parameters
    @Query("""
    SELECT p
    FROM Project p
    LEFT JOIN p.projectLanguages lang
    WHERE LOWER(p.projectFramework) LIKE LOWER(CONCAT('%', :search, '%'))
       OR LOWER(lang) LIKE LOWER(CONCAT('%', :search, '%'))
    """)
    List<Project> findProjectByProjectFrameworkOrByLanguage(@Param("search") String search);

    
}
