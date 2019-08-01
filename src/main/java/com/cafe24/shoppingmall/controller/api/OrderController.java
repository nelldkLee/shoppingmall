package com.cafe24.shoppingmall.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.shoppingmall.controller.AbstractRESTController;
import com.cafe24.shoppingmall.domain.OrderVO;
import com.cafe24.shoppingmall.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController extends AbstractRESTController<OrderVO, OrderService> {

}
