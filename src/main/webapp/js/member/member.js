/**
 * 
 */
function zipcodeRead(root){
		 var url=root+"/member/zipcode.do";
		 window.open(url,"", "width=500, height=600, scrollbars=yes, left=620px, top=225px" );
			
}
	
function memberUpdate(obj) {
	if (obj.name.value == "") {
		alert("이름을 입력하세요");
		obj.name.focus();
		return false;
	}
	
	if (obj.password.value == "") {
		alert("비밀번호를 입력하세요");
		obj.password.focus();
		return false;
	}
	
	if (obj.email.value == "") {
		alert("이메일을 입력하세요");
		obj.email.focus();
		return false;
	}
}

function memberDelete(obj){
	if (obj.password.value == "") {
		alert("비밀번호를 입력하세요");
		obj.password.focus();
		return false;
	}
}