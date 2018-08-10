<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">REGISTER PRODUCT</h3>
				</div>
				<!-- /.box-header -->

				<form role="form" method="post">
					<div class="box-body">
						<div class="form-group">
							<label for="exampleInputEmail1">PRODNAME</label> <input type="text"
								name='prodname' class="form-control" placeholder="Enter Prodname">
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">PRICE</label> <input type="text"
								name='price' class="form-control" placeholder="Enter Price">
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">QUANTITY</label> <input type="text"
								name='quantity' class="form-control" placeholder="Enter Quantity">
						</div>
						<!-- 						<div class="form-group">
							<label for="exampleInputEmail1">Writer</label> <input type="text"
								name="writer" class="form-control" placeholder="Enter Writer">
						</div> -->
					</div>
					<!-- /.box-body -->
					<div class="box-footer">
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</form>


			</div>
			<!-- /.box -->
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->

<%@include file="../include/footer.jsp"%>
