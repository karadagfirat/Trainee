package com.firat.exampleapp.service.impl;

import com.firat.exampleapp.dto.UserDto;
import com.firat.exampleapp.entity.User;
import com.firat.exampleapp.repo.UserRepo;
import com.firat.exampleapp.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepo userRepo, ModelMapper modelMapper) {
        this.userRepo = userRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public User save(User user) {
        //Business Logic
        if(user.getEmail() == null) {
            throw new IllegalArgumentException("User email cannot be null.");
        }

        user = userRepo.save(user);
        return user;
    }

    @Override
    public User getById(Long id) {
        return userRepo.getOne(id);
    }

    @Override
    public Page<User> getAllPageable(Pageable pageable) {
        return userRepo.findAll(pageable);
    }

    @Override
    public User getByUsername(String username) {
        return userRepo.findByUsername(username);
    }

}
