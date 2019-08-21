<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>  
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
          <div class="col-md-12 mb-0"><a href="index.html">Home</a> <span class="mx-2 mb-0">/</span> <strong class="text-black">Cart</strong></div>
        </div>
      </div>
    </div>
    <div class="site-section">
      <div class="container">
        <form class="col-md-12" method="post" action="${pageContext.servletContext.contextPath }/order/register" id="basket_form" >
        <div class="row mb-5">
            <div class="site-blocks-table">
              <table class="table table-bordered">
                <thead>
                  <tr>
                    <th class="product-thumbnail">이미지</th>
                    <th class="product-name">상품명</th>
                    <th class="product-price">가격</th>
                    <th class="product-quantity">수량</th>
                    <th class="product-total">가격</th>
                    <th class="product-remove">&nbsp;</th>
                  </tr>
                </thead>
                <tbody>
                <c:forEach items="${basketList}" var="basketVO" varStatus="status">
                  <input type="hidden" name="orderItemList[${status.index}].itemNo" value="${basketVO.itemNo}">
                  <input type="hidden" name="orderItemList[${status.index}].optionDescription" value="${basketVO.itemVo.optionDescription}">
                  <input type="hidden" name="orderItemList[${status.index}].price" value="${basketVO.price}">
                  <input type="hidden" name="orderItemList[${status.index}].productName" value="${basketVO.productName}">
                  
                  <tr class="tr_row" data-price="${basketVO.price}">
                    <td class="product-thumbnail">
                      <img src="${pageContext.servletContext.contextPath }${basketVO.mainImagePath}" alt="Image" class="img-fluid">
                    </td>
                    <td class="product-name">
                      <h2 class="h5 text-black">${basketVO.productName}</h2>
                      <p>${basketVO.itemVo.optionDescription}</p>
                    </td>
                    <td><fmt:formatNumber value="${basketVO.price}" pattern="#,###"/></td>
                    <td>
                      <div class="input-group" style="max-width: 100%;">
                        <div class="input-group-prepend">
                          <button class="btn btn-outline-primary js-btn-minus" type="button">&minus;</button>
                        </div>
                        <input type="text" name="orderItemList[${status.index}].count" class="form-control text-center" value="${basketVO.count}" placeholder="" aria-label="Example text with button addon" aria-describedby="button-addon1">
                        <div class="input-group-append">
                          <button class="btn btn-outline-primary js-btn-plus" type="button">&plus;</button>
                        </div>
                      </div>
                    </td>
                    <td class="sub_total">${basketVO.subTotalPrice}</td>
                    <td><a href="#" class="btn btn-primary btn-sm">X</a></td>
                  </tr>
				</c:forEach>
                </tbody>
              </table>
            </div>
          
        </div>

        <div class="row">
          <div class="col-md-6">
            <div class="row mb-5">
              <div class="col-md-6 mb-3 mb-md-0">
                <button class="btn btn-primary btn-sm btn-block">Update Cart</button>
              </div>
              <div class="col-md-6">
                <button class="btn btn-outline-primary btn-sm btn-block" id="continue_shopping">Continue Shopping</button>
              </div>
            </div>
            <div class="row">
              <div class="col-md-12">
                <label class="text-black h4" for="coupon">Coupon</label>
                <p>Enter your coupon code if you have one.</p>
              </div>
              <div class="col-md-8 mb-3 mb-md-0">
                <input type="text" class="form-control py-3" id="coupon" placeholder="Coupon Code">
              </div>
              <div class="col-md-4">
                <button class="btn btn-primary btn-sm">Apply Coupon</button>
              </div>
            </div>
          </div>
          <div class="col-md-6 pl-5">
            <div class="row justify-content-end">
              <div class="col-md-7">
                <div class="row">
                  <div class="col-md-12 text-right border-bottom mb-5">
                    <h3 class="text-black h4 text-uppercase">Cart Totals</h3>
                  </div>
                </div>
                <div class="row mb-5">
                  <div class="col-md-6">
                    <span class="text-black">Total</span>
                  </div>
                  <div class="col-md-6 text-right">
                    <strong class="text-black">$230.00</strong>
                  </div>
                </div>

                <div class="row">
                  <div class="col-md-12">
                    <button id="basket_post" class="btn btn-primary btn-lg py-3 btn-block">Proceed To Checkout</button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        </form>
      </div>
    </div>
   <c:import url="/WEB-INF/views/includes/footer.jsp" />
	<script>
	$(".tr_row").on("change","input", function(e){
		console.log(e);
	});
	$(".tr_row").on("click",".btn", function(e){
		console.log(e);
		var count = parseInt($(this).closest('.input-group').find('input').val());
		var price = parseInt($(this).closest('.tr_row').data('price'));
		var subTotal = count * price;
		$(this).closest('.tr_row').find('.sub_total').text(subTotal);
	});
	$('#continue_shopping').click(function(e){
		e.preventDefault();
		e.stopPropagation();
		location.href = '${pageContext.servletContext.contextPath }';
	});
	/* $('#basket_post').click(function(e){
		e.preventDefault();
		var obj = $('form#basket_form').serializeObject();
		console.log(obj);
		$.
	}); */
	
	
	
	
	
	</script>
  </body>
</html>