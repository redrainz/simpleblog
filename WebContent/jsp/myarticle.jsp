<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>${title }</title>

</head>
<body>
<%@include file="header.jsp" %>
<s:iterator >
${id}----
<a href="onearticleget?id=${id}">${title }</a>
-----${date }-----${ content}<br>

</s:iterator>

</body>
</html>