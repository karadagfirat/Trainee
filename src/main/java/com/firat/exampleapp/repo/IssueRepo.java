package com.firat.exampleapp.repo;

import com.firat.exampleapp.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepo extends JpaRepository<Issue,Long> {
}
