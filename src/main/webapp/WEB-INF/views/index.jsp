<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="function"
	uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
<script>
var vo = {
		  "email": "string@naver.com",
		  "extendAddress": "string",
		  "id": "string",
		  "memberName": "string",
		  "normalAddress": "string",
		  "password": "string",
		  "regDate": "2019-07-12T06:46:07.489Z",
		  "telephone": "0107343227248",
		  "zipcode": "string"
		};

$.ajax({
	url: "${pageContext.request.contextPath }/api/member",
	type: "post",
	contentType: "application/json", //post 방식으로  JSON Type으로 데이터를 보낼 때
	dataType: "json",
	data: JSON.stringify(vo),
	success: function(response){
		console.log(response)
	},
	error: function(jqXHR, status, e){
		console.error(status + ":" + e);
	}
});
</script>
</head>
<body>메인 페이지

</body>
</html>