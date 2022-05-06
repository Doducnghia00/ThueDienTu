
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<!DOCTYPE html>
<html>
    
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Kê Khai Thuế</title>
        
        <!--Import CSS-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous" />
        <link rel="stylesheet" href="css/main.css" />
        
    </head>
    
    <body>
        
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
                         <a class="nav-link fs-6 fw-500" href="DangKyThue.jsp">Đăng ký thuế lần đầu</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500" href="TinhThue.jsp">Tính Thuế</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500 active" href="KeKhaiThue.jsp">Kê khai thuế</a>
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
        <div class="mt-5 mh-100vh container">
            <h3 class="text-center mb-5">Thông tin tờ khai</h3>
            <form class="form-horizontal w-50 mx-auto" action="<%= request.getContextPath() %>/KeKhaiThue" method="post">
                <div class="form-group row my-3">
                    <label class="control-label col-sm-4" for="name">Tên người gửi:</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="name" value="${sessionScope.hoten}" readonly />
                    </div>
                </div>
                <div class="form-group row my-3">
                    <label class="control-label col-sm-4" for="address">Địa chỉ liên hệ:</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="address" value="${sessionScope.diachi}" readonly/>
                    </div>
                </div>
                <div class="form-group row my-3">
                    <label class="control-label col-sm-4" for="name">Điện thoại liên lạc:</label>
                    <div class="col-sm-8">
                        <input type="phone" class="form-control w-75" id="email" value="${sessionScope.sodienthoai}" readonly />
                    </div>
                </div>
                <div class="form-group row my-3">
                  <label class="control-label col-sm-4" for="email">Địa chỉ Email:</label>
                  <div class="col-sm-8">
                    <input type="email" class="form-control w-75" id="email" value="${sessionScope.email}" name="email" readonly />
                  </div>
                </div>
                <div class="form-group row my-3">
                  <label class="control-label col-sm-4" for="cqt">Chọn cơ quan thuế:</label>
                  <div class="col-sm-8"> 
                    <select  id="cqt" class="form-select w-50" role="button" name="cqt" required>
                      <option>Hà Nội</option>                    
                      <option>Đà Nẵng</option>
                      <option>Hải Phòng</option>
                      <option>Đồng Nai</option>
                      <option>Nghệ An</option>
                    </select>
                    <div class="invalid-feedback">
                        Vui lòng chọn cơ quan thuế!
                    </div>
                  </div>
                </div>
                <div class="form-group row my-3">
                    <label class="control-label col-sm-4" for="year">Năm kê khai:</label>
                    <div class="col-sm-8">
                        <input autofocus type="text" required class="form-control d-inline-block w-50" pattern="[0-9]{4}" id="year" name="namkekhai" value="" placeholder="xxxx(vd: 2020)" required />
                        <div class="invalid-feedback">
                           Vui lòng nhập năm kê khai!
                        </div>
                    </div>
                </div>
                <div class="form-group row my-5">        
                  <div class="mx-auto d-inline-block text-center">
                    <button class="btn btn-custom border">Tiếp tục</button>
                  </div>
                </div>
            </form>
        </div>
        <!--End Content-->
        
        <!--Start Footer-->
        <footer class="navbar navbar-light bg-light p-3 footer">
            <div class="container d-flex justify-content-between ">
                <span>Cơ quan chủ quản: Văn phòng Chính phủ</span>
                <span>Tổng đài hỗ trợ: 18001096</span>
                <span>Email: thuedientu@chinhphu.vn</span>
            </div>               
        </footer>
        <!--End Footer-->
        
    </body>
    
    <!--Import JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous" />
</html>

