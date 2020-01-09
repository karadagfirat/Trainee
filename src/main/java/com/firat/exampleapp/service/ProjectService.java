package com.firat.exampleapp.service;

import com.firat.exampleapp.entity.Project;
import com.firat.exampleapp.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    Project save(Project project);

    Project getByProjectCode(Project project);

    Project getById(Long id);

    Page<Project> getAllPageable(Pageable pageable);

    List<Project> getByProjectCodeContains(String projectCode);

    Boolean delete(Project project);
}
