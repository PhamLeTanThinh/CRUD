<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="dec"%>

<!DOCTYPE html>
<html>


<head>
<meta charset="UTF-8">
<title>
	<dec:title />
</title>
<!-- Required meta tags -->
<meta charset="UTF-8">

<!-- HEADER -->
<jsp:include page="/WEB-INF/views/layouts/header.jsp" />

</head>

<body>

	<div class="d-flex justify-content-between">

		<!-- SIDE BAR -->
		<jsp:include page="/WEB-INF/views/layouts/side-bar.jsp"></jsp:include>

		<div id="admin-wrapper">
			<!-- NAVBAR -->
			<jsp:include page="/WEB-INF/views/layouts/nav-bar.jsp"></jsp:include>

			<!-- CONTENT -->
			<section id="admin-content" class="p-3">
				<dec:body ></dec:body>
			</section>
		</div>
	</div>
	<!-- FOOTER -->
	<jsp:include page="/WEB-INF/views/layouts/footer.jsp"></jsp:include>
</body>
</html>