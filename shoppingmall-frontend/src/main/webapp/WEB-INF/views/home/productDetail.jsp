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
          <div class="col-md-12 mb-0"><a href="index.html">Home</a> <span class="mx-2 mb-0">/</span> <strong class="text-black">${productVO.productName}</strong></div>
        </div>
      </div>
    </div>  
    <div class="site-section">
      <div class="container">
        <div class="row">
          <div class="col-md-6">
            <img src="${pageContext.servletContext.contextPath }${productVO.mainImagePath}" alt="Image" class="img-fluid">
          </div>
          <div class="col-md-6">
            <h2 class="text-black">${productVO.productName}</h2>
            <p class="mb-4">${productVO.description}</p>

			<div class="row mb-4">
				<div class="col-md-4">
	            	<strong class="text-primary h4">판매가</strong>
	            </div>
	            <div class="col-md-8">
	            	<strong class="text-primary h4"><fmt:formatNumber value="${productVO.price}" pattern="#,###"/> 원</strong>
	            </div>
			</div>
			<select id="itemSelectBox" class="form-control mb-4">
				<option value="1">선택</option>
				<c:forEach items="${productVO.itemList}" var="itemVO" varStatus="status">
					<div class="row mb-4 pl-2">
						<option value="${itemVO.itemNo}" data-stock="${itemVO.stock}"><c:forEach items="${itemVO.optionList}" var="optionVO" varStatus="i">${optionVO.optionName} : ${optionVO.optionValue} /</c:forEach> (재고수량 : ${itemVO.stock})</option>
					</div>
				</c:forEach>
            </select>
			            
            <p><a href="cart.html" class="buy-now btn btn-sm btn-primary" id="add_cart_button">Add To Cart</a></p>

          </div>
        </div>
      </div>
    </div>

    <div class="site-section block-3 site-blocks-2 bg-light">
      <div class="container">
        <div class="row justify-content-center">
          <div class="col-md-7 site-section-heading text-center pt-4">
            <h2>Featured Products</h2>
          </div>
        </div>
        <div class="row">
          <div class="col-md-12">
            <div class="nonloop-block-3 owl-carousel">
              <div class="item">
                <div class="block-4 text-center">
                  <figure class="block-4-image">
                    <img src="${pageContext.servletContext.contextPath }/assets/home/images/cloth_1.jpg" alt="Image placeholder" class="img-fluid">
                  </figure>
                  <div class="block-4-text p-4">
                    <h3><a href="#">Tank Top</a></h3>
                    <p class="mb-0">Finding perfect t-shirt</p>
                    <p class="text-primary font-weight-bold">$50</p>
                  </div>
                </div>
              </div>
              <div class="item">
                <div class="block-4 text-center">
                  <figure class="block-4-image">
                    <img src="${pageContext.servletContext.contextPath }/assets/home/images/shoe_1.jpg" alt="Image placeholder" class="img-fluid">
                  </figure>
                  <div class="block-4-text p-4">
                    <h3><a href="#">Corater</a></h3>
                    <p class="mb-0">Finding perfect products</p>
                    <p class="text-primary font-weight-bold">$50</p>
                  </div>
                </div>
              </div>
              <div class="item">
                <div class="block-4 text-center">
                  <figure class="block-4-image">
                    <img src="${pageContext.servletContext.contextPath }/assets/home/images/cloth_2.jpg" alt="Image placeholder" class="img-fluid">
                  </figure>
                  <div class="block-4-text p-4">
                    <h3><a href="#">Polo Shirt</a></h3>
                    <p class="mb-0">Finding perfect products</p>
                    <p class="text-primary font-weight-bold">$50</p>
                  </div>
                </div>
              </div>
              <div class="item">
                <div class="block-4 text-center">
                  <figure class="block-4-image">
                    <img src="${pageContext.servletContext.contextPath }/assets/home/images/cloth_3.jpg" alt="Image placeholder" class="img-fluid">
                  </figure>
                  <div class="block-4-text p-4">
                    <h3><a href="#">T-Shirt Mockup</a></h3>
                    <p class="mb-0">Finding perfect products</p>
                    <p class="text-primary font-weight-bold">$50</p>
                  </div>
                </div>
              </div>
              <div class="item">
                <div class="block-4 text-center">
                  <figure class="block-4-image">
                    <img src="${pageContext.servletContext.contextPath }/assets/home/images/shoe_1.jpg" alt="Image placeholder" class="img-fluid">
                  </figure>
                  <div class="block-4-text p-4">
                    <h3><a href="#">Corater</a></h3>
                    <p class="mb-0">Finding perfect products</p>
                    <p class="text-primary font-weight-bold">$50</p>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
	        <p>상품이 장바구니에 담겼습니다.</p>
				바로 확인 하시겠습니까?
	      </div>
	      <div class="modal-footer">
	        <a type="button" class="btn btn-primary" href="${pageContext.request.contextPath }/basket/view">예</a>
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">아니요</button>
	      </div>
	    </div>
	  </div>
	</div>
    
    <template id="item_stock_template">
    	<div class="row mb-4 item_row">
    		<div class="col-md-8" id="item_select">
    			
    		</div>
	    	<div class="col-md-4">
	              <div class="input-group mb-3" style="max-width: 120px;">
	              <div class="input-group-prepend">
	                <button class="btn btn-outline-primary js-btn-minus" type="button">&minus;</button>
	              </div>
	              <input type="text" id="count" class="form-control text-center" value="1" placeholder="" aria-label="Example text with button addon" aria-describedby="button-addon1">
	              <div class="input-group-append">
	                <button class="btn btn-outline-primary js-btn-plus" type="button">&plus;</button>
	              </div>
	            </div>
	
	    	</div>
    	</div>
    </template>
    </div>
    <c:import url="/WEB-INF/views/includes/footer.jsp" />
    <script>
    $('#itemSelectBox').change(function(e){
    	var $target = $(this).find("option:selected");
    	var item = $target.text();
    	var itemNo = $target.val();
    	var $template = $($('#item_stock_template').html());
    	$template.find('#item_select').append(item);
    	
    	if($('#item_select[name="' + itemNo + '"]').length !== 0){
    		alert('이미 선택된 상품입니다.');
    		return;
    	}
    	$template.find('#item_select').attr('name',itemNo);
    	$('#itemSelectBox').after($template);
    });
    $('#add_cart_button').click(function(e){
    	e.preventDefault();
    	
    	var itemList = [];
    	console.log($('.item_row'));
    	
    	$('.item_row').each(function(e){
    		var target = $(this);
    		var item = { itemNo : target.find('#item_select').attr('name'), count : target.find('input#count').val() }
    		
    		itemList.push(item);
    		
    		if(item.count > $('option[value="' + item.itemNo + '"]').data('stock')){
    			alert('재고 수량을 초과하였습니다.');
    			return;
    		}
    	});
    	console.log(JSON.stringify(itemList));
    	
    	$.ajax({
			url: "${pageContext.request.contextPath }/basket/list",
			type: "post",
			contentType: "application/json", //post 방식으로  JSON Type으로 데이터를 보낼 때
			dataType: "json",
			data: JSON.stringify(itemList),
			success: function(response){
				if(response.result != "success"){
					console.error(reponse.message);
					return;
				}
				console.log(response);
				if(response.result == "success"){
					$('#exampleModal').modal();
				}
				
			},
			error: function(jqXHR, status, e){
				console.error(status + ":" + e);
			}
		});
    	
    	
    	
    });
    
    function checkValidation(){
    	
    	console.log(itemList);
    	
    };
    
    </script>
  </body>
</html>