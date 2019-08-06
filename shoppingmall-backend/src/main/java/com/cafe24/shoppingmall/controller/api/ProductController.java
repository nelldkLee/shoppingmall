package com.cafe24.shoppingmall.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.shoppingmall.controller.AbstractRESTController;
import com.cafe24.shoppingmall.domain.ProductVO;
import com.cafe24.shoppingmall.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController extends AbstractRESTController<ProductVO, ProductService> {
}
