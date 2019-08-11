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
							<form action="" class="product-form">
								<div class="form-group mb-3">
									<label for="productName">상품이름</label> <input
										id="product_name" name="productName" type="text"
										class="form-control validate" required />
								</div>
								<div class="form-group mb-3">
									<label for="description">상세설명</label>
									<textarea class="form-control validate" rows="3" required id="product_description" name="description"></textarea>
								</div>
								<div class="form-group mb-3">
									<label for="category">카테고리</label> <select
										class="custom-select tm-select-accounts" id="product_category" name="category">
										<option selected>Select category</option>
										<option value="1">상의</option>
										<option value="2">하의</option>
										<option value="3">악세사리</option>
										
									</select>
								</div>
								<div class="row">
									<div class="form-group mb-3 col-xs-12 col-sm-6">
										<label for="expire_date">가격 </label> 
										<input id="product_price" name="price" type="text"
											class="form-control validate" data-large-mode="true" />
									</div>
									<div class="form-group mb-3 col-xs-12 col-sm-6" id="option_active_group">
										<label for="stock">상품옵션</label>
										<div class="btn-group w-100" role="group" id="option_active" name="optionActive">
											<button type="button" class="btn btn-default pl-0 pr-0 w-50" data-active="true">On</button>
											<button type="button" class="btn btn-default pl-0 pr-0 w-50 selected" data-active="false">Off</button>
										</div>
									</div>
								</div>
								<div id="option_template">
									<div class="row" >
										<div class="form-group mb-3 col-xs-12 col-sm-3">
											<label for="product_option_name">옵션 </label> <input
												id="product_option_name" name="optionName" type="text"
												class="form-control validate" data-large-mode="true"  value="색상"/>
										</div>
										<div class="form-group mb-3 col-xs-10 col-sm-6">
											<label for="product_option_value">내용(콤마로구분)</label> <input
												id="product_option_value" name="optionValue" type="text"
												class="form-control validate" data-large-mode="true"  value="빨강,노랑"/>
										</div>
										
										<div class="form-group mb-3 col-xs-12 col-sm-3">
											<label for="option_add_button">&nbsp;</label>
												<button type="button" class="btn btn-default pl-0 pr-0 w-100" id="option_add_button">Add</button>
										</div>
									</div>
									
									<div class="col-12 mb-3 w-100 pl-0 pr-0">
									<button type="submit"
										class="btn btn-primary btn-block text-uppercase" id="option_generate_button">Generate</button>
									</div>
								</div>
								
								<!-- 옵션 제너레이트 위치 -->
								
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
							<button type="submit" class="btn btn-primary btn-block text-uppercase" id="product_add_button">Add
								Product Now</button>
						</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<template id='option_add_template'>
		<div class="row">
			<div class="form-group mb-3 col-xs-12 col-sm-3">
				<label for="product_option_name">옵션</label> <input
					id="product_option_name" name="optionName" type="text"
					class="form-control validate" data-large-mode="true"  value="사이즈"/>
			</div>
			<div class="form-group mb-3 col-xs-10 col-sm-6">
				<label for="product_option_value">내용(콤마로구분)</label> <input
					id="product_option_value" name="optionValue" type="text"
					class="form-control validate" data-large-mode="true"  value="90,95,100"/>
			</div>
			<div class="form-group mb-3 col-xs-12 col-sm-3">
				<label for="option_add_button">&nbsp;</label>
			</div>
		</div>
	</template>
	<template id="select_option_list_template">
		<div class="row item_option" ></div>
	</template>
	<template id="select_option_template">
		
			<div class="form-group mb-3 col-xs-12 col-sm-4">
				<label class="option_name"></label> <select
					class="custom-select tm-select-accounts" name="optionValue">
					<option selected>선택</option>
					<!-- option value 위치 -->
					
				</select>
			</div>
			<!--  -->	
	</template>
	<template id="option_stock_template">
		<div class="form-group mb-3 col-xs-12 col-sm-4">
			<label for="option_add_button">재고</label> <input id="product_stock"
				name="stock" type="text" class="form-control validate" />
		</div>
	</template>
	
	<c:import url="/WEB-INF/views/includes/admin-footer.jsp" />
	<script>
	$(document).ready(function() {
		var optionTemplate = $('#option_template');
		
		$('#option_active_group button').click(function(e) {
			e.preventDefault();
			console.log($(this).data('active'));
			var optionActive = $(this).data('active');
			console.log(optionActive === true);
			$('#option_active_group button').removeClass('selected');
			if(optionActive === true){
				optionTemplate.show();
			}else{
				optionTemplate.hide();
			}
			$(this).addClass('selected');
		});
		$('#option_add_button').click(function(e){
			e.preventDefault();
			e.stopPropagation();
			optionTemplate.children().first().after($('#option_add_template').html());
		});
		
		$('#option_generate_button').click(function(e) {
			e.preventDefault();
			var list = [];
			optionTemplate.children('.row').each(function(idx,target){
				console.log(idx,target);
				console.log($(this).find('div #product_option_name').val());
				console.log($(this).find('div #product_option_value').val().split(','));
				obj = {
					optionName : $(this).find('div #product_option_name').val(),
					optionValues : $(this).find('div #product_option_value').val().split(',')
				};
				list.push(obj);
				
			});
			console.log(list);
			makeOptionSelectBox(list);
		});
		
		function makeOptionSelectBox(list){
			var $selectOptionListTemplate = $($('#select_option_list_template').html());
			
			$(list).each(function() {
				var $selectOptionTemplate = $($('#select_option_template').html());
				console.log($selectOptionTemplate);
				
				$selectOptionTemplate.find('.option_name').text(this.optionName);
				console.log($selectOptionTemplate.html());
				$(this.optionValues).each(function() {
					$selectOptionTemplate.find('select').append("<option value='" + this + "'>" + this + "</option>");
				});
				console.log($('#option_stock_template').html());
				$selectOptionListTemplate.append($selectOptionTemplate);
				
			});
			$selectOptionListTemplate.append($('#option_stock_template').html());
			$('#option_template').after($selectOptionListTemplate);
			
		};
		
		$('#product_add_button').click(function(e) {
			e.preventDefault();
			var productName	= $('#product_name').val();
			console.log('productName' + productName);			
			var description	= $('#product_description').val();
			console.log('description' + description);
			var categoryObj = {categoryNo : $('#product_category').val()}
			var categoryList = [categoryObj];
			console.log('categoryList' + categoryList);
			var price = $('#product_price').val();
			console.log('price' + price);
			var optionActive= $('#option_active').find('.selected').data('active');
			console.log('optionActive' + optionActive);
			var itemList = [];
			$('.item_option').each(function(){
				var itemObj = {};
				var optionList = [];
				$(this).find('.option_name').each(function(){
					console.log($(this).text());
					console.log($(this));
					
					var option = {
							optionName : $(this).text(),
							optionValue : $(this).next('select[name="optionValue"]').val()
					}
					optionList.push(option);
					
					itemObj.stock =  $(this).closest(".item_option").find('input[name="stock"]').val();
				});
				itemObj.optionList = optionList;
				
				
				itemList.push(itemObj);
			});
			
			var obj = {
					productName, 
					description,
					categoryList,
					price,
					optionActive,
					itemList
			};
			console.log(JSON.stringify(obj));
			$.ajax({
				url: "${pageContext.request.contextPath }/admin/product",
				type: "post",
				contentType: "application/json", //post 방식으로  JSON Type으로 데이터를 보낼 때
				dataType: "json",
				data: JSON.stringify(obj),
				success: function(response){
					if(response.result != "success"){
						console.error(reponse.message);
						return;
					}
					console.log(response);
					if(response.result == "success"){
						location.href= "${pageContext.request.contextPath }/admin/products";
					}
					
				},
				error: function(jqXHR, status, e){
					console.error(status + ":" + e);
				}
			});
			
		})
		
	});
	
	</script>
</body>
</html>
