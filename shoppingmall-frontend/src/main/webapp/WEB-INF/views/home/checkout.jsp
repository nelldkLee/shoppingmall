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
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Mukta:300,400,700"> 
    <c:import url="/WEB-INF/views/includes/header.jsp" />
  </head>
  <body>
  
  <div class="site-wrap">
	<c:import url="/WEB-INF/views/includes/navigation.jsp" />
    <div class="bg-light py-3">
      <div class="container">
        <div class="row">
          <div class="col-md-12 mb-0"><a href="index.html">Home</a> <span class="mx-2 mb-0">/</span> <a href="cart.html">Cart</a> <span class="mx-2 mb-0">/</span> <strong class="text-black">Checkout</strong></div>
        </div>
      </div>
    </div>

    <div class="site-section">
      <div class="container">
        <div class="row mb-5">
          <div class="col-md-12">
            <div class="border p-4 rounded" role="alert">
              Returning customer? <a href="#">Click here</a> to login
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-md-6 mb-5 mb-md-0">
            <h2 class="h3 mb-3 text-black">주문 정보</h2>
            <div class="p-3 p-lg-5 border">
              <div class="form-group row">
                <div class="col-md-4">
                  <label for="c_fname" class="text-black">받는 사람<span class="text-danger">*</span></label>
                  <input type="text" class="form-control" id="c_fname" name="receiverName" placeholder="이름">
                </div>
                <div class="col-md-8">
                  <label for="c_lname" class="text-black">연락처 <span class="text-danger">*</span></label>
                  <input type="text" class="form-control" id="c_lname" name="receiverTelephone" placeholder="핸드폰번호">
                </div>
              </div>

              <div class="form-group row">
                <div class="col-md-12">
                  <label for="c_address" class="text-black">배송지 <span class="text-danger">*</span></label>
                  <input type="text" class="form-control" id="c_address" name="receiverNormalAddress" placeholder="도로명 주소">
                </div>
              </div>

              <div class="form-group">
                <input type="text" class="form-control" name="receiverExtendAddress" placeholder="나머지 주소">
              </div>

              <div class="form-group row">
                <div class="col-md-6">
                  <label for="c_postal_zip" class="text-black">우편번호 <span class="text-danger">*</span></label>
                  <input type="text" class="form-control" id="c_postal_zip" name="receiverZipcode" placeholder="우편번호">
                </div>
                <div class="col-md-6">
                	<label for="c_account_password" class="text-black">주문 비밀번호</label>
                    <input type="email" class="form-control" id="c_account_password" name="orderPassword" placeholder="주문 비밀번호">
                </div>
              </div>

	            </div>
          </div>
          <div class="col-md-6">
            <div class="row mb-5">
              <div class="col-md-12">
                <h2 class="h3 mb-3 text-black">선택하신 상품</h2>
                <div class="p-3 p-lg-5 border">
                  <table class="table site-block-order-table mb-5">
                    <thead>
                      <th>상품</th>
                      <th>금액</th>
                    </thead>
                    <tbody>
                    <c:forEach items="${orderVO.orderItemList}" var="orderItemVO" varStatus="status">
                    
                      <tr>
                        <td>${orderItemVO.productName}<strong class="mx-2">x</strong>${orderItemVO.count} <br>
                        	${orderItemVO.optionDescription}
                        </td>
                        <td><fmt:formatNumber value="${orderItemVO.price * orderItemVO.count}" /></td>
                      </tr>
                    </c:forEach>  
                      <tr>
                        <td class="text-black font-weight-bold"><strong>주문 총액</strong></td>
                        <td class="text-black font-weight-bold"><strong><fmt:formatNumber value="${orderVO.totalPrice}" pattern="#,###"/></strong></td>
                      </tr>
                    </tbody>
                  </table>

                  <div class="border p-3 mb-3">
                    <h3 class="h6 mb-0"><a class="d-block" data-toggle="collapse" href="#collapsebank" role="button" aria-expanded="false" aria-controls="collapsebank">Direct Bank Transfer</a></h3>

                    <div class="collapse" id="collapsebank">
                      <div class="py-2">
                        <p class="mb-0">Make your payment directly into our bank account. Please use your Order ID as the payment reference. Your order wonât be shipped until the funds have cleared in our account.</p>
                      </div>
                    </div>
                  </div>

                  <div class="border p-3 mb-3">
                    <h3 class="h6 mb-0"><a class="d-block" data-toggle="collapse" href="#collapsecheque" role="button" aria-expanded="false" aria-controls="collapsecheque">Cheque Payment</a></h3>

                    <div class="collapse" id="collapsecheque">
                      <div class="py-2">
                        <p class="mb-0">Make your payment directly into our bank account. Please use your Order ID as the payment reference. Your order wonât be shipped until the funds have cleared in our account.</p>
                      </div>
                    </div>
                  </div>

                  <div class="border p-3 mb-5">
                    <h3 class="h6 mb-0"><a class="d-block" data-toggle="collapse" href="#collapsepaypal" role="button" aria-expanded="false" aria-controls="collapsepaypal">Paypal</a></h3>

                    <div class="collapse" id="collapsepaypal">
                      <div class="py-2">
                        <p class="mb-0">Make your payment directly into our bank account. Please use your Order ID as the payment reference. Your order wonât be shipped until the funds have cleared in our account.</p>
                      </div>
                    </div>
                  </div>

                  <div class="form-group">
                    <button class="btn btn-primary btn-lg py-3 btn-block" onclick="window.location='thankyou.html'">Place Order</button>
                  </div>

                </div>
              </div>
            </div>

          </div>
        </div>
        <!-- </form> -->
      </div>
    </div>

  </div>
  <c:import url="/WEB-INF/views/includes/footer.jsp" />
  <script>
  		
  	
  </script>
  </body>
</html>