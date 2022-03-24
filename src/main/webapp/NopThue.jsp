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
    <title>dongthue-gd</title>
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
<nav class="navbar navbar-light bg-light p-3">
            <div class="container d-flex justify-content-between ">
                <a class="navbar-brand d-inline-flex flex-row mx-3 justify-content-start align-items-center" href="home.html">
                    <img src="images/logo.png" class="img-fluid" alt="...">                    
                    <img src="images/sitename.png" class="img-fluid ml-2" alt="...">
                </a>
                
            </div>
        </nav>
        <nav class="navbar navbar-light bg-light px-3 py-0 my-2">
                <div class="container d-flex justify-content-between px-4">
                    <ul class="navbar-nav d-flex flex-row justify-content-start align-items-center ">
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500 active" aria-current="page" href="DangKyThue.html">ÄÄng kÃ½ thuáº¿ láº§n Äáº§u</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500" href="TinhThue.html">TÃ­nh Thuáº¿</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500" href="KeKhaiThue.html">KÃª khai thuáº¿</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link fs-6 fw-500"href="NopThue.html">Ná»p thuáº¿</a>
                       </li>
                       
                     </ul>
                </div>
            </nav>
   <header>
       <h2>Nháº­p dá»¯ liá»u tá» khai</h2>
       <h3>Tá» khai quyáº¿t toÃ¡n thuáº¿ thu tháº­p cÃ¡ nhÃ¢n(TT92/2015) </h3>
       <h3>(Ãp dá»¥ng cho cÃ¡ nhÃ¢n cÆ° trÃº cÃ³ thu tháº­p tá»« tiá»n lÆ°Æ¡ng, tiá»n cÃ´ng)</h3>
   </header>
   <div class="container-fluid">
    <main>
       <form>
           <table >
               <tr>
                   <td>TÃªn ngÆ°á»i ná»p thuáº¿</td>
                   <td><input  type="text" id="txtName" name="txtName"></td>
               </tr>
               <tr>
                <td>NgÃ y sinh</td>
                <td><input type="date" id="txtNgaysinh" name="txtNgaysinh"></td>
            </tr>
            <tr>
                <td>Sá» CMND(hoáº·c sá» CCCD)</td>
                <td><input type="text" id="txtSocmnd" name="txtSocmnd"></td>
            </tr>
            <tr>
                <td>MÃ£ sá» thuáº¿</td>
                <td><input type="text" id="txtMasothue" name="txtMasothue"></td>
            </tr>
            <tr>
                <td>Äá»a chá»</td>
                <td><input type="text" id="txtAddress" name="txtAddress"></td>
            </tr>
            <tr>
                <td>Quáº­n huyá»n</td>
                <td><input type="text" id="txtQh" name="txtQh"></td>
            </tr>
            <tr>
                <td>Tá»nh/thÃ nh phá»</td>
                <td><input type="text" id="txtTinh" name="txtTinh"></td>
            </tr>
            <tr>
                <td>Äiá»n thoáº¡i</td>
                <td><input type="tel" id="txtPhone" name="txtPhone"></td>
            </tr>
            <tr>
                <td>Fax</td>
                <td><input type="text" id="txtFax" name="txtFax"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="email" id="txtEmail" name="txtEmail"></td>
            </tr>
            <tr>
                <td>Ká»³ thuáº¿ muá»n ná»p tá»«</td>
                <td><input type="date" id="txtKt" name="txtKt"></td>
                <td>Äáº¿n</td>
                <td><input type="date" id="txtktt" name="txtktt"></td>
            </tr>
            <tr>
                <td>Sá» tiá»n thuáº¿ cáº§n ná»p báº±ng sá»</td>
                <td><input type="number" id="txtst" name="txtst"></td>
            </tr>
            <tr>
                <td>Sá» tiá»n thuáº¿ cáº§n ná»p báº±ng chá»¯</td>
                <td><input type="text" id="txtstc" name="txtstc"></td>
            </tr>
            <tr>
                <td>Sá» tÃ i khoáº£n ngÃ¢n hÃ ng(náº¿u cÃ³)</td>
                <td><input type="text" id="txtttk" name="txttk"></td>
            </tr>
            <tr>
                <td>TÃ i khoáº£n ngÃ¢n hÃ ng má» táº¡i:</td>
                <td>
                    <select id="tknh">
                        <option value="1">Agribank</option>
                        <option value="2">CB</option>
                        <option value="3">Oceanbank</option>
                        <option value="4">GPBank</option>
                        <option value="5">BIDV</option>
                        <option value="6">Vietcombank</option>
                        <option value="7">VPBank</option>
                        <option value="8">MBB</option>
                        <option value="9">ACB</option>
                    </select>
                </td>
                
            </tr>
            <tr>
                <td>TÃªn Äáº¡i lÃ½ thuáº¿(náº¿u cÃ³)</td>
                <td><input type="text" id="txtdaily" name="txtdaily"></td>
            </tr>
            <tr>
                <td>MÃ£ sá» thuáº¿</td>
                <td><input type="text" id="txtMasothuedl" name="txtMasothuedl"></td>
            </tr>
            <tr>
                <td>Äá»a chá»</td>
                <td><input type="text" id="txtAddressdl" name="txtAddressdl"></td>
            </tr>
            <tr>
                <td>Quáº­n huyá»n</td>
                <td><input type="text" id="txtQhdl" name="txtQhdl"></td>
            </tr>
            <tr>
                <td>Tá»nh/thÃ nh phá»</td>
                <td><input type="text" id="txtTinhdl" name="txtTinhdl"></td>
            </tr>
            <tr>
                <td>Äiá»n thoáº¡i</td>
                <td><input type="tel" id="txtPhonedl" name="txtPhonedl"></td>
            </tr>
            <tr>
                <td>Fax</td>
                <td><input type="text" id="txtFaxdl" name="txtFaxdl"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="email" id="txtEmaildl" name="txtEmaildl"></td>
            </tr>
            <tr>
                <td>Há»£p Äá»ng thuáº¿,sá»:</td>
                <td><input type="text" id="txtHdt" name="txtHdt"></td>
                <td>ngÃ y</td>
                <td><input type="date" id="txtngay" name="txtngay"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Ná»p thuáº¿"></td>
            </tr>
           </table>
       </form>
   </main>
</div>
<div >
<h1 style="margin-top: 200px;"></h1>
</div>
<div>
<footer class="navbar navbar-light bg-light p-3 footer fixed-bottom" style="margin-top: 50px">
            <div class="container d-flex justify-content-between ">
                <span>CÆ¡ quan chá»§ quáº£n: VÄn phÃ²ng ChÃ­nh phá»§</span>
                <span>Tá»ng ÄÃ i há» trá»£: 18001096</span>
                <span>Email: thuedientu@chinhphu.vn</span>
            </div>               
        </footer> 
        </div>      
</body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous" />
    

</html>