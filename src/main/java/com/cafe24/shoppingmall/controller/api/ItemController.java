package com.cafe24.shoppingmall.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.shoppingmall.controller.AbstractRESTController;
import com.cafe24.shoppingmall.domain.ItemVO;
import com.cafe24.shoppingmall.service.ItemService;

@RestController
@RequestMapping("/api/item")
public class ItemController extends AbstractRESTController<ItemVO, ItemService> {
}
