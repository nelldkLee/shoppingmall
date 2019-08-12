package com.cafe24.shoppingmall.controller.api;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.shoppingmall.controller.AbstractRESTController;
import com.cafe24.shoppingmall.domain.BasketVO;
import com.cafe24.shoppingmall.dto.JSONResult;
import com.cafe24.shoppingmall.service.BasketService;

@RestController
@RequestMapping("/api/basket")
public class BasketController extends AbstractRESTController<BasketVO, BasketService> {
	
	@PostMapping("/list")
	public JSONResult registerList(@RequestBody List<BasketVO> basketList) {
		service.insertList(basketList);
		return JSONResult.success(null);	
	}
}
