package com.firat.exampleapp.repo;

import com.firat.exampleapp.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Long> {

    List<Project> getAllByProjectCode(String projectCode);

    List<Project> getAllByProjectCodeContains(String projectCode);

    Page<Project> findAll(Pageable pageable);

    List<Project> findAll(Sort sort);
}
