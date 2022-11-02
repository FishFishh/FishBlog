package com.fish.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fish.domain.ResponseResult;
import com.fish.domain.entity.Category;


/**
 * 分类表(Category)表服务接口
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();
}
