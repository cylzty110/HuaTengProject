<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <title>json交互测试</title>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.4.4.min.js"></script>
    <script type="text/javascript">
    //请求key/value,输出是json
    function responseJson(){
    	$.ajax({
    	type:'put',
    	url:'${pageContext.request.contextPath }/part/19',
    	contentType:'application/json;charset=utf-8',  //发送至服务器的类型
    	//数据格式是json
    	data:'{"partNumber":"H8HX0000B","partName":"测试"}',
    	success:function(data){
    	//返回json
    	alert(data);
    	}
    	});
    }
    </script>
  </head>
  
  <body>
    <input type="button" onclick="responseJson()" value="请求key/value,输出是json">
  </body>
</html>
