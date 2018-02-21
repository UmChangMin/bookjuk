/**
 * AJAX 
 */

function createXHR() {
	if(window.XMLHttpRequest){
		return new XMLHttpRequest();
	}else{
		return new ActiveXObject("Microsoft.XMLHTTP");
	}
}

var xhr=null;
var arr=new Array();

function sendRequest(method, url, callback, params){
		
	var httpMethod=method.toLowerCase();
	var httpUrl=url;
	
	var httpParams=(params==null||params=="")? null:params;
	
	if(httpMethod=="get"&&params!=null){
		httpUrl+="?"+httpParams;
	}
	
	xhr=createXHR();//객체발생용
	arr.push("전송방식:"+httpMethod);
	arr.push("Url주소:"+httpUrl);
	arr.push("데이터값:"+httpParams);
	
	//alert(arr.join("\n"));
	
	xhr.open(httpMethod, httpUrl, true);
	xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	xhr.send(httpMethod=="post"? httpParams:null);
	
	xhr.onreadystatechange=callback;
}

function callback() {
	alert(xhr.readyState+","+xhr.status);
	if(xhr.readyState==4 && xhr.status==200){
		//alert(xhr.responseXML);
		processXML();
	}
}

function processXML() {
	var xmlDoc=xhr.responseXML;
	var lectureList=xmlDoc.getElementsByTagName("lecture");

	alert(lectureList.length);
	for(var i=0;i<lectureList.length;i++){
		var lecture=lectureList[i];//0번지 값 하나씩
		var subElement=lecture.childNodes;
		
		var div=document.getElementById("disp");
		var divNode=document.createElement("div");
		
		div.appendChild(divNode);
		
		for(var j=0;j<subElement.length;j++){
			if(subElement[j].nodeType==1){//값이 있으면
				var sub=subElement[j].childNodes[0].nodeValue;
				
				var spanNode=document.createElement("span");
				spanNode.innerHTML=sub+"&nbsp;&nbsp;";
				
				divNode.appendChild(spanNode);
				arr.push(sub);
			}
		}
	}
	//alert(arr.join("\n"));
}
