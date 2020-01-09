package com.firat.exampleapp.service.impl;

import com.firat.exampleapp.dto.IssueDto;
import com.firat.exampleapp.entity.Issue;
import com.firat.exampleapp.repo.IssueRepo;
import com.firat.exampleapp.service.IssueService;
import com.firat.exampleapp.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepo issueRepo;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepo issueRepo, ModelMapper modelMapper) { // IssueRepo'nun koruma kalkanı bu constructordur
        this.issueRepo = issueRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public IssueDto save(IssueDto issue) {

        if(issue.getDate() == null){
            throw new IllegalArgumentException("!!");
        }

        Issue issueEntity = modelMapper.map(issue, Issue.class);
        issueEntity = issueRepo.save(issueEntity);
        issue.setId(issueEntity.getId());
        return issue;
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
        Page<Issue> data = issueRepo.findAll(pageable);
        TPage page = new TPage<IssueDto>();
        IssueDto[] dtos = modelMapper.map(data.getContent(),IssueDto[].class);
        page.setState(data, Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}
