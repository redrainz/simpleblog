<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function yan(){
	 if((document.getElementsByName("title"))[0].value=="" 
		 || (document.getElementsByName("describes"))[0].value==""
			 || (document.getElementsByName("content"))[0].value=="")
	 alert("标题，大纲或文体不为空！");
 
	else document.getElementById("form").submit();
	 
	
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>写文章</title>
</head>
<body>

<center>
<%@include file="header.jsp" %>
<!-- <h3>
<form action="writearticle" id="form" method="post">
标题：
<textarea rows="1" cols="100" name="content"></textarea><br>
大纲：
<textarea rows="3" cols="100" name="content"></textarea><br>
内容：<br>
<input name="content" type="text">
<textarea rows="30" cols="100" name="content"></textarea>
<br>
<input type="button" onclick="yan()"value="提交">
</form>
</h3> -->
<s:form action="writearticle" id="form" method="post" enctype="multipart/form-data" >
<s:textarea rows="1" cols="100" name="title" label="标题"/>
<s:textarea rows="3" cols="100" name="describes" label="大纲"/>
<s:textarea rows="20" cols="100" name="content" label="内容"/>
<s:file name="movie" label="文件" ></s:file>
<br>
</s:form>


<input onclick="yan()" value="提交" type="button" />



</center>
</body>
</html>