package com.fish.service.impl;

import com.fish.domain.ResponseResult;
import com.fish.domain.entity.User;
import com.fish.service.BlogLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class BlogLoginServiceImpl implements BlogLoginService {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Override
    public ResponseResult login(User user) {
        UsernamePasswordAuthenticationToken authenticationToken =new UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword());
        authenticationManager.authenticate(authenticationToken);
        return null;
    }
}