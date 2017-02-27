<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>${ movie}</title>
</head>

<body>
<%@include file="header.jsp" %>
 <video src="../../upload/${ movie}" controls="controls" height="80%" width="100%">

${ movie}
           
</video> 
<%-- <a href="/simpleblog/upload/${movie }">dds</a> --%>
</body>
</html>