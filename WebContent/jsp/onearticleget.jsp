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
<title>修改文章</title>
</head>
<body>

<center>
<%@include file="header.jsp" %>

<s:form action="onearticleupdate" id="form" method="post">
 <s:textarea rows="1" cols="100" name="title" label="标题" >
  </s:textarea>
 <s:textarea rows="3" cols="100" name="describes" label="大纲">

 </s:textarea> 
<s:textarea rows="30" cols="100" name="content" label="内容" >

</s:textarea> 
<br>
<s:hidden name="id"></s:hidden>

</s:form>
<input onclick="yan()" value="修改" type="button"/>

<a href="onearticledalete?id=${id }">删除</a>



</center>
</body>
</html>