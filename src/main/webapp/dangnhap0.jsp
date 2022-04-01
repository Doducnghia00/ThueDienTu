<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous" />
<link rel="stylesheet" href="css/main.css" />
<title>Thuế Việt Nam</title>
<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {	
	}
}
.Huy {
	text-decoration: none;
	color: white;
}
</style>
</head>
<body class="mh-100vh">

	<nav class="navbar navbar-light bg-light p-3">
		<div class="container d-flex justify-content-between ">
			<a
				class="navbar-brand d-inline-flex flex-row mx-3 justify-content-start align-items-center"
				href="#"> <img src="images/logo.png" class="img-fluid" alt="...">
				<img src="images/sitename.png" class="img-fluid ml-2" alt="...">
			</a>

		</div>
	</nav>
	<div class="container"
		style="text-align: center length=100px; width: 600px;">

		<main class="form-signin">
			<form action="DangNhap" method="post">
				<h1>Đăng Nhập</h1>
				<div>
					
						<label>Tài khoản</label> <input name="username"
							class="form-control" id="floatingInput1"
							placeholder="Nhập số CMT/CCCD">
				</div>

				<div>
					<label for="pwd" class="form-label">Mật khẩu</label> 
					<input type="password" class="form-control" id="pwd"
						placeholder="***********" name="password" required>
				</div>

				<div class="checkbox mb-3">
					<label> <input type="checkbox" value="remember-me">
						Nhớ tài khoản
					</label>
				</div>
				<!-- <button class="w-100 btn btn-lg btn-primary" type="submit">Đăng Nhập</button> -->
				<input type="submit" class="w-100 btn btn-lg btn-primary" value="Đăng Nhập">
				<button id="btn-huy" style="margin-top: 10px; margin-left: 45%;"
					type="button" class="btn btn-danger">
					<a href="http://localhost:8080/Cong_dich_vu_con/home.html"
						class="Huy">Hủy</a>
				</button>
			 </form>
		</main>
	</div>
	</div>
	<footer class="navbar navbar-light bg-light p-3 footer fixed-bottom">
		<div class="container d-flex justify-content-between ">
			<span>Cơ quan chủ quản: Văn phòng Chính phủ</span> <span>Tổng
				đài hỗ trợ: 18001096</span> <span>Email: thuedientu@chinhphu.vn</span>
		</div>
	</footer>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous" />
</html>