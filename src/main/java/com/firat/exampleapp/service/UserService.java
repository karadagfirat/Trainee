package com.firat.exampleapp.service;

import com.firat.exampleapp.dto.UserDto;
import com.firat.exampleapp.entity.Issue;
import com.firat.exampleapp.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User save(User user);

    User getById(Long id);

    Page<User> getAllPageable(Pageable pageable);

    User getByUsername(String username);
}
