<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>Thêm quyền</title>
<!-- CONTENT -->
<section id="admin-content" class="p-3">
	<%
		String rolePath = request.getContextPath() + "/role/add";
	%>
	<h3 class="mb-4 text-center">Thêm mới quyền</h3>
	<form method="post" action="<%=rolePath%>">
		<div class="row">
			<div class="col-md-6 m-auto">
				<div class="form-group">
					<label>Id</label> <input type="number" name="id"
						class="form-control" placeholder="id" />
				</div>
				<div class="form-group">
					<label>Tên quyền</label> <input type="text" name="name"
						class="form-control" placeholder="name" />
				</div>
				<div class="form-group">
					<label>Mô tả</label> <input type="text" name="description"
						class="form-control" placeholder="description" />
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-success">Lưu lại</button>
					<a class="btn btn-secondary" href="role-list.html">Quay lại</a>
				</div>
			</div>
		</div>
	</form>
</section>
</html>