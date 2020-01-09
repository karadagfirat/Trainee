package com.firat.exampleapp.service.impl;

import com.firat.exampleapp.entity.IssueHistory;
import com.firat.exampleapp.repo.IssueHistoryRepo;
import com.firat.exampleapp.service.IssueHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class IssueHistoryServiceImpl implements IssueHistoryService {

    private final IssueHistoryRepo issueHistoryRepo;

    public IssueHistoryServiceImpl(IssueHistoryRepo issueHistoryRepo) {
        this.issueHistoryRepo = issueHistoryRepo;
    }

    @Override
    public IssueHistory save(IssueHistory issueHistory) {
        //Business Logic
        if(issueHistory.getDate() == null){
            throw new IllegalArgumentException("Issue cannot be null.");
        }

        issueHistory = issueHistoryRepo.save(issueHistory);
        return issueHistory;
    }

    @Override
    public IssueHistory getById(Long id) {
        return issueHistoryRepo.getOne(id);
    }

    @Override
    public Page<IssueHistory> getAllPageable(Pageable pageable) {
        return issueHistoryRepo.findAll(pageable);
    }

    @Override
    public Boolean delete(IssueHistory issueHistory) {
        issueHistoryRepo.delete(issueHistory);
        return Boolean.TRUE;
    }
}
