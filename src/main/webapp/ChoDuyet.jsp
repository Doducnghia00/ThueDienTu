<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<!DOCTYPE html>
<html>
    
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thành Công</title>
        
        <!--Import CSS-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous" />
        <link rel="stylesheet" href="css/main.css" />
        <style>
        	.bg-white{
				margin-bottom:50px;
			}
        </style>
    </head>
    
    <body class="mh-100vh">
        
        <!--Start Header-->
        <div class="bg-white">
            <nav class="navbar navbar-light p-3">
                <div class="container d-flex justify-content-between ">
                    <a class="navbar-brand d-inline-flex flex-row mx-3 justify-content-start align-items-center" href="#">
                        <img src="images/logo.png" class="img-fluid" alt="...">                    
                        <img src="images/sitename.png" class="img-fluid ml-2" alt="...">
                    </a>
                   <div >
	                    <h4 class="d-inline-block" style="margin-right: 20px">${sessionScope.hoten } </h4>
	                    <a href="index.jsp" class="btn btn-outline-secondary btn-custom border">Đăng Xuất</a>
	                </div>
                </div>
            </nav>
            <nav class="navbar navbar-light bg-light px-3 py-0 my-2">
                <div class="container d-flex justify-content-between px-4">
                    <ul class="navbar-nav d-flex flex-row justify-content-start align-items-center ">
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500 active" aria-current="page" href="DangKyThue.jsp">Đăng ký thuế lần đầu</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500" href="TinhThue.jsp">Tính Thuế</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500" href="KeKhaiThue.jsp">Kê khai thuế</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500"href="NopThue.jsp">Nộp thuế</a>
                       </li>
                       
                     </ul>
                </div>
            </nav>
        </div>
        <!--End Header-->
        
        <!--Start Content-->
        <div class = "container">
	        <h3 class="text-center mb-5">Thông tin được gửi thành công, chờ xử lý!</h3>
	        
	        <h5 class="text-center mb-5">Thông báo trạng thái xử lý sẽ được gửi về email.</h5>
	        
	       <div style = "text-align: center;">
           	 <a class="btn btn-custom border mb-5" href="home.jsp" role="button">Trang chủ</a>
        	</div>
   		</div>
        <!--End Content-->
        
        <div>
        	<p style = "height: 190px"></p>
        </div>
        
        <!--Start Footer-->
         <footer class="navbar navbar-light bg-light p-3 footer fixed-bottom">
            <div class="container d-flex justify-content-between ">
                <span>Cơ quan chủ quản: Văn phòng Chính phủ</span>
                <span>Tổng đài hỗ trợ: 18001096</span>
                <span>Email: thuedientu@chinhphu.vn</span>
            </div>               
        </footer>       
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous" />

</html>