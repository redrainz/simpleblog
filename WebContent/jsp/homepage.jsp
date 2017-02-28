
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>HomePage</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
</head>


<body>
<%@include file="header.jsp" %>
    <table class="filetable">
    
    <thead>
    	<tr>
        <th>作者</th>
        <th>标题</th>
        <th>简介</th>
        <th>附件</th>
        <th>下载</th>
        <th>播放</th>
        <th>修改日期</th>
        </tr>    	
    </thead>
    
    <tbody>
    <s:iterator >
    <tr>
   <td>${user.nickname}</td>
 <td><a href="hponearticleget?id=${id }">${title }</a></td>
 <td>${describes}</td>
 <td>${movie }</td>
 <td><a href="downloadmovie?savePath=${movie }">下载      </a></td>
 <td><a href="moviestart?savePath=${movie }">播放</a></td>
 <td>${date }</td>
        </tr>
</s:iterator>
    	
    </tbody>
    
    
    
    
    </table>
</body>
</html>