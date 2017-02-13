<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function yan(){
	 if((document.getElementsByName("nickname"))[0].value=="" 
			 || (document.getElementsByName("password"))[0].value==""
				 || (document.getElementsByName("password1"))[0].value=="")
		 alert("昵称或密码不为空！");
	 else 
	if((document.getElementsByName("password"))[0].value!=(document.getElementsByName("password1"))[0].value)
		 alert("两次密码不一致！");
		else document.getElementById("form1").submit();
	 
	
	
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册</title>
</head>
<body>
<center>
<%if(request.getAttribute("exist")!=null) 
	out.println("昵称已存在"); %>
<form action="zhuce" method="post" id="form1">
昵称：<input name="nickname" type="text"><br/>
密码：<input name="password" type="password"><br/>
重输密码：<input name="password1" type="password"><br>
<input type="button" value="提交" onclick="yan()">

</form>
</center>

</body>
</html>