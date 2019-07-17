package com.cafe24.shoppingmall.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.shoppingmall.controller.AbstractRESTController;
import com.cafe24.shoppingmall.domain.CategoryVO;
import com.cafe24.shoppingmall.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController extends AbstractRESTController<CategoryVO, CategoryService>{

}
