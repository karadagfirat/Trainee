package com.firat.exampleapp.repo;

import com.firat.exampleapp.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueHistoryRepo extends JpaRepository<IssueHistory,Long> {
}
