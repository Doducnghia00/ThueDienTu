
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
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
            <div>
                <h3 class="text-center mb-2">Tờ Khai Thuế Thu Nhập Cá Nhân</h3>
                <p class="text-center mb-5">Kỳ tính thuế: Năm <%=request.getAttribute("namkekhai") %> (Từ tháng 01/<%=request.getAttribute("namkekhai") %> đến tháng 12/<%=request.getAttribute("namkekhai") %>)</p>
            </div>
            
            <form class="form-horizontal mx-auto mb-5" action="<%= request.getContextPath() %>/ThemToKhaiThue" method="post">
                <div class="form-group row my-3">
                    <div class="form-group row col-sm-6">
                        <label class="control-label col-sm-4" for="name">Tên người nộp thuế:</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control w-50" id="name" name="name" value="Nguyễn Văn A" readonly/>
                        </div>
                    </div>
                    <div class="form-group row col-sm-6">
                        <label class="control-label col-sm-4" for="address">Địa chỉ liên hệ:</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" id="address" name="address" value="Km10 Trần Phú Hà Đông, Hà Nội" readonly />
                        </div>
                    </div>
                </div>
                <div class="form-group row my-3">
                    <div class="form-group row col-sm-6">
                        <label class="control-label col-sm-4" for="idThue">Mã số thuế:</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control w-50" id="idThue" name="mst" value="01232674" readonly />
                        </div>
                    </div>
                    <div class="form-group row col-sm-6">
                        <label class="control-label col-sm-4" for="cqt">Cơ quan thuế:</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control w-50" id="cqt" name="cqt" value="<%= request.getAttribute("cqt") %>" readonly/>
                        </div>
                    </div>                
                </div>

                <div class="form-group row my-3">  
                    <div class="form-group row col-sm-6">
                        <label class="control-label col-sm-4" for="name">Điện thoại liên lạc:</label>
                        <div class="col-sm-8">
                            <input type="phone" class="form-control w-50" id="email" value="012345678" readonly />
                        </div>
                    </div>
                    <div class="form-group row col-sm-6">
                      <label class="control-label col-sm-4" for="email">Địa chỉ Email:</label>
                      <div class="col-sm-8">
                        <input type="email" class="form-control w-50" id="email" value="test123@gmail.com" name="email" readonly />
                      </div>
                    </div>
                </div>
                <a href="<%= request.getContextPath() %>/KeKhaiNPT" class="fst-italic text-decoration-underline mt-2 fs-6">Kê Khai Người Phụ Thuộc(nếu có)</a>
            <table class="table caption-top my-5 table-bordered border-black">
            	<caption class="text-end">(*) bắt buộc</caption>
   
                <thead class="bg-brown">
                  <tr>
                    <th scope="col" class="align-middle text-center text-white">STT</th>
                    <th scope="col" class="col-8 align-middle text-center text-white">Chỉ tiêu</th>
                    <th scope="col" class="col-2 align-middle text-center text-white">Đơn vị tính</th>
                    <th scope="col" class="col-2 align-middle text-center text-white">Số tiền</th>
                  </tr>
                </thead>
                <tbody>
                    <tr>
                        <th scope="row" rowspan="4" class="align-middle text-center ">1</th>
                    </tr>
                    <tr>
                        <td>
                           Tổng thu nhập chịu thuế (TNCT) trong kỳ 
                        </td>
                        <td class="align-middle text-center col-2">VNĐ</td>
                        <td class="align-middle text-center col-2"><input type="text" class="text-center border-0" id="tn" readonly/></td>
 
                    </tr>
                    <tr>
                        <td>
                           a. Tổng TNCT phát sinh tại Việt Nam (*)  
                        </td>
                        <td class="align-middle text-center col-2">VNĐ</td>
                        <td class="align-middle text-center col-2"><input type="text" class="border text-center" id="thunhapvn" name="thunhapvn" required/></td>
                    </tr>
                    <tr>
                        <td>
                            b. Tổng TNCT phát sinh tại nước ngoài (*) 
                        </td>
                        <td class="align-middle text-center col-2">VNĐ</td>
                        <td class="align-middle text-center col-2"><input type="text" class="border text-center" id="thunhapnn" name="thunhapnn" required/></td>
                    </tr>
                    <tr>
                        <th scope="row" class="align-middle text-center">2</th>
                        <td class="align-middle">Số người phụ thuộc</td>
                        <td class="align-middle text-center">Người</td>
                        <td class="align-middle text-center"><%=request.getAttribute("soNPT") %></td>
                    </tr>
                    <tr>
                        <th scope="row" rowspan="4" class="align-middle text-center ">3</th>
                    </tr>
                    <tr>
                        <td>
                           Các khoản giảm trừ 
                        </td>
                        <td class="align-middle text-center col-2">VNĐ</td>
                        <td class="align-middle text-center col-2"><%=4400000 * 12 * (int) request.getAttribute("soNPT") + 11000000 * 12 %></td>
 
                    </tr>
                    <tr>
                        <td>
                           a. Cho bản thân cá nhân
                        </td>
                        <td class="align-middle text-center col-2">VNĐ</td>
                        <td class="align-middle text-center col-2"><input type="text" class="text-center border-0" id="cn" name="cn" value="132000000" readonly/></td>
                    </tr>
                    <tr>
                        <td>
                            b. Cho những người phụ thuộc được giảm trừ
                        </td>
                        <td class="align-middle text-center col-2">VNĐ</td>
                        <td class="align-middle text-center col-2"><input type="text" class="text-center border-0" id="pt" name="pt" value="<%= 12 * 4400000 * (int) request.getAttribute("soNPT") %>" readonly /></td>
                   </tr>
                   <tr>
	                    <th scope="row" class="align-middle text-center">4</th>
	                    <td class="align-middle">Tổng thu nhập tính thuế</td>
	                    <td class="align-middle text-center">VNĐ</td>
	                    <td class="align-middle text-center"><input type="text" class="text-center border-0" id="tntt" name="tntt" readonly/></td>
                   </tr>
                   <tr>
	                    <th scope="row" class="align-middle text-center">5</th>
	                    <td class="align-middle">Số tiền thuế phải nộp</td>
	                    <td class="align-middle text-center">VNĐ</td>
	                    <td class="align-middle text-center"><input type="text" class="text-center border-0" id="tt" name="tongthue" readonly/></td>
                   </tr>
                  <tr>
                    <th scope="row" class="align-middle text-center">6</th>
                    <td class="align-middle">Tổng số thuế đã tạm nộp, đã khấu trừ, đã nộp trong kỳ (*) </td>
                    <td class="align-middle text-center">VNĐ</td>
                    <td class="align-middle text-center"><input type="text" class="border text-center" id="danop" name="danop" required/></td>
                  </tr>
                  <tr>
                    <th scope="row" class="align-middle text-center">7</th>
                    <td class="align-middle">Tổng số thuế còn phải nộp trong kỳ</td>
                    <td class="align-middle text-center">VNĐ</td>
                    <td class="align-middle text-center"><input type="text" class="border-0 text-center" id="conphainop" name="conphainop" readonly/></td>
                  </tr>
                  <tr>
                    <th scope="row" class="align-middle text-center">8</th>
                    <td class="align-middle">Tổng số thuế nộp thừa trong kỳ</td>
                    <td class="align-middle text-center">VNĐ</td>
                    <td class="align-middle text-center"><input type="text" class="border-0 text-center" id="nopthua" name="nopthua" readonly/></td>
                  </tr>
                </tbody>
               </table>
                <div class="mx-auto text-center">
                	<a class="btn btn-custom border mr-5" id="btn-tinh" onclick = "Tinh()">Tính</a>
                    <input type="submit" class="btn btn-custom border" value="Hoàn thành kê khai" />
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
    <script type="text/javascript" src="js/main.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous" />
 
</html>

