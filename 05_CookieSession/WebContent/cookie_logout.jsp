<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
   Cookie[] cookies = request.getCookies();

   if(cookies != null) {
      for (int i = 0; i < cookies.length; i++) {
         if (cookies[i].getValue().equals("abc1234")) {
            cookies[i].setMaxAge(0);
            response.addCookie(cookies[i]);
         }
      }
   }
   response.sendRedirect("cookie_all.jsp");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>