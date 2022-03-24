<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<!DOCTYPE html>
<html>
<head>
    <title>ĐĂNG KÝ THUẾ LẦN ĐẦU</title>
    <meta charset="UTF-8">
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous" />
    <link rel="stylesheet" href="css/main.css" />
    <style>
        .content{
            margin-top: 30px;
           
        }
        .col-sm-8{
        	width: 300px;
            position: relative;
            min-height: 1px;
            padding-right: 0px;
            padding-left: 0px;
            padding-bottom: 5px;
            padding-top: 5px;
            /*float: left;*/
        }
        label {
            display: inline-block;
            max-width: 100%;
            margin-bottom: 5px;
            font-weight: bold;
            word-wrap: normal;
            width: 300px;
        }
        
        .form-control{
        	
        }
        
        .btn-gr {
            width: 100%;
            /*float: left;*/
            /*text-align: center;*/
            padding-left: 15px;
            margin-top: 15px;
        }
		
        /*table, th, td {
            border: 1px solid black;
        }*/
        

    </style>
</head>
    
<body>

	<div class="bg-white">
            <nav class="navbar navbar-light p-3">
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
       
    <center>
    <div class="content col-md-8"> 
        <h3 style="margin-bottom: 50px"> ĐĂNG KÝ THUẾ LẦN ĐẦU</h3>
            <div class="infor-form">
                <form action = "DangKyThue" method = "post">
                    <table style ="width: 600px" >
                        <!--<colgroup>
                            <col width = "400px" span = "1">
                            <col width = "200px" span = "1">
                        </colgroup>
-->
                      <!--  Mau to khai-->
                      <div class="form-group">  
                            <tr>
                                <td>
                                    <label  class="col-md-4 control-label" style="width: 300px"> Mẫu tờ khai </label>
                                </td>
                                <td style="">
                                    <div class = "col-sm-8"">
                                        <input type = "text" class="form-control" id="mauTKhai" name="mauTKhai" value="03-ĐK-TCT" disabled="disabled" maxlength="50" size="30" style="">
                                    </div>
                                </td> 
                            </tr>
                        </div>

                        <!--  Ten nguoi nop thue-->
                        <div class="form-group">
                             <tr>
                                <td>
                                    <label for="" class="col-md-4 control-label" style="width: 300px">Tên người nộp thuế <font style="color: red;">(*)</font> </label>
                                </td>
                                <td>
                                    <div class = "col-sm-8">
                                        <input type = "text" class="form-control" id="tenNNT" name="tenNNT" maxlength="100" size="30" required onblur="" style="" required>
                                    </div>
                                </td>
                            </tr>
                        </div>

                        <!--  Loai giay to-->
                        <div class="form-group">
                            <tr>
                                <td>
                                    <label for = "" class="col-md-4 control-label" style="width: 300px"> Loại giấy tờ <font style="color: red;">(*)</font> </label>
                                </td>
                                <td>
                                    <div class = "col-sm-8"">
                                        <select id="loaiGiayTo" class="form-select "  style="" name="loaiGiayTo" onchange="" >
                                            <option value="" selected="selected">-- Loại giấy tờ --</option>

                                                <option value="1010">
                                                    CMND
                                                </option>

                                                <option value="2080">
                                                    CCCD
                                                </option>

                                                <option value="1020">
                                                    Hộ chiếu
                                                </option>

                                                <option value="1070">
                                                    CMT biên giới
                                                </option>

                                                <option value="1040">
                                                    Giấy thông hành
                                                </option>
                                        </select>
                                    </div>
                                </td>
                            </tr>
                        </div>

                        <!--  So giay to-->
                        <div class="form-group">
                            <tr>
                                <td>
                                    <label for = "" class="col-md-4 control-label" style="width: 300px"> Số giấy tờ <font style="color: red;">(*)</font> </label>
                                </td>
                                <td>
                                    <div class = "col-sm-8"">
                                        <input type = "text" class="form-control" id="soGiayTo" name="soGiayTo" style=""  maxlength="30" size="30" onblur="" onkeypress="">
                                    </div>
                                </td>
                            </tr>
                        </div>

                        <div class="form-group">
                            <tr>
                                <td>
                                    <label for = "" class="col-md-4 control-label" style="width: 300px"> Ngày cấp <font style="color: red;">(*)</font></label>
                                </td>
                                <td>
                                    <div class = "col-sm-8"">
                                        <input type = "date" class="form-control" id="date" name = "date" maxlength="50" size="30" style="">
                                       <!-- <input type="text" id="ngayCap" name="ngayCap" value="" onblur="trimCT(this); validDateFormat(this,'dd/mm/yyyy'); checkToDateNow(this);" style="width: 250px;"> <label class="lbl-error"></label> -->
                                    </div>
                                </td>
                            </tr>
                        </div>

                        <!--  Email-->
                        <div class="form-group">
                            <tr>
                                <td>
                                    <label for = "" class="col-md-4 control-label" style="width: 300px"> Email <font style="color: red;">(*)</font> </label>
                                </td>
                                <td>
                                    <div class = "col-sm-8"">
                                        <input type="email" class="form-control" id="email" name="email" value="" style="" maxlength="30" size="30">
                                      
                                    </div>
                                </td>
                            </tr>

                        </div>

                        <!--  Button-->
                        <div class="form-group">
                            <tr>
                                <td>  <div class="col-md-4"></div>   </td>                        
                                <td style = "text-align: left">
                                    <div class = "btn-gr">
                                        <!--class="btn btn-default btn-dky-thue awesome"-->
                                         <a  href="">
                                         	 <!-- <input type="button" id="btnTiepTuc" class="btn btn-custom border" value="Tiếp tục"> -->
                                         	 <input type = "submit" class="btn btn-custom border" value="Tiếp tục">
                                         </a>
                                         <a  href="home.jsp">
                                        	<input type="button" id="btnQuayLai" class="btn btn-custom border" value="Quay lại" onclick="back()" style="margin-left: 20px"> 
                                        </a>
                                    </div>
                                </td>
                            </tr>
                        </div>

                    </table>
                </form>
            </div>
        
    </div>
    </center>
    
<!--Start Footer-->
        <<footer class="navbar navbar-light bg-light p-3 footer fixed-bottom">
            <div class="container d-flex justify-content-between ">
                <span>Cơ quan chủ quản: Văn phòng Chính phủ</span>
                <span>Tổng đài hỗ trợ: 18001096</span>
                <span>Email: thuedientu@chinhphu.vn</span>
            </div>               
        </footer>       
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous" />
</html>