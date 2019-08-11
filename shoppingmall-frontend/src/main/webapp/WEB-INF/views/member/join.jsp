<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>Shoppers &mdash; Colorlib e-Commerce Template</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<c:import url="/WEB-INF/views/includes/header.jsp" />

</head>
<body>

	<div class="site-wrap">
		<c:import url="/WEB-INF/views/includes/navigation.jsp" />
		<div class="bg-light py-3">
			<div class="container">
				<div class="row">
					<div class="col-md-12 mb-0">
						<a href="index.html">Home</a> <span class="mx-2 mb-0">/</span> <strong
							class="text-black">Contact</strong>
					</div>
				</div>
			</div>
		</div>

		<div class="site-section">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<h2 class="h3 mb-3 text-black">회원가입</h2>
					</div>
					<div class="col-md-7">

						<form action="#" method="post">

							<div class="p-3 p-lg-5 border">
								<form action="${pageContext.request.contextPath}" method="post">
									<div class="form-group row">
										<div class="col-md-6">
											<label for="c_fname" class="text-black">아이디 <span
												class="text-danger">*</span></label> <input type="text"
												class="form-control" id="c_fname" name="id">
										</div>
										<div class="col-md-2">
										
											<label for="c_lname" class="text-black">&nbsp;<span
												class="text-danger"></span></label> <i class="fas fa-check"></i>
										
										</div>
										<div class="col-md-4">
											<label for="c_lname" class="text-black">&nbsp;<span
												class="text-danger"></span></label> <input type="submit" class="btn btn-primary btn-lg btn-block" id="checkId"
												value="중복 체크">
										</div>
									</div>
									<div class="form-group row">
										<div class="col-md-12">
											<label for="c_email" class="text-black">패스워드 <span
												class="text-danger">*</span></label> <input type="password"
												class="form-control" id="password" name="password"
												placeholder="">
										</div>
									</div>
									<div class="form-group row">
										<div class="col-md-12">
											<label for="c_email" class="text-black">패스워드 확인 <span
												class="text-danger">*</span></label> <input type="password"
												class="form-control" id="c_email"
												placeholder="">
										</div>
									</div>
									
									<div class="form-group row">
										<div class="col-md-12">
											<label for="c_email" class="text-black">이메일 <span
												class="text-danger">*</span></label> <input type="email"
												class="form-control" id="email" name="email"
												placeholder="">
										</div>
									</div>
									<div class="form-group row">
										<div class="col-md-12">
											<label for="c_subject" class="text-black">전화번호 </label> <input
												type="text" class="form-control" id="telephone"
												name="telephone">
										</div>
									</div>
									
									<div class="form-group row">
										<div class="col-md-12">
											<label for="c_subject" class="text-black">기본주소 </label> <input
												type="text" class="form-control" id="normal_address"
												name="normalAddress">
										</div>
									</div>
									
	
									<div class="form-group row">
										<div class="col-lg-12">
											<input type="submit" class="btn btn-primary btn-lg btn-block" id="join_button"
												value="회원가입">
										</div>
									</div>
								</form>
							</div>
						</form>
					</div>
					<div class="col-md-5 ml-auto">
						<div class="p-4 border mb-3">
							<span class="d-block text-primary h6 text-uppercase">New
								York</span>
							<p class="mb-0">203 Fake St. Mountain View, San Francisco,
								California, USA</p>
						</div>
						<div class="p-4 border mb-3">
							<span class="d-block text-primary h6 text-uppercase">London</span>
							<p class="mb-0">203 Fake St. Mountain View, San Francisco,
								California, USA</p>
						</div>
						<div class="p-4 border mb-3">
							<span class="d-block text-primary h6 text-uppercase">Canada</span>
							<p class="mb-0">203 Fake St. Mountain View, San Francisco,
								California, USA</p>
						</div>

					</div>
				</div>
			</div>
		</div>
		<div class="modal" tabindex="-1" role="dialog">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title">중복 체크</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		        	<p>회원가입 가능하신 아이디입니다.</p>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-primary">Save changes</button>
		        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		      </div>
		    </div>
		  </div>
		</div>
													
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
		<script>
			$('#checkId').click(function(e) {
				e.preventDefault();
				$.ajax({
					url: "${pageContext.request.contextPath }/member/checkId?id="+ $('input[name="id"]').val(),
					type: "get",
					contentType: "application/json", //post 방식으로  JSON Type으로 데이터를 보낼 때
					dataType: "json",
					success: function(response){
						if(response.result != "success"){
							console.error(reponse.message);
							return;
						}
						
						if(response.result == "success"){
							alert('회원가입 가능한 아이디입니다.');
						}
					},
					error: function(jqXHR, status, e){
						console.error(status + ":" + e);
					}
				});
				
			});
			$("#join_button").click(function(e){
				e.preventDefault();
				location.href="${pageContext.request.contextPath }/member/login";
			});
		</script>
	</div>
</body>
</html>