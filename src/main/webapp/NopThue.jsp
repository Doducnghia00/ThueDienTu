<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous" />
    <link rel="stylesheet" href="css/main.css" />
    <title>Nộp Thuế</title>
    <style>
        .anh{
         padding-left: 100px;
        }
    header{
        margin-top:100px;
        padding-left: 500px;
        padding-right: 500px;
    }
    main{
        padding-left: 500px;
        padding-right: 500px;

    }

        </style>

    
</head>
<body class="mh-100vh">
<nav class="navbar navbar-light p-3">
            <div class="container d-flex justify-content-between ">
                <a class="navbar-brand d-inline-flex flex-row mx-3 justify-content-start align-items-center" href="index.jsp">
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
                         <a class="nav-link fs-6 fw-500" aria-current="page" href="DangKyThue.jsp">Đăng ký thuế lần đầu</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500" href="TinhThue.jsp">Tính Thuế</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500" href="KeKhaiThue.jsp">Kê khai thuế</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500 active" href="NopThue.jsp">Nộp thuế</a>
                       </li>
                       
                     </ul>
                </div>
            </nav>
  
   <div class="mt-5 container">
    <div class="text-center mb-5">
       <h3>Tờ khai nộp thuế </h3>
    </div>
       <form class="form-horizontal mx-auto mb-5" action="<%= request.getContextPath() %>/NopThue" method="post">
       		<div class="form-group row my-3">
	           <div class="form-group row col-sm-6">
	               <label class="control-label col-sm-4" for="name">Tên người nộp thuế:</label>
	               <div class="col-sm-8">
	                   <input type="text" class="form-control w-50" id="name" name="name" value="${sessionScope.hoten}" readonly/>
	               </div>
	           </div>
	           <div class="form-group row col-sm-6">
	               <label class="control-label col-sm-4" for="address">Địa chỉ liên hệ:</label>
	               <div class="col-sm-8">
	                   <input type="text" class="form-control" id="address" name="address" value="${sessionScope.diachi}" readonly/>
	               </div>
	           </div>
	       </div>
	       <div class="form-group row my-3">
	           <div class="form-group row col-sm-6">
	               <label class="control-label col-sm-4" for="dob">Ngày sinh:</label>
	               <div class="col-sm-8">
	                   <input type="date" class="form-control w-50" id="dob" name="${sessionScope.ngaysinh}" value="" readonly/>
	               </div>
	           </div>
	           <div class="form-group row col-sm-6">
	               <label class="control-label col-sm-4" for="cmnd">Số CMND/CCCD:</label>
	               <div class="col-sm-8">
	                   <input type="text" class="form-control w-75" id="cmnd" name="cmnd" value="${sessionScope.username}" readonly />
	               </div>
	           </div>
	       </div>
	       <div class="form-group row my-3">  
	           <div class="form-group row col-sm-6">
	               <label class="control-label col-sm-4" for="phone">Điện thoại liên lạc:</label>
	               <div class="col-sm-8">
	                   <input type="phone" class="form-control w-50" id="phone" name="phone" value="${sessionScope.sodienthoai}" readonly />
	               </div>
	           </div>
	           <div class="form-group row col-sm-6">
	             <label class="control-label col-sm-4" for="email">Địa chỉ Email:</label>
	             <div class="col-sm-8">
	               <input type="email" class="form-control w-50" id="email" value="${sessionScope.email}" name="email" readonly />
	             </div>
	           </div>
	       </div>
	       <div class="form-group row my-3">
	           <div class="form-group row col-sm-6">
	               <label class="control-label col-sm-4" for="idThue">Mã số thuế:</label>
	               <div class="col-sm-8">
	                   <input type="text" class="form-control w-50" id="idThue" name="mst" value=""  required="required" autofocus="autofocus"/>
	               </div>
	           </div>
	           <div class="form-group row col-sm-6">
	               <label class="control-label col-sm-4" for="cqt">Cơ quan thuế:</label>
	               <div class="col-sm-8">
	                   <select id="cqt" class="form-select w-50" role="button" name="cqt" required >
	                      <option>Hà Nội</option>                    
	                      <option>Đà Nẵng</option>
	                      <option>Hải Phòng</option>
	                      <option>Đồng Nai</option>
	                      <option>Nghệ An</option>
                      </select>
	               </div>
	           </div>                
	       </div>
	       <div class="form-group row my-3">
	           <div class="form-group row col-sm-6">
	               <label class="control-label col-sm-4" for="idNganHang">Tài khoản ngân hàng:</label>
	               <div class="col-sm-8">
	                   <select id="tknn" class="form-select w-50" role="button" name="nganhang" required>
                        <option>Agribank</option>
                        <option>CB</option>
                        <option>Oceanbank</option>
                        <option>GPBank</option>
                        <option>BIDV</option>
                        <option>Vietcombank</option>
                        <option>VPBank</option>
                        <option>MBB</option>
                        <option>ACB</option>
                    </select>
	               </div>
	           </div>
	           <div class="form-group row col-sm-6">
	               <label class="control-label col-sm-4" for="cqt">Số tài khoản ngân hàng:</label>
	               <div class="col-sm-8">
	                   <input type="text" class="form-control w-75" id="idSTK" name="stk" value="" required/>
	               </div>
	           </div>
	        </div>       
	        <div class="form-group row my-3">
	           <div class="form-group row col-sm-6">
	               <label class="control-label col-sm-4" for="moneyNumber">Số tiền thuế nộp bằng số:</label>
	               <div class="col-sm-8">
	                   <input type="text" class="form-control w-50" id="moneyNumber" name="tienso" value="" required/>
	               </div>
	           </div>
	           <div class="form-group row col-sm-6">
	               <label class="control-label col-sm-4" for="moneyText">Số tiền thuế nộp bằng chữ:</label>
	               <div class="col-sm-8">
	                   <input type="text" class="form-control w-100" id="moneyText" name="tienchu" value="" required/>
	               </div>
	           </div>
	       </div>         
	       <div class="form-group row my-3">  
            <label class="control-label col-sm-2" for="kithue">Kỳ thuế muốn nộp từ:</label>
            <div class="col-sm-10 px-1"> 
               <input type="date" class="form-control w-25 d-inline-block" id="kithueStart" name="kithueStart" value="" required/>
               <span class="mx-2 d-inline-block">đến</span>
               <input type="date" class="form-control w-25 d-inline-block" id="kithueEnd" name="kithueEnd" value="" required/>
            </div>
	       </div>
		   <div class="mx-auto text-center mt-5">
               <input type="submit" class="btn btn-custom border" value="Nộp Thuế" />
           </div>
       </form>
</div>
<div>
<footer class="navbar navbar-light bg-light p-3 footer">
            <div class="container d-flex justify-content-between ">
                <span>Cơ quan chủ quản: Văn phòng Chính phủ</span>
                <span>Tổng đài hỗ trợ: 18001096</span>
                <span>Email: thuedientu@chinhphu.vn</span>
            </div>               
        </footer> 
        </div>      
</body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous" />

</html>