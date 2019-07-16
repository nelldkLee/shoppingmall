package com.cafe24.shoppingmall.exception;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.shoppingmall.dto.JSONResult;
import com.fasterxml.jackson.databind.ObjectMapper;

@ControllerAdvice(basePackages = "com.cafe24.shoppingmall.controller.api")
@RestController
public class GlobalExceptionHandler {

	private static final Log LOG = LogFactory.getLog( GlobalExceptionHandler.class );
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Object processValidationError(MethodArgumentNotValidException ex) {
		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
		ex.getBindingResult().getFieldErrors().forEach((e)-> {
			Map<String, String> map = new HashMap<String, String>();
			System.out.println(e.getField() + " : " + e.getDefaultMessage());
			map.put("field", e.getField());
			map.put("defaultMessage", e.getDefaultMessage());
			list.add(map);
		});
		return JSONResult.fail(list);
	}
	
	@ExceptionHandler(ValidCustomException.class)
	public Object customValidationError(ValidCustomException ex) {
		return JSONResult.fail(ex.getErrors());
	}
	
	@ExceptionHandler(Exception.class)
	public void handlerException(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {
		e.printStackTrace();
		StringWriter errors = new StringWriter();
		e.printStackTrace(new PrintWriter(errors));
		System.out.println(errors.toString());

		LOG.error(errors.toString());
		String accept = request.getHeader("accept");
		if(accept.matches(".*application/json.*")) {
			//JSON 응답
			response.setStatus(HttpServletResponse.SC_OK);
			JSONResult jsonResult = JSONResult.fail(errors.toString());
			String result = new ObjectMapper().writeValueAsString(jsonResult);
			System.out.println(result);
			OutputStream os = response.getOutputStream();
			os.write(result.getBytes("UTF-8"));
			os.flush();
		} else {
			// 2. 안내페이지 가기 + 정상종료(response)
			request.setAttribute("uri", request.getRequestURI());
			request.setAttribute("exception", errors.toString());
			request.getRequestDispatcher("/WEB-INF/views/error/exception.jsp").forward(request, response);
		}
	}
}
