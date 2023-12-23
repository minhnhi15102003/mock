<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/dashboard.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" />


</head>
<body>


	<header>
		<img src="<%=request.getContextPath()%>/logo/Untitled.png"
			alt="FPT Logo">
		<div style="float: right;">
			<i class="fas fa-search"></i>
		</div>
	</header>
	<main>


		<aside>
			<!-- Nội dung của phần bên trái -->
			<div class="user-info" id="user-details">
				<img src="<%=request.getContextPath()%>/logo/aside.png"
					alt="FPT Aside">


				<div class="imgnhanvien">
					<div>
						<img src="<%=request.getContextPath()%>/logo/logo.img"
							alt="Anh nhan vien">
					</div>
					<div>
						<p>Admin</p>
					</div>
					<div>
						<div class="email">
							admin@fsoft.com.vn <i class="fas fa-chevron-down"></i>

						</div>
					</div>
				</div>


				<div class="divaside home">Home</div>



				<div class="divaside">
					Employee management <i class="fas fa-plus"></i>
				</div>
				<div class="divaside">
					Customer management <i class="fas fa-plus"></i>
				</div>
				<div class="divaside">
					Vaccine Type management <i class="fas fa-plus"></i>
				</div>


				<!-- HTML -->
				<div>
					<div class="divaside" onclick="toggleOptions()"
						id="vaccineManagement">
						Vaccine management <i class="fas fa-plus"></i>
					</div>
					<div class="options" id="vaccineOptions">
						<div class="vaccine-list" onclick="showVaccineList()">
							<i class="fas fa-chevron-right" id="vaccineListIcon"></i>Vaccine
							List
						</div>
						<div class="create-vaccine" onclick="showCreateVaccine()">
							<i class="fas fa-chevron-right" id="createVaccineIcon"></i>Create
							Vaccine
						</div>
					</div>
				</div>





				<div class="divaside">
					Injection Schedule<i class="fas fa-plus"></i>
				</div>
				<div class="divaside">
					Injection Result<i class="fas fa-plus"></i>
				</div>
				<div class="divaside">
					News<i class="fas fa-plus"></i>
				</div>
				<div class="divaside">
					Report<i class="fas fa-plus"></i>
				</div>


			</div>
		</aside>


		<!-- Nội dung của phần chính -->
		<div class="welcome-section">
			<h1>WELCOME TO VACCINE MANAGEMENT SYSTEM</h1>
			<div class="underline"></div>
		</div>





	</main>


	<script type="text/javascript" src="js/vaccinemanagement.js"></script>

</body>
</html>