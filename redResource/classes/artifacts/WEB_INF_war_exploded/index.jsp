<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
<title>产品信息</title>
</head>
<body> 
文件下载：
<form id="partForm" action="${pageContext.request.contextPath}/spec/38/downloadFile" method="get">
           文件名：<input type="text" name="name"/></br></br>
           文件路径：<input type="text" name="filePath"/></br></br>
 	  		<input type="submit" value="确认下载"/>
 	</form>
</body>

</html>