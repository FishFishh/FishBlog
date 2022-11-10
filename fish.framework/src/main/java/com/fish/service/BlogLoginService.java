package com.fish.service;

import com.fish.domain.ResponseResult;
import com.fish.domain.entity.User;

public interface BlogLoginService {
    ResponseResult login(User user);
}
