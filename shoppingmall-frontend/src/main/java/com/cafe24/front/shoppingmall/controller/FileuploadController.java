package com.cafe24.front.shoppingmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.cafe24.front.shoppingmall.dto.JSONResult;
import com.cafe24.front.shoppingmall.service.FileuploadService;

@Controller
public class FileuploadController {
	
	@Autowired
	private	FileuploadService fileuploadService;
	
	@RequestMapping("/form")
	public String form() {
		return"form";
	}
	
	@PostMapping("/upload")
	public @ResponseBody JSONResult<String> upload(@RequestParam(value="mainImage") MultipartFile multipartFile) {
		System.out.println(multipartFile.getOriginalFilename());
		String url = fileuploadService.restore(multipartFile);
		System.out.println(multipartFile.getOriginalFilename());
		JSONResult<String> result = new JSONResult<String>();
		result.setData(url);
		return result;
	}
}
