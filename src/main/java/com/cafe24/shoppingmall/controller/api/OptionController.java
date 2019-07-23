package com.cafe24.shoppingmall.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.shoppingmall.controller.AbstractRESTController;
import com.cafe24.shoppingmall.domain.OptionVO;
import com.cafe24.shoppingmall.service.OptionService;

@RestController
@RequestMapping("/api/option")
public class OptionController extends AbstractRESTController<OptionVO,OptionService>{

}
