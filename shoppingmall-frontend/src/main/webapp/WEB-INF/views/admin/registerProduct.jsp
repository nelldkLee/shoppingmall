<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>Add Product - Dashboard HTML Template</title>

<c:import url="/WEB-INF/views/includes/admin-header.jsp" />
<!--
	Product Admin CSS Template
	https://templatemo.com/tm-524-product-admin
	-->
</head>

<body>

	<c:import url="/WEB-INF/views/includes/admin-navigation.jsp" />

	<div class="container tm-mt-big tm-mb-big">
		<div class="row">
			<div class="col-xl-9 col-lg-10 col-md-12 col-sm-12 mx-auto">
				<div class="tm-bg-primary-dark tm-block tm-block-h-auto">
					<div class="row">
						<div class="col-12">
							<h2 class="tm-block-title d-inline-block">Add Product</h2>
						</div>
					</div>
					<div class="row tm-edit-product-row">
						<div class="col-xl-6 col-lg-6 col-md-12">
							<form action="" class="tm-edit-product-form">
								<div class="form-group mb-3">
									<label for="productName">상품이름</label> <input
										id="product_name" name="productName" type="text"
										class="form-control validate" required />
								</div>
								<div class="form-group mb-3">
									<label for="description">상세설명</label>
									<textarea class="form-control validate" rows="3" required></textarea>
								</div>
								<div class="form-group mb-3">
									<label for="category">카테고리</label> <select
										class="custom-select tm-select-accounts" id="category" name="category">
										<option selected>Select category</option>
										<option value="1">New Arrival</option>
										<option value="2">Most Popular</option>
										<option value="3">Trending</option>
									</select>
								</div>
								<div class="row">
									<div class="form-group mb-3 col-xs-12 col-sm-6">
										<label for="expire_date">가격 </label> 
										<input id="expire_date" name="price" type="text"
											class="form-control validate" data-large-mode="true"/>
									</div>
									<div class="form-group mb-3 col-xs-12 col-sm-6">
										<label for="stock">상품옵션</label>
										<div class="btn-group w-100" role="group" id="option_active">
											<button type="button" class="btn btn-default pl-0 pr-0 w-50" data-active="true">On</button>
											<button type="button" class="btn btn-default pl-0 pr-0 w-50" data-active="false">Off</button>
										</div>
									</div>
								</div>
								<div class="row" >
									<div class="form-group mb-3 col-xs-12 col-sm-3">
										<label for="expire_date">옵션 </label> <input
											id="expire_date" name="expire_date" type="text"
											class="form-control validate" data-large-mode="true" />
									</div>
									<div class="form-group mb-3 col-xs-10 col-sm-6">
										<label for="expire_date">내용(콤마로구분)</label> <input
											id="expire_date" name="expire_date" type="text"
											class="form-control validate" data-large-mode="true" />
									</div>
									
									<div class="form-group mb-3 col-xs-12 col-sm-3">
										<label for="expire_date">&nbsp;</label>
											<button type="button" class="btn btn-default pl-0 pr-0 w-100">Add</button>
									</div>
								</div>
								<div class="col-12 mb-3 w-100 pl-0 pr-0">
								<button type="submit"
									class="btn btn-primary btn-block text-uppercase">Generate</button>
								</div>
								
						</div>
						<div class="col-xl-6 col-lg-6 col-md-12 mx-auto mb-4">
							<div class="tm-product-img-dummy mx-auto">
								<i class="fas fa-cloud-upload-alt tm-upload-icon"
									onclick="document.getElementById('fileInput').click();"></i>
							</div>
							<div class="custom-file mt-3 mb-3">
								<input id="fileInput" type="file" style="display: none;" /> <input
									type="button" class="btn btn-primary btn-block mx-auto"
									value="UPLOAD PRODUCT IMAGE"
									onclick="document.getElementById('fileInput').click();" />
							</div>
						</div>
						<div class="col-12">
							<button type="submit" class="btn btn-primary btn-block text-uppercase" id="">Add
								Product Now</button>
						</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<c:import url="/WEB-INF/views/includes/admin-footer.jsp" />
	<script>
	$(function() {
		var active = '#9c9997';
		
		$(window).resize(function() {
			updateLineChart();
			updateBarChart();
		});
		
	});
	
	</script>
</body>
</html>
