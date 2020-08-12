<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import= "java.util.List" %>
<%@ page import= "thinhplt.models.User" %>
<!DOCTYPE html>
<html>

<title>Quản lý thành viên</title>


<!-- CONTENT -->

<section id="admin-content" class="p-3">
	<h3 class="mb-3">Danh sách thành viên</h3>
	<div class="row">
		<div class="col-md-8">
			<a href="<%=request.getContextPath()%>/user/add"
				class="btn btn-primary">Thêm mới</a>
		</div>
		<div class="col-md-4">
			<div class="input-group">
				<input type="text" class="form-control" placeholder="Tìm kiếm...">
				<div class="input-group-append">
					<span class="input-group-text" id="basic-addon2"><i
						class="fa fa-search"></i></span>
				</div>
			</div>
		</div>
	</div>
	<table class="table table-bordered table-hover mt-3">
		<thead>
			<tr>
				<th>STT</th>
				<th>Họ Tên</th>
				<th>Email</th>
				<th>Số ĐT</th>
				<th>#</th>
			</tr>
		</thead>
		<tbody>
			<!-- User List -->
			<c:forEach var="user" items="${users }">
			<tr>
				<td>${user.id }</td>
				<td>${user.hoten }</td>
				<td>${user.email }</td>
				<td>${user.sdt }</td>
				<td>
				<% String editPath = request.getContextPath() + "/user/edit?id="; %>
				<a href="<%=editPath %>${user.id}" class="btn btn-sm btn-info"> <i class="fa fa-pencil-square-o"></i>
				</a> 
				<% String deletePath = request.getContextPath() + "/user/delete?id="; %>
				<a href="<%= deletePath %>${user.id}" class="btn btn-sm btn-danger"> <i class="fa fa-trash-o"></i>
				</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</section>
</html>