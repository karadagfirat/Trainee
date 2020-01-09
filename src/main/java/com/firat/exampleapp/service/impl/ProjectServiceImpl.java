package com.firat.exampleapp.service.impl;

import com.firat.exampleapp.entity.Project;
import com.firat.exampleapp.repo.ProjectRepo;
import com.firat.exampleapp.service.ProjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepo projectRepo;

    public ProjectServiceImpl(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    @Override
    public Project save(Project project) {

        if(project.getProjectCode()== null) {
            throw new IllegalArgumentException("Project code cannot be null");
        }
        return projectRepo.save(project);
    }

    @Override
    public Project getByProjectCode(Project project) {
        return null;
    }

    @Override
    public Project getById(Long id) {
        return projectRepo.getOne(id);
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return projectRepo.findAll(pageable);
    }

    @Override
    public List<Project> getByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public Boolean delete(Project project) {
        return null;
    }
}
