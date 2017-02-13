<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function yan(){
	 if((document.getElementsByName("content1"))[0].value=="" 
		 )
	 alert("内容不为空！");
 
	else document.getElementById("form").submit();
 
	
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>${title }</title>
</head>
<body>

<center>
<%@include file="header.jsp" %>
<s:push value="#session.article">
<br>
${user.nickname }
<br>
${title }
<br>
${describes }
<br>
${content }
<br>

--------------------------------------------------------------------
<br>
<%int i=1; %>
<s:iterator value="comments" var="a" status="as">

<%=i++ %>-------- ${user.nickname}----${content }------${date}<br>
</s:iterator>
<br>
</s:push>
<s:form action="addcomment" id="form" method="post">
<s:hidden name="id"></s:hidden>
 <s:textarea rows="3" cols="100" name="content1" label="评论"/>

</s:form>
<br>
<input onclick="yan()" value="提交" type="button"/>
</center>

</body>
</html>