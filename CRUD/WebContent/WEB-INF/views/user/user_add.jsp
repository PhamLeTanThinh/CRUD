<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<title>Thêm mới thành viên</title>

<!-- CONTENT -->
<section id="admin-content" class="p-3">
	<h3 class="mb-4">Thêm mới thành viên</h3>
	<% String addUrl = request.getContextPath() + "/user/add"; %>
	<form method="post" action="<%= addUrl %>">
		<div class="row">
			<div class="col-md-6">

				<div class="form-group">
					<label>ID</label> <input type="number" name="id" class="form-control"
						placeholder="01" />
				</div>
				<div class="form-group">
					<label>Họ tên</label> <input type="text" name="fullname"
						class="form-control" placeholder="fullname" />
				</div>

				<!-- 				<div class="form-group">
					<label>Mật khẩu</label> <input type="password" name="password"
						class="form-control" placeholder="password" />
				</div> -->

			</div>
			<div class="col-md-6">
				<div class="form-group">
					<label>Email</label> <input type="email" name="email"
						class="form-control" placeholder="email" />
				</div>
				<div class="form-group">
					<label>Số điện thoại</label> <input type="text" name="phone"
						class="form-control" placeholder="phone" />
				</div>

				<!-- 				<div class="form-group">
					<label>Địa chỉ</label> <input type="text" name="address"
						class="form-control" placeholder="address" />
				</div> -->
				<!-- 				<div class="form-group">
					<label>Avatar</label> <input type="text" name="avatar"
						class="form-control" placeholder="avatar" />
				</div> -->
			</div>
			<div class="col-12 mt-3">
				<button type="submit" class="btn btn-success">Lưu lại</button>
				<a class="btn btn-secondary" href="user_list.jsp">Quay lại</a>
			</div>
		</div>
	</form>
</section>


</html>