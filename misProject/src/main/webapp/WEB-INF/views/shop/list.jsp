<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<%@include file="../include/header.jsp"%>

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->


		<div class="col-md-12">
			<!-- general form elements -->
			<div class='box'>
				<div class="box-header with-border">
					<h3 class="box-title">PRODUCT LIST</h3>
				</div>


				<div class='box-body'>

					<select name="searchType">
						<option value="x"
							<c:out value="${cri.searchType == null?'selected':''}"/>>
							---</option>
						<option value="n"
							<c:out value="${cri.searchType eq 'n'?'selected':''}"/>>
							ProdName</option>
						<option value="c"
							<c:out value="${cri.searchType eq 'c'?'selected':''}"/>>
							ProdCod</option>
						<option value="nc"
							<c:out value="${cri.searchType eq 'nc'?'selected':''}"/>>
							ProdName OR ProdCod</option>
					</select> <input type="text" name='keyword' id="keywordInput"
						value='${cri.keyword }'>
					<button id='searchBtn'>Search</button>
					<button id='newBtn'>New Product</button>

				</div>
			</div>


			<div class="box">
				<div class="box-header with-border">
					<h3 class="box-title">LIST PAGING</h3>
				</div>
				<div class="box-body">
					<table class="table table-bordered">
						<tr>
							<th style="width: 10px">NO</th>
							<th>NO</th>
							<th>PRODCOD</th>
							<th>PRODNAME</th>
							<th>PRICE</th>
							<th>QUANTITY</th>
							<th>REGDATE</th>
<!-- 							<th style="width: 40px">VIEWCNT</th> -->
						</tr>

						<c:forEach items="${list}" var="productVO" varStatus="status">

							<tr>
<%-- 							<td>${(pageMaker.totalCount - status.index) - ( (pageMaker.cri.page - 1)  *  pageMaker.cri.perPageNum) } </td> --%>
								<td>${(pageMaker.totalCount - status.index) - pageMaker.listCount(pageMaker.cri.page) } </td>
								<td>${ status.count                         + pageMaker.listCount(pageMaker.cri.page) } </td>
								<td>${productVO.prodcod}</td>
								<td><a
									href='/shop/readPage${pageMaker.makeSearch(pageMaker.cri.page) }&prodcod=${productVO.prodcod}'>
										${productVO.prodname} </a></td>
								<td><span class="badge bg-red">${productVO.price}</span></td>
								<td>${productVO.quantity}</td>
								<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
										value="${productVO.regdate}" /></td>
							</tr>

						</c:forEach>

					</table>
				</div>
				<!-- /.box-body -->


				<div class="box-footer">

					<div class="text-center">
						<ul class="pagination">

							<c:if test="${pageMaker.prev}">
								<li><a
									href="list${pageMaker.makeSearch(pageMaker.startPage - 1) }">&laquo;</a></li>
							</c:if>

							<c:forEach begin="${pageMaker.startPage }"
								end="${pageMaker.endPage }" var="idx">
								<li
									<c:out value="${pageMaker.cri.page == idx?'class =active':''}"/>>
									<a href="list${pageMaker.makeSearch(idx)}">${idx}</a>
								</li>
							</c:forEach>

							<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
								<li><a
									href="list${pageMaker.makeSearch(pageMaker.endPage +1) }">&raquo;</a></li>
							</c:if>

						</ul>
					</div>

				</div>
				<!-- /.box-footer-->
			</div>
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->


<script>
	var result = '${msg}';

	if (result == 'SUCCESS') {
		alert("처리가 완료되었습니다.");
	}
</script>

<script>
	$(document).ready(
			function() {

				$('#searchBtn').on(
						"click",
						function(event) {

							self.location = "list"
									+ '${pageMaker.makeQuery(1)}'
									+ "&searchType="
									+ $("select option:selected").val()
									+ "&keyword=" + $('#keywordInput').val();

						});

				$('#newBtn').on("click", function(evt) {

					self.location = "register";

				});

			});
</script>

<%@include file="../include/footer.jsp"%>
