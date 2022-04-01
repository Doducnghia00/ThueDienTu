

function TinhThue(){
	//var tongthunhap = parseInt(document.getElementById("tongthunhap").value.replace(/./g,""));
	var tongthunhapText = document.getElementById("tongthunhap").value.replace(/[($)\s\._\-]+/g, '');
	var tongthunhap = parseInt(tongthunhapText);
    
    console.log("tong thu nhap ="+ tongthunhap);
    //var npt = parseInt(document.getElementById("songuoiphuthuoc").value.replaceAll("."," "));
    
    var nptText = document.getElementById("songuoiphuthuoc").value.replace(/[($)\s\._\-]+/g, '');
    
	if (tongthunhapText == null || tongthunhapText == "") alert("Vui lòng nhập tổng thu nhập!");
	else{
		let tongthue = 0;
		
		var text = "Giảm trừ bản thân = 11.000.000 <br>";
		if (nptText == null || nptText == ""){
			var npt = 0;
    		console.log("1.npt = " + npt);
    		var tmp = tongthunhap - 11000000 - npt*4400000;
	        text += "Giảm trừ người phụ thuộc = 0 x 4.400.000 = " + npt*4400000 + "<br>";
	    }else{
			var npt = parseInt(nptText);
    		console.log("1.npt = " + npt);
    		var tmp = tongthunhap - 11000000 - npt*4400000;
	        text += "Giảm trừ người phụ thuộc = " + npt +" x 4.400.000 = " + npt*4400000 + "<br>";
	    }
		//text += "Thu nhập chịu thuế = " + tongthunhap + " - " + "11.000.000" + " - " + npt*4400000 + " = " + tmp + "<br>";
		text += "<p style = \"margin-left: 0px;\"></p>"
		console.log("2.npt = " + npt);
		console.log("2.tmp = " + tmp);
	    if (tmp <= 0){
			tongthue = 0;
			text += "Thu nhập chịu thuế = " + formatNumber(tongthunhap) + " - " + "11.000.000" + " - " + formatNumber(npt*4400000) + " = " + formatNumber(tmp) + "<br>";;
		}else if(tmp <= 5000000){
	        tongthue = tmp*0.05;
	        
	        text += "Thu nhập chịu thuế = " + formatNumber(tongthunhap) + " - " + "11.000.000" + " - " + formatNumber(npt*4400000) + " = " + formatNumber(tmp) + "<br>";
	        text += "+ Bậc 1: Thu nhập tính thuế đến 05 triệu đồng, thuế suất 5%: <br>";
	        text += "<p style = \"margin-left: 0px;\">" + formatNumber(tmp)+" x 5% = "+ formatNumber(tongthue) + "</p><br>";
	        text += "Thuế thu thập cá nhân = "+formatNumber(tongthue)+"đ" + "<br>";
	        
	    }else if (tmp > 5000000 && tmp <= 10000000 ){
	        tongthue = 5000000*0.05 + (tmp-5000000)*0.1;
			
			text += "Thu nhập chịu thuế = " + formatNumber(tongthunhap) + " - " + "11.000.000" + " - " + formatNumber(npt*4400000) + " = " + formatNumber(tmp) + "<br>";
	        text += "+ Bậc 1: Thu nhập tính thuế đến 05 triệu đồng, thuế suất 5%:" + "<br>";
	        text += "<p style = \"margin-left: 0px;\">" + "5.000.000 x 5% = 250.000" + "</p><br>";
	        text += "+ Bậc 2: Thu nhập tính thuế trên 05 triệu đồng đến 10 triệu đồng, thuế suất 10%:" + "<br>" ;
	        text += "<p style = \"margin-left: 0px;\">" +  "("+formatNumber(tmp)+" - 5.000.000) x 10% = "+ formatNumber((tmp-5000000)*0.1) + "<br>";
	        text += "Thuế thu nhập cá nhân = 250.000+ "+ formatNumber((tmp-5000000)*0.1) +" = "+formatNumber(tongthue)+"đ" + "<br>";

        
	    }else if (tmp <= 18000000 && tmp > 10000000 ){
	        tongthue = 5000000*0.05 + 5000000*0.1 + (tmp-10000000)*0.15;
			
			text += "Thu nhập chịu thuế = " + formatNumber(tongthunhap) + " - " + "11.000.000" + " - " + formatNumber(npt*4400000) + " = " + formatNumber(tmp) + "<br>";
	        text += "+ Bậc 1: Thu nhập tính thuế đến 05 triệu đồng, thuế suất 5%:" + "<br>";
	        text += "<p style = \"margin-left: 0px;\">" + "5.000.000 x 5% = 250.000" + "</p><br>";
	        text += "+ Bậc 2: Thu nhập tính thuế trên 05 triệu đồng đến 10 triệu đồng, thuế suất 10%:" + "<br>" ;
	        text += "<p style = \"margin-left: 0px;\">" + "(10.000.000 - 5.000.000) x 10% = 500.000" + "</p><br>";
	        text += "+ Bậc 3: Thu nhập tính thuế trên 10 triệu đồng đến 18 triệu đồng, thuế suất 15%:" + "<br>";
	        text += "<p style = \"margin-left: 0px;\">" + "("+formatNumber(tmp)+" - 10.000.000) x 15% = "+formatNumber((tmp-10000000)*0.15) + "</p><br>";
	        text += "Thuế thu nhập cá nhân = 250.000+500.000 + "+formatNumber((tmp-10000000)*0.15) + " = " + formatNumber(tongthue) + "đ" + "<br>";
	
	
	    }else if (tmp > 18000000 && tmp <= 32000000 ){
	        tongthue = 5000000*0.05 + 5000000*0.1 + 8000000*0.15 + (tmp - 18000000)*0.2;
			
			text += "Thu nhập chịu thuế = " + formatNumber(tongthunhap) + " - " + "11.000.000" + " - " + formatNumber(npt*4400000) + " = " + formatNumber(tmp) + "<br>";
	        text += "+ Bậc 1: Thu nhập tính thuế đến 05 triệu đồng, thuế suất 5%:" + "<br>";
	        text += "<p style = \"margin-left: 0px;\">" + "5.000.000 x 5% = 250.000" + "</p><br>";
	        text += "+ Bậc 2: Thu nhập tính thuế trên 05 triệu đồng đến 10 triệu đồng, thuế suất 10%:" + "<br>" ;
	        text += "<p style = \"margin-left: 0px;\">" + "(10.000.000 - 5.000.000) x 10% = 500.000)" + "</p><br>";
	        text += "+ Bậc 3: Thu nhập tính thuế trên 10 triệu đồng đến 18 triệu đồng, thuế suất 15%:" + "<br>";
	        text += "<p style = \"margin-left: 0px;\">" + "(18.000.000 - 10.000.000) x 15% = 1.200.000" + "</p><br>";
	        text += "+ Bậc 4: Thu nhập tính thuế trên 18 triệu đồng đến 32 triệu đồng, thuế suất 20%:" + "<br>";
	        text += "<p style = \"margin-left: 0px;\">" + "(" + formatNumber(tmp) + " - 18.000.000) x 20% = " + formatNumber((tmp-18000000)*0.2) + "</p><br>";
	        text += "Thuế thu nhập cá nhân = 250.000 + 500.000  +1.200.000 + "+formatNumber((tmp-18000000)*0.2)+" = "+formatNumber(tongthue)+"đ" + "<br>";
	
	    }else if (tmp > 32000000 && tmp <= 52000000 ){
	        tongthue = 5000000*0.05 + 5000000*0.1 + 8000000*0.15 + 14000000*0.2 + (tmp-32000000)*0.25;
			
			text += "Thu nhập chịu thuế = " + formatNumber(tongthunhap) + " - " + "11.000.000" + " - " + formatNumber(npt*4400000) + " = " + formatNumber(tmp) + "<br>";
	        text += "+ Bậc 1: Thu nhập tính thuế đến 05 triệu đồng, thuế suất 5%:" + "<br>";
	        text += "<p style = \"margin-left: 0px;\">" + "5.000.000 x 5% = 250.000" + "</p><br>";
	        text += "+ Bậc 2: Thu nhập tính thuế trên 05 triệu đồng đến 10 triệu đồng, thuế suất 10%:" + "<br>" ;
	        text += "<p style = \"margin-left: 0px;\">" + "(10.000.000 - 5.000.000) x 10% = 500.000)" + "</p><br>";
	        text += "+ Bậc 3: Thu nhập tính thuế trên 10 triệu đồng đến 18 triệu đồng, thuế suất 15%:" + "<br>";
	        text += "<p style = \"margin-left: 0px;\">" + "(18.000.000 - 10.000.000) x 15% = 1.200.000" + "</p><br>";
	        text += "+ Bậc 4: Thu nhập tính thuế trên 18 triệu đồng đến 32 triệu đồng, thuế suất 20%:" + "<br>";
	        text += "<p style = \"margin-left: 0px;\">" + "(32.000.000 - 18.000.000) x 20% = 2.800.000" + "</p><br>";
	        text += "+ Bậc 5: Thu nhập tính thuế trên 32 triệu đồng đến 52 triệu đồng, thuế suất 25%:" + "<br>";
	        text += "<p style = \"margin-left: 0px;\">" + "("+formatNumber(tmp)+" - 32.000.000) x 25% = "+ formatNumber((tmp-32000000)*0.25) + "</p><br>";
	        text += "Thuế thu nhập cá nhân = 250.000+500.000+1.200.000+2.800.000+"+formatNumber((tmp-32000000)*0.25)+" = "+formatNumber(tongthue)+"đ" + "<br>";
	
	    }else if (tmp <= 80000000 && tmp > 52000000 ){
	        tongthue = 5000000*0.05 + 5000000*0.1 + 8000000*0.15 + 14000000*0.2 + 20000000*0.25 + (tmp-52000000)*0.3;
			
			text += "Thu nhập chịu thuế = " + formatNumber(tongthunhap) + " - " + "11.000.000" + " - " + formatNumber(npt*4400000) + " = " + formatNumber(tmp) + "<br>";
	        text += "+ Bậc 1: Thu nhập tính thuế đến 05 triệu đồng, thuế suất 5%:" + "<br>";
	        text += "<p style = \"margin-left: 0px;\">" + "5.000.000 x 5% = 250.000" + "</p><br>";
	        text += "+ Bậc 2: Thu nhập tính thuế trên 05 triệu đồng đến 10 triệu đồng, thuế suất 10%:" + "<br>" ;
	        text += "<p style = \"margin-left: 0px; height: 0px;\">" + "(10.000.000 - 5.000.000) x 10% = 500.000)" + "</p><br>";
	        text += "+ Bậc 3: Thu nhập tính thuế trên 10 triệu đồng đến 18 triệu đồng, thuế suất 15%:" + "<br>";
	        text += "<p style = \"margin-left: 0px; height: 0px;\">" + "(18.000.000 - 10.000.000) x 15% = 1.200.000" + "</p><br>";
	        text += "+ Bậc 4: Thu nhập tính thuế trên 18 triệu đồng đến 32 triệu đồng, thuế suất 20%:" + "<br>";
	        text += "<p style = \"margin-left: 0px; height: 0px;\">" + "(32.000.000 - 18.000.000) x 20% = 2.800.000" + "</p><br>";
	        text += "+ Bậc 5: Thu nhập tính thuế trên 32 triệu đồng đến 52 triệu đồng, thuế suất 25%:" + "<br>";
	        text += "<p style = \"margin-left: 0px; height: 0px;\">" + "(52.000.000 - 32.000.000) x 25% = 5.000.000" + "</p><br>";
	        text += "+ Bậc 6: Thu thập tính thuế trên 52 triệu đồng đến 80 triệu đồng, thuế suất 30%:" + "<br>";
	        text += "<p style = \"margin-left: 0px; height: 0px;\">" + "("+formatNumber(tmp)+"-52.000.000) x 30% = "+formatNumber((tmp-52000000)*0.3) + "</p><br>";
	        text += "Thuế thu nhập cá nhân = 250.000+500.000+1.200.000+2.800.000+5.000.000+"+formatNumber((tmp-52000000)*0.3)+"="+formatNumber(tongthue)+"đ" + "<br>";
	
	    }else if (tmp>80000000){ 
	        tongthue = 5000000*0.05 + 5000000*0.1 + 8000000*0.15 + 14000000*0.2 + 20000000*0.25 + 28000000*0.3 + (tmp-80000000)*0.35;
			
			text += "Thu nhập chịu thuế = " + formatNumber(tongthunhap) + " - " + "11.000.000" + " - " + formatNumber(npt*4400000) + " = " + formatNumber(tmp) + "<br>";
	        text += "+ Bậc 1: Thu nhập tính thuế đến 05 triệu đồng, thuế suất 5%:" + "<br>";
	        text += "<p style = \"margin-left: 0px; height: 0px;\">" + "5.000.000 x 5% = 250.000" + "</p><br>";
	        text += "+ Bậc 2: Thu nhập tính thuế trên 05 triệu đồng đến 10 triệu đồng, thuế suất 10%:" + "<br>" ;
	        text += "<p style = \"margin-left: 0px; height: 0px;\">" + "(10.000.000 - 5.000.000) x 10% = 500.000)" + "</p><br>";
	        text += "+ Bậc 3: Thu nhập tính thuế trên 10 triệu đồng đến 18 triệu đồng, thuế suất 15%:" + "<br>";
	        text += "<p style = \"margin-left: 0px; height: 0px;\">" + "(18.000.000 - 10.000.000) x 15% = 1.200.000" + "</p><br>";
	        text += "+ Bậc 4: Thu nhập tính thuế trên 18 triệu đồng đến 32 triệu đồng, thuế suất 20%:" + "<br>";
	        text += "<p style = \"margin-left: 0px; height: 0px;\">" + "(32.000.000 - 18.000.000) x 20% = 2.800.000" + "</p><br>";
	        text += "+ Bậc 5: Thu nhập tính thuế trên 32 triệu đồng đến 52 triệu đồng, thuế suất 25%:" + "<br>";
	        text += "<p style = \"margin-left: 0px; height: 0px;\">" + "(52.000.000 - 32.000.000) x 25% = 5.000.000 " + "</p><br>";
	        text += "+ Bậc 6: Thu thập tính thuế trên 52 triệu đồng đến 80 triệu đồng, thuế suất 30%:" + "<br>";
	        text += "<p style = \"margin-left: 0px; height: 0px;\">" + "(80.000.000-52.000.000) x 30% = 8.400.000 " + "</p><br>";
	        text += "+ Bậc 7: Thu thập tính thuế trên 80 triệu đồng, thuế suất 35%:" + "<br>";
	        text += "<p style = \"margin-left: 0px; height: 0px;\">" + "("+formatNumber(tmp)+"-80.000.000) x 35% = "+formatNumber(parseInt((tmp-80000000)*0.35 + 0)) + "</p><br>";
	        text += "Thuế thu nhập cá nhân = 250.000+500.000+1.200.000+2.800.000+5.000.000+8.400.000+"+formatNumber(parseInt((tmp-80000000)*0.35 + 0))+"="+formatNumber(parseInt(tongthue))+"đ" + "<br>";
	
	    }
	    tongthue = Math.trunc(tongthue);
		var thue = formatNumber(tongthue);
	    document.getElementById("kq").innerHTML ="Thuế phải nộp: " + thue + "VNĐ";
	    console.log(tongthue + "đ");
	  	document.getElementById("text").innerHTML = text;
	}
} 
function formatNumber(num) {
    return num.toString().replace(/(\d)(?=(\d{3})+(?!\d))/g, '$1.')
}

function formatString(string){
	var i = parseInt(string.replace(/[($)\s\._\-]+/g, ''))
	return i;
}

(function($, undefined) {

	"use strict";

	// When ready.
	$(function() {
		
		var $form = $( "#form-2" );
		var $input = $form.find( "input" );

		$input.on( "keyup", function( event ) {
			
			
			// When user select text in the document, also abort.
			var selection = window.getSelection().toString();
			if ( selection !== '' ) {
				return;
			}
			
			// When the arrow keys are pressed, abort.
			if ( $.inArray( event.keyCode, [38,40,37,39] ) !== -1 ) {
				return;
			}
			
			
			var $this = $( this );
			
			// Get the value.
			var input = $this.val();
			
			var input = input.replace(/[\D\s\._\-]+/g, "");
					 input = input ? parseInt( input, 10 ) : 0;
					console.log(input);
					$this.val( function() {
						return ( input === 0 ) ? "" : input.toLocaleString( "de-DE" );
					} );
		} );
		
		
	});
})(jQuery);

