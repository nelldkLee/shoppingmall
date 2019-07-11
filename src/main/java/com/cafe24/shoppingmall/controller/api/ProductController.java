package com.cafe24.shoppingmall.controller.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.shoppingmall.controller.GenericRESTController;
import com.cafe24.shoppingmall.domain.ProductVO;
import com.cafe24.shoppingmall.dto.JSONResult;

@RestController
@RequestMapping("/api/product")
public class ProductController implements GenericRESTController<ProductVO> {

	@Override
	public JSONResult list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONResult view(@PathVariable(value="key") Long no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONResult register(@Valid @RequestBody ProductVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONResult modify(@Valid @RequestBody ProductVO vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONResult remove(@PathVariable(value="key")Long no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
