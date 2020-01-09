package com.firat.exampleapp.service;

import com.firat.exampleapp.dto.IssueDto;
import com.firat.exampleapp.util.TPage;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issue);

}
