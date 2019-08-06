package com.cafe24.shoppingmall.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.shoppingmall.controller.AbstractRESTController;
import com.cafe24.shoppingmall.domain.BasketVO;
import com.cafe24.shoppingmall.service.BasketService;

@RestController
@RequestMapping("/api/basket")
public class BasketController extends AbstractRESTController<BasketVO, BasketService> {

}
