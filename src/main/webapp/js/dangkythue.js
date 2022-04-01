function Validate(){
	var form = document.getElementById("myForm");
	
	if (kiemTraTKhai()){
		
		console.log("submit");
		form.submit();
	}
	/*let x = document.forms["myForm"]["ct1_tenNNT"].value;
	if(x == ""){
		alert("Vui lòng nhập tên");
		return false;
	}else{
		form.submit();
	}*/
}

function kiemTraTKhai(){
	
	var form = document.getElementById("myForm");
	
	var tenNNT = $('#ct1_tenNNT').val().replace(/\s+/g,' ').trim();
	
	
	var ct4a_soNha = $('#ct4a_soNha').val().replace(/\s+/g,' ').trim()
      , ct4b_maPhuong = $('#ct4b_maPhuong').val().replace(/\s+/g,' ').trim()
      , ct4c_maQuan = $('#ct4c_maQuan').val().replace(/\s+/g,' ').trim()
      , ct4d_maTinh = $('#ct4d_maTinh').val().replace(/\s+/g,' ').trim()
      , ct4d_dienThoai = $('#ct4d_dienThoai').val().replace(/\s+/g,' ').trim()
      , ct4d_fax = $('#ct4d_fax').val().replace(/\s+/g,' ').trim()
      , ct4d_email = $('#ct4d_email').val().replace(/\s+/g,' ').trim();
      
      
      
      
      var ct5a_soNha = $('#ct5a_soNha').val().replace(/\s+/g,' ').trim()
      , ct5b_maPhuong = $('#ct5b_maPhuong').val().replace(/\s+/g,' ').trim()
      , ct5c_maQuan = $('#ct5c_maQuan').val().replace(/\s+/g,' ').trim()
      , ct5d_maTinh = $('#ct5d_maTinh').val().replace(/\s+/g,' ').trim()
      , ct5d_dienThoai = $('#ct5d_dienThoai').val().replace(/\s+/g,' ').trim()
      , ct5d_fax = $('#ct5d_fax').val().replace(/\s+/g,' ').trim()
      , ct5d_email = $('#ct5d_email').val().replace(/\s+/g,' ').trim();
      
      var ct6a_ten = $('#ct6a_ten').val().replace(/\s+/g,' ').trim()
      , ct6b_soNha = $('#ct6b_soNha').val().replace(/\s+/g,' ').trim()
      , ct6b_maTinh = $('#ct6b_maTinh').val().replace(/\s+/g,' ').trim()
      , ct6b_maQuan = $('#ct6b_maQuan').val().replace(/\s+/g,' ').trim()
      , ct6b_maPhuong = $('#ct6b_maPhuong').val().replace(/\s+/g,' ').trim()
      , ct6c_soNha = $('#ct6c_soNha').val().replace(/\s+/g,' ').trim()
      , ct6c_maTinh = $('#ct6c_maTinh').val().replace(/\s+/g,' ').trim()
      , ct6c_maQuan = $('#ct6c_maQuan').val().replace(/\s+/g,' ').trim()
      , ct6c_maPhuong = $('#ct6c_maPhuong').val().replace(/\s+/g,' ').trim();
      
      var ct7a_so = $('#ct7a_so').val().replace(/\s+/g,' ').trim()
	  , ct7b_ngayCap = $('#ct7b_ngayCap').val().replace(/\s+/g,' ').trim()
	  , ct7c_coQuanCap = $('#ct7c_coQuanCap').val().replace(/\s+/g,' ').trim();
	  
	  var ct8a_ngaySinh = $('#ct8a_ngaySinh').val().replace(/\s+/g,' ').trim()
      , ct8b_maQuocTich = $('#ct8b_maQuocTich').val().replace(/\s+/g,' ').trim()
      , ct8c_loaiGiayTo = $('#ct8c_loaiGiayTo').val().replace(/\s+/g,' ').trim()
      , ct8c_soGiayTo = $('#ct8c_soGiayTo').val().replace(/\s+/g,' ').trim()
      , ct8c_ngayCap = $('#ct8c_ngayCap').val().replace(/\s+/g,' ').trim()
      , ct8c_noiCap = $('#ct8c_noiCap').val().replace(/\s+/g,' ').trim();
      
      var ct10_ma = $('#ct10_ma').val().replace(/\s+/g,' ').trim()
      , ct11 = $('#ct11').val().replace(/\s+/g,' ').trim()
      , cbt_ct12_01 = $('#cbt_ct12_01')
      , cbt_ct12_03 = $('cbt_ct12_03');
      
      var nguoiKy = $('#nguoiKy').val().replace(/\s+/g,' ').trim();
    
    
	
	//Check ct1
	if (!tenNNT) {  
        //$('#ct1_tenNNT').focus();
        alert('Đề nghị nhập dữ liệu tại chỉ tiêu 1');
        $(document).ready(function (){
            $('#ct1_tenNNT').focus();
        })       
        return false;
    }
    
    //Check ct4
    if (!ct4a_soNha) {
        alert('Đề nghị NNT nhập dữ liệu chỉ tiêu Số nhà, đường phố, thôn xóm tại mục  4a');
        $(document).ready(function (){
            $('#ct4a_soNha').focus();
        })
        return false;
    }
    
     if (!ct4b_maPhuong) {
        alert('Đề nghị NNT nhập Phường /Xã tại chỉ tiêu 4b');
        $(document).ready(function (){
            $('#ct4b_maPhuong').focus();
        })
        return false;
    }
    if (!ct4c_maQuan) {
        alert('Đề nghị NNT nhập Quận/Huyện tại chỉ tiêu 4c');
        $(document).ready(function (){
            $('#ct4c_maQuan').focus();
        })
        return false;
    }
    
    if (!ct4d_maTinh) {
        alert('Đề nghị NNT nhập Tỉnh/Thành phố tại chỉ tiêu 4d');
        $(document).ready(function (){
            $('#ct4d_maTinh').focus();
        })
        return false;
    }
    
    if (!ct4d_email) {
        alert('Đề nghị NNT nhập dữ liệu email tại chỉ tiêu 4đ');
        $(document).ready(function (){
            $('#ct4d_email').focus();
        })
        return false;
    }
    
    //check ct5
    if (ct5a_soNha != "" || ct5b_maPhuong != "" || ct5c_maQuan != "" || ct5d_maTinh != "" || ct5d_email != "" || ct5d_dienThoai != "" || ct5d_fax != "") {
        if (!ct5a_soNha) {
            alert('Đề nghị NNT nhập dữ liệu chỉ tiêu Số nhà, đường phố, thôn xóm tại mục 5a');
            $(document).ready(function (){
                $('#ct5a_soNha').focus();
            })
            return false;
        }
        if (!ct5b_maPhuong) {
            alert('Đề nghị NNT chọn Phường /Xã tại chỉ tiêu 5b');
            $(document).ready(function (){
                $('#ct5b_maPhuong').focus();
            })
            return false;
        }
        if (!ct5c_maQuan) {
            alert('Đề nghị NNT chọn Quận/Huyện tại chỉ tiêu 5c');
            $(document).ready(function (){
                $('#ct5c_maQuan').focus();
            })
            return false;
        }
        if (!ct5d_maTinh) {
            alert('Đề nghị NNT chọn Tỉnh/Thành phố tại chỉ tiêu 5d ');
            $(document).ready(function (){
                $('#ct5d_maTinh').focus();
            })
            return false;
        }      
    }
    
    // Check ct6
    if (!ct6a_ten) {
	    alert('Đề nghị NNT nhập dữ liệu tại chỉ tiêu 6a');
	    $(document).ready(function (){
	        $('#ct6a_ten').focus();
	    })
    return false;
    }
    if (!ct6b_soNha) {
        alert('Đề nghị NNT nhập dữ liệu tại chỉ tiêu 6b Số nhà, đường phố/xóm/ấp/thôn');
        $(document).ready(function (){
            $('#ct6b_soNha').focus();
        })
        return false;
    }
    if (!ct6b_maTinh) {
        alert('Đề nghị NNT nhập dữ liệu tại chỉ tiêu 6b Tỉnh/Thành phố');
        $(document).ready(function (){
            $('#ct6b_maTinh').focus();
        })
        return false;
    }
    if (!ct6b_maQuan) {
        alert('Đề nghị NNT nhập dữ liệu tại chỉ tiêu 6b Quận/Huyện');
        $(document).ready(function (){
            $('#ct6b_maQuan').focus();
        })
        return false;
    }
    if (!ct6b_maPhuong) {
        alert('Đề nghị NNT nhập dữ liệu tại chỉ tiêu 6b Phường/Xã');
        $(document).ready(function (){
            $('#ct6b_maPhuong').focus();
        })
        return false;
    }
    if (!ct6c_soNha) {
        alert('Đề nghị NNT nhập dữ liệu tại chỉ tiêu 6c Số nhà, đường phố/xóm/ấp/thôn');
        $(document).ready(function (){
            $('#ct6c_soNha').focus();
        })
        return false;
    }
    if (!ct6c_maTinh) {
        alert('Đề nghị NNT nhập dữ liệu tại chỉ tiêu 6c Tỉnh/Thành phố');
        $(document).ready(function (){
            $('#ct6c_maTinh').focus();
        })
        return false;
    }
    if (!ct6c_maQuan) {
        alert('Đề nghị NNT nhập dữ liệu tại chỉ tiêu 6c Quận/Huyện');
        $(document).ready(function (){
            $('#ct6c_maQuan').focus();
        })
        return false;
    }
    if (!ct6c_maPhuong) {
        alert('Đề nghị NNT nhập dữ liệu tại chỉ tiêu 6c Phường/Xã');
        $(document).ready(function (){
            $('#ct6c_maPhuong').focus();
        })
        return false;
    }
    
    // check ct7
    if (ct7a_so || ct7b_ngayCap || ct7c_coQuanCap) {
        if (!ct7a_so) {
            alert('Đề nghị NNT nhập dữ liệu tại chỉ tiêu 7a');
            $(document).ready(function (){
                $('#ct7a_so').focus();
            })
            return false;
        }
        if (!ct7b_ngayCap) {
            alert('Đề nghị NNT nhập dữ liệu tại chỉ tiêu 7b');
            $(document).ready(function (){
                $('#ct7b_ngayCap').focus();
            })
            return false;
        }
        if (!ct7c_coQuanCap) {
            alert('Đề nghị NNT nhập dữ liệu tại chỉ tiêu 7c');
            $(document).ready(function (){
                $('#ct7c_coQuanCap').focus();
            })
            return false;
        }
    }
    
    //check ct8
    if (!ct8a_ngaySinh) {
        alert('Đề nghị NNT nhập dữ liệu tại chỉ tiêu 8a');
        $(document).ready(function (){
            $('#ct8a_ngaySinh').focus();
        })
        return false;
    }
    if (!ct8b_maQuocTich) {
        alert('Đề nghị NNT chọn Quốc tịch tại chỉ tiêu 8b');
        $(document).ready(function (){
            $('#ct8b_maQuocTich').focus();
        })
        return false;
    }
    if (!ct8c_loaiGiayTo) {
        alert('Đề nghị NNT chọn Loại giấy tờ');
        $(document).ready(function (){
            $('#ct8c_loaiGiayTo').focus();
        })
        return false;
    }
    if (!ct8c_soGiayTo) {
        alert('Đề nghị NNT nhập dữ liệu số giấy tờ tại chỉ tiêu 8c');
        $(document).ready(function (){
            $('#ct8c_soGiayTo').focus();
        })
        return false;
    }
    if (!ct8c_ngayCap) {
        alert('Đề nghị NNT nhập dữ liệu ngày cấp tại chỉ tiêu 8c');
        $(document).ready(function (){
            $('#ct8c_ngayCap').focus();
        })
        return false;
    }
    if (!ct8c_noiCap) {
        alert('Đề nghị NNT chọn nơi cấp tại chỉ tiêu 8c');
        $(document).ready(function (){
            $('#ct8c_noiCap').focus();
        })
        return false;
    }
    
    // check ct10
    if (!ct10_ma) {
        alert('Đề nghị NNT chọn ngành nghề kinh doanh tại chỉ tiêu 10');
        $(document).ready(function (){
            $('#ct10_ma').focus();
        })
        return false;
    }

    //check ct11
    if (!ct11) {
        alert('Đề nghị NNT chọn ngày bắt đầu hoạt động tại chỉ tiêu 11');
        $(document).ready(function (){
            $('#ct11').focus();
        })
        return false;
    }

    // check ct12

    
    // chech nguoiKy
    if (!nguoiKy) {
        alert('Vui lòng ký tên');
        $(document).ready(function (){
            $('#nguoiKy').focus();
        })
        return false;
    }
    
    return true;
}