/**
 * 
 */
 console.log('js')
 
 function Tinh(){
	const vn = parseInt(document.querySelector("#thunhapvn").value);
	const nn = parseInt(document.querySelector("#thunhapnn").value);
	const cn = parseInt(document.querySelector("#cn").value);
	const pt = parseInt(document.querySelector("#pt").value);
	const tn = document.querySelector("#tn");
	const tt = document.querySelector("#tt");
	const tntt = document.querySelector("#tntt");
	const danop = parseInt(document.querySelector("#danop").value);
	const cpn = document.querySelector("#conphainop");
	const nopthua = document.querySelector("#nopthua");
	if (isNaN(vn) || isNaN(nn) || isNaN(danop)) alert("Vui lòng nhập đủ các trường bắt buộc!");
	else{
		const tongthunhaptinhthue = vn+nn-cn-pt > 0 ? vn+nn-cn-pt : 0;
		let tongthue = vn+nn-cn-pt;
		let tmp = tongthunhaptinhthue/12;
		if (tmp <= 5000000){
			tongthue = tmp*0.05;
		}else if (tmp > 5000000 && tmp <= 10000000 ){
			tongthue = 5000000*0.05 + (tmp-5000000)*0.1;
		}else if (tmp <= 18000000 && tmp > 10000000 ){
			tongthue = 5000000*0.05 + 5000000*0.1 + (tmp-10000000)*0.15;
		}else if (tmp > 18000000 && tmp <= 32000000 ){
			tongthue = 5000000*0.05 + 5000000*0.1 + 8000000*0.15 + (tmp - 18000000)*0.2;
		}else if (tmp > 32000000 && tmp <= 52000000 ){
			tongthue = 5000000*0.05 + 5000000*0.1 + 8000000*0.15 + 14000000*0.2 + (tmp-32000000)*0.25;
		}else if (tmp <= 80000000 && tmp > 52000000 ){
			tongthue = 5000000*0.05 + 5000000*0.1 + 8000000*0.15 + 14000000*0.2 + 20000000*0.25 + (tmp-52000000)*0.3;
		}else if (tmp>80000000) tongthue = 5000000*0.05 + 5000000*0.1 + 8000000*0.15 + 14000000*0.2 + 20000000*0.25 + 28000000*0.3 + (tmp-80000000)*0.35;
		tongthue = Math.trunc(tongthue*12);
		tn.value= vn+nn;
		tntt.value=tongthunhaptinhthue;
		tt.value= tongthue;
		cpn.value = tongthue > danop ? tongthue-danop : 0;
		nopthua.value = tongthue < danop ? danop - tongthue : 0; 
	}
}

function TinhThue(){
	
}

