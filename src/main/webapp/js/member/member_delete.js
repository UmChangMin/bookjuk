/**
 * 
 */
function memberDelete(obj){
	if (obj.member_password.value == "") {
		alert("비밀번호를 입력해주세요");
		obj.member_password.focus();
		return false;
	}
}