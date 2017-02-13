
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!-- <style>
#header {
    background-color:black;
    color:white;
    text-align:center;
    padding:5px;
}
#nav {
    line-height:30px;
    background-color:#eeeeee;
    height:300px;
    width:30%;
    float:right;
    padding:5px;	      
}
#section {
    width:350px;
    float:left;
    padding:10px;	 	 
}
#footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
   padding:5px;	 	 
}
</style> -->
<style>
#header{
width:100%;
height:10%;
text-align:center;
}
#left {
float:left;
width:25%;
height:100%;

	 
}
#center {
float:left;
width:50%;
height:100%;

 	 
}
#right {
float:right;
width:25%;
height:100%;

 	 
}
body{
background-image:url(/simpleblog/1.jpg);
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
</head>
<body >
<center>
<%@include file="header.jsp" %>
<div id="left">
<s:iterator >
${user.nickname}----
<a href="hponearticleget?id=${id }">${title }</a>
-----${date }-----${ content}<br>
${movie }<a href="downloadmovie?savePath=${movie }">下载</a>

------<a href="moviestart?savePath=${movie }">播放</a>
<br>
</s:iterator>
</div>
<div id="center">
sdasd
</div>
<div id="right">

ygfghfg
</div>
</center>
</body>
<!-- <frameset cols="25%,50%,25%" border="0">

  <frame src="htmlpage/index-left.html">
  <frame src="htmlpage/index-center.jsp">
  <frame src="htmlpage/login-in.html">

</frameset> -->
</html>