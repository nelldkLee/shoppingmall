<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>Cafe24 &mdash; Colorlib e-Commerce Template</title>
<meta charset="utf-8">
<meta name="viewport"	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"	href="https://fonts.googleapis.com/css?family=Mukta:300,400,700">
<link rel="stylesheet"	href="${pageContext.servletContext.contextPath }/assets/home/fonts/icomoon/style.css">
<link rel="stylesheet"	href="${pageContext.servletContext.contextPath }/assets/home/css/bootstrap.min.css">
<link rel="stylesheet"	href="${pageContext.servletContext.contextPath }/assets/home/css/magnific-popup.css">
<link rel="stylesheet"	href="${pageContext.servletContext.contextPath }/assets/home/css/jquery-ui.css">
<link rel="stylesheet"	href="${pageContext.servletContext.contextPath }/assets/home/css/owl.carousel.min.css">
<link rel="stylesheet"	href="${pageContext.servletContext.contextPath }/assets/home/css/owl.theme.default.min.css">
<link rel="stylesheet"	href="${pageContext.servletContext.contextPath }/assets/home/css/aos.css">
<link rel="stylesheet"	href="${pageContext.servletContext.contextPath }/assets/home/css/style.css">

</head>
<body>

	<div class="site-wrap">
		<c:import url="/WEB-INF/views/includes/header.jsp" />
		<div class="bg-light py-3">
			<div class="container">
				<div class="row">
					<div class="col-md-12 mb-0">
						<a href="index.html">Home</a> <span class="mx-2 mb-0">/</span> <strong
							class="text-black">Login</strong>
					</div>
				</div>
			</div>
		</div>

		<div class="site-section login">
			<div class="container">
				<div class="row">
					<div class="col-md-3 mb-5 mb-md-0"></div>
					<div class="col-md-6 mb-5 mb-md-0 text-center">
						<h2 class="h3 mb-3 text-black">Login</h2>
						<div class="p-3 p-lg-5 border">
							<form id="login-form" method="post" >
								<div class="form-group row">
									<div class="col-md-12">
										<input type="text" class="form-control" id="input-id" name="id">
									</div>
								</div>
								<div class="form-group row">
									<div class="col-md-12">
										<input type="password" class="form-control" id="input-password" name="password">
									</div>
								</div>
								<div class="form-group row">
									<div class="col-md-12">
										<input type="submit" class="btn btn-sm btn-primary" id="login" value="logIn">
									</div>
								</div>
							</form>
							<div class="form-group row">
								<div class="col-md-12">
								<input type="submit" class="btn btn-sm btn-primary" value="SignIn">
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
			<div class="col-md-3 mb-5 mb-md-0"></div>
		</div>

		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
	<script>
	$("#login-form").submit(function(event){
		// submit event 기본 동작을 막음
		// posting을 막음
		event.preventDefault();
		
		var vo = {};
		
		vo.id = $("#input-id").val();
		vo.password = $("#input-password").val();
		
		//console.log( $.param(vo) );
		//console.log( JSON.stringify(vo) );
		
		$.ajax({
			url: "${pageContext.request.contextPath }/member/auth",
			type: "post",
			contentType: "application/json", //post 방식으로  JSON Type으로 데이터를 보낼 때
			dataType: "json",
			data: JSON.stringify(vo),
			success: function(response){
				if(response.result != "success"){
					console.error(reponse.message);
					return;
				}
			},
			error: function(jqXHR, status, e){
				console.error(status + ":" + e);
			}
		});
	})
	</script>
</body>
</html>