<%@page import="java.util.ArrayList"%>
<%@page import="model.NguoiPhuThuoc"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Thuế Việt Nam</title>
        
        <!--Import CSS-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous" />
        <link rel="stylesheet" href="css/main.css" />
        
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
                    <div>
                        <a href="DangKi.jsp" class="btn btn-outline-secondary btn-custom border">Đăng Ký</a>
                        <a href="DangNhap.jsp" class="btn btn-outline-secondary btn-custom border">Đăng Nhập</a>
                    </div>
                </div>
            </nav>
            <nav class="navbar navbar-light bg-light px-3 py-0 my-2">
                <div class="container d-flex justify-content-between px-4">
                    <ul class="navbar-nav d-flex flex-row justify-content-start align-items-center ">
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500" href="#">Đăng ký thuế lần đầu</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500" href="#">Tính thuế</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500 active" href="KeKhaiThue.jsp">Kê khai thuế</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500"href="#">Nộp thuế</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500" href="#">Tính thuế</a>
                       </li>
                     </ul>
                </div>
            </nav>
        </div>
        <!--End Header-->
        
        <!--Start Content-->
        <div class="mt-5 mh-100vh container">
            <h3 class="text-center mb-5">Kê Khai Người Phụ Thuộc</h3>
            <form class="form-horizontal w-50 mx-auto" action="<%= request.getContextPath() %>/ThemNPT" method="post">
                <div class="form-group row my-3">
                    <label class="control-label col-sm-4" for="name">Họ Và Tên:</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="name" name="fullname" placeholder=""/>
                    </div>
                </div>
                <div class="form-group row my-3">
                    <label class="control-label col-sm-4" for="dob">Ngày sinh:</label>
                    <div class="col-sm-8">
                        <input type="date" class="form-control" id="dob" name="dob" />
                    </div>
                </div>
                <div class="form-group row my-3">
                    <label class="control-label col-sm-4" for="address">Nơi sinh:</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="address" name="address" />
                    </div>
                </div>
                <div class="form-group row my-3">
                    <label class="control-label col-sm-4" for="cmnd">Số CMND(nếu có):</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control d-inline-block " id="cmnd" name="cmnd"/>
                    </div>
                </div>
                <div class="form-group row my-3">
                    <label class="control-label col-sm-4" for="relation">Quan hệ với người nộp thuế:</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" name="relationship" id="relation" placeholder="" />
                    </div>
                </div>
                <div class="form-group row my-5">        
                  <div class="mx-auto d-inline-block text-center">
                    <button class="btn btn-custom border">Thêm</button>
                  </div>
                </div>
            </form>
            <div>
                <table class="table caption-top">
                    <thead class="bg-brown">
                      <tr>
                        <th scope="col" class="align-middle text-center text-white">STT</th>
                        <th scope="col" class="col-2 align-middle text-center text-white">Họ và tên</th>
                        <th scope="col" class="col-2 align-middle text-center text-white">Ngày sinh</th>
                        <th scope="col" class="col-2 align-middle text-center text-white">Nơi sinh</th>
                        <th scope="col" class="col-2 align-middle text-center text-white">Số CMND(nếu có)</th>
                        <th scope="col" class="col-2 align-middle text-center text-white">Quan hệ với người nộp thuế</th>                        
                        <th scope="col" class="col-3 align-middle text-center text-white">Hành động</th>
                      </tr>
                    </thead>
                    <tbody>
                     <% if (request.getAttribute("listNPT")!= null) {%>
                     <%ArrayList<NguoiPhuThuoc> listNPT = (ArrayList<NguoiPhuThuoc>)request.getAttribute("listNPT"); %>
                     <%for (NguoiPhuThuoc npt : listNPT) {%>
                      <tr>
                        <th scope="row" class="align-middle text-center"><%=npt.getId() %></th>
                        <td class="align-middle text-center"><%=npt.getFullname() %></td>
                        <td class="align-middle text-center"><%=npt.getDob()%></td>
                        <td class="align-middle text-center"><%=npt.getAddress()%></td>
                         <td class="align-middle text-center"><%=npt.getCmnd()%></td>
                        <td class="align-middle text-center"><%=npt.getRelationship()%></td>
                        <td class="align-middle text-center">
                            <button class="border btn-delete">Xóa</button>
                        </td>
                      </tr>
                      <%}%>
                      <%}%> 
                    </tbody>
                  </table>
                <div class="text-center my-5">
                    <a class="btn btn-custom border mx-auto" href="<%= request.getContextPath() %>/KeKhaiThue">Hoàn Thành Kê Khai NPT</a>
                </div>
            </div>
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

