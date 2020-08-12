<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<title>Thêm mới thành viên</title>

<!-- CONTENT -->
<section id="admin-content" class="p-3">
	<h3 class="mb-4">Thay đổi thông tin thành viên</h3>
	<% String editUrl = request.getContextPath() + "/user/edit"; %>
	<form method="post" action="<%= editUrl %>">
		<div class="row">
			<div class="col-md-6">

				<div class="form-group">
					<label>ID</label> <input type="number" name="id" class="form-control"
						placeholder="01" value="${user.id }" />
				</div>
				<div class="form-group">
					<label>Họ tên</label> <input type="text" name="fullname"
						class="form-control" placeholder="fullname" value="${user.hoten }" />
				</div>


			</div>
			<div class="col-md-6">
				<div class="form-group">
					<label>Email</label> <input type="email" name="email"
						class="form-control" placeholder="email" value="${user.email }"/>
				</div>
				<div class="form-group">
					<label>Số điện thoại</label> <input type="text" name="phone"
						class="form-control" placeholder="phone" value="${user.sdt }"/>
				</div>

			</div>
			<div class="col-12 mt-3">
				<button type="submit" class="btn btn-success">Lưu lại</button>
				<a class="btn btn-secondary" href="user_list.jsp">Quay lại</a>
			</div>
		</div>
	</form>
</section>


</html>