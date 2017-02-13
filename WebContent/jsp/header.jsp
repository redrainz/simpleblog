<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="model.User"%>
<style>
#header{
width:100%;
height:10%;
text-align:center;
}
</style>
<div id="header">

<h6> 
<% User user=(User)session.getValue("user");
%>



 昵称：<%=user.getNickname() %><br>
权限：<%=user.getRole()%>

<a href="/simpleblog/jsp/writearticle.jsp">写文章</a><br>

<a href="myarticle">我的文章</a>
<a href="roleexit">退出</a>
<a href="allarticle">首页</a>
</h6>
</div>