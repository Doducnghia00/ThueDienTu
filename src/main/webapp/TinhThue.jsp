<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="vi-vn">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, target-densitydpi=160dpi, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="js/tinhthue.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous" />
    <link rel="stylesheet" href="css/main.css" /> 
    
    <!-- <script type="text/javascript" src="jquery-3.6.0.js"></script> -->
    
    <title>Tính thuế</title>
    <style>
		input::-webkit-outer-spin-button,
		input::-webkit-inner-spin-button {
		  -webkit-appearance: none;
		  margin: 0;
		}
		label{
			margin-bottom:20px;
		}
	    .btn{
	    	margin-left:40%;
	    	margin-right:60%
	    }
	    input[type=number] {
		  -moz-appearance: textfield;
		}
		#text{
			font-style: italic;
		}
    </style>
</head>
<body class="mh-100vh">
	
    <nav class="navbar navbar-light bg-light p-3">
            <div class="container d-flex justify-content-between ">
                <a class="navbar-brand d-inline-flex flex-row mx-3 justify-content-start align-items-center" href="#">
                    <img src="images/logo.png" class="img-fluid" alt="...">                    
                    <img src="images/sitename.png" class="img-fluid ml-2" alt="...">
                </a>
                
            </div>
        </nav>
        <nav class="navbar navbar-light bg-light px-3 py-0 my-2">
                <div class="container d-flex justify-content-between px-4">
                    <ul class="navbar-nav d-flex flex-row justify-content-start align-items-center ">
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500 " href="DangKyThue.jsp">Đăng ký thuế lần đầu</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500 active" href="TinhThue.jsp">Tính Thuế</a>
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
    <div class="mt-5 mh-100vh container w-50">
    <header>
    
        <h3 class="text-center mb-5">Tính thuế thu nhập cá nhân</h3>
        <!-- <h1>Hệ thống tính thuế thu nhập cá nhân</h1> -->
        <p><b>Chỉ cần điền Tổng thu nhập, bạn sẽ biết ngay mức thuế TNCN phải nộp</b></p>
    </header>
	<main>
		<div>
			<form class="form-2" id  = "form-2" action = "TinhThue" method = "post">
			   <div class="form-group" >
			        <label>Tổng thu nhập: <span>(*)</span></label>
			        <input type = "text" name="tongthunhap" id = "tongthunhap" class="form-control" value="">
			        <br><br>
			        <label>Số người phụ thuộc:</label>
			        <input type = "text" name="songuoiphuthuoc" id= "songuoiphuthuoc" class="form-control" value="">
			        <br><br>
			       <%--  <label>Thuế TNCN phải nộp: ${thue}</label> --%>
			       <b><p id = "kq" ></p></b>
			    </div>
			    <input type = "button" class="btn btn-custom border" value="Tính Thuế" style = "margin-top:10px; margin-bottom:10px" onclick = "TinhThue()"><br>
			    <p id = text></p>
		    </form>
		    <div>
		        <b>Bảng thu nhập tính thuế và thuế suất:</b> <br><br>
		            <div>
		                <table  class="table table-bordered">
		                    <tbody>
		                        <tr>
		                            <td>Bậc</td>
		                            <td>Thu nhập tính thuế/tháng (triệu đồng)</td>
		                            <td>Thuế suất</td>
		                        </tr>
		                        <tr>
		                            <td>1</td>
		                            <td>Đến 05 </td>
		                            <td>5 %</td>
		                        </tr>
		                        <tr>
		                            <td>2</td>
		                            <td>Trên 05 đến 10 </td>
		                            <td>10 %</td>
		                        </tr>
		                        <tr>
		                            <td>3</td>
		                            <td>Trên 10 đến 18 </td>
		                            <td>15 %</td>
		                        </tr>
		                        <tr>
		                            <td>4</td>
		                            <td>Trên 18 đến 32 </td>
		                            <td>20 %</td>
		                        </tr>
		                        <tr>
		                            <td>5</td>
		                            <td>Trên 32 đến 52 </td>
		                            <td>25 %</td>
		                        </tr>
		                        <tr>
		                            <td>6</td>
		                            <td>Trên 52 đến 80 </td>
		                            <td>30 %</td>
		                        </tr>
		                        <tr>
		                            <td>7</td>
		                            <td>Trên 80 </td>
		                            <td>35 %</td>
		                        </tr>
		                    </tbody>
		                </table>
		            </div>
		            <br>
		            <b>Lưu ý</b>
		                <p>Thu nhập tính thuế không phải tổng thu nhập mà người lao động nhận được.</p>
		        </div>
		</div>
	</main>
	</div>
		<p style = "heigh: 300px"></p>
		 <!--Start Footer-->
        <footer class="navbar navbar-light bg-light p-3 footer" style="margin-top:50px">
            <div class="container d-flex justify-content-between ">
                <span>Cơ quan chủ quản: Văn phòng Chính phủ</span>
                <span>Tổng đài hỗ trợ: 18001096</span>
                <span>Email: thuedientu@chinhphu.vn</span>
            </div>               
        </footer>
        <!--End Footer-->     
    </body>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous" />

</html>