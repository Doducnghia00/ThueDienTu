<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous" />
                
         <link rel="stylesheet" href="css/main.css" />
        <title>Thuế Việt Nam</title>
    </head>
    <body class="mh-100vh">
        <nav class="navbar navbar-light bg-light p-3">
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
        <div class="mt-5">
            <div class="d-flex flex-row justify-content-center align-items-center mt-5">
                <a href="DangKyThue.jsp" class="m-5">
                    <div class="text-center">
                        <span class="rounded-circle p-5 bg-custom d-inline-block">
                            <img src="https://dichvucong.gov.vn/p/home/img/tracuu/dkthuelandau.svg" class="h-60 w-60 img-fluid" />
                        </span>
                        <h4 class="text-black fs-5 text-decoration-none mt-4">Đăng ký thuế lần đầu</h4>
                    </div> 
                </a>
                <a href="TinhThue.jsp" class="m-5">
                    <div class="text-center">
                        <span class="rounded-circle p-5 bg-custom d-inline-block">
                            <img src="images/tinhthue3.svg" class="h-60 w-60 img-fluid" />
                        </span>
                        <h4 class="text-black fs-5 text-decoration-none mt-4">Tính thuế</h4>
                    </div> 
                </a>
                <a href="KeKhaiThue.jsp" class="m-5">
                    <div class="text-center">
                        <span class="rounded-circle p-5 bg-custom d-inline-block">
                            <img src="https://dichvucong.gov.vn/p/home/img/tracuu/kekhaithuecn.svg" class="h-60 w-60 img-fluid" />
                        </span>
                        <h4 class="text-black fs-5 text-decoration-none mt-4">Kê khai thuế</h4>
                    </div> 
                </a>
                <a href="NopThue.jsp" class="m-5">
                    <div class="text-center">
                        <span class="rounded-circle p-5 bg-custom d-inline-block">
                            <img src="https://dichvucong.gov.vn/p/home/img/tracuu/nopthuecn.svg" class="h-60 w-60 img-fluid" />
                        </span>
                        <h4 class="text-black fs-5 text-decoration-none mt-4">Nộp thuế cá nhân</h4>
                    </div> 
                </a>
            </div>
        </div>
        
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