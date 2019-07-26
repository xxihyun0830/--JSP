ㅔ<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% if(session.getAttribute("id")==null) { %>
<script>
	alert("로그인이 필요한 서비스입니다.");
	document.location.href='/decadance';
</script>
<%} %> 
<!DOCTYPE html>
<html>
<head>

<style>
.div_center {
    margin-bottom: 20px;
    padding: 30px 15px;
    background: #fff;
    background: rgba(255,255,255,0.9);
}      
</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-idth, initial-scale=1">
   

    <title>DECADANCE</title>

    <!-- Bootstrap Core CSS -->
    <link href="../css/bootstrap.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../css/business-casual.css" rel="stylesheet">

    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">
	
	 <!-- jQuery -->
    <script src="../js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../js/bootstrap.min.js"></script>
    
    <script src = "../js/member.js"></script>

</head>

<body>

    <!-- Navigation -->
	<jsp:include page="../include/header.jsp"/>
	<div class="div_center" align="center">
	
	<h3>My Web Board</h3>
	<hr>
	<table align="center" width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td align="center">number</td>
			<td align="center">by</td>
			<td align="center">title</td>
			<td align="center">date</td>
			<td align="center">hit</td>
		</tr>
		
		<c:forEach var="vo" items="${board_list}"/>
		
		<!--  <c:forEach var = "현재 아이템의 변수명", items = "반복 데이터가 있는 아이템 Collection 명" >
		
		     BoardListService 에서
		     BoardDAO dao = BoardDAO.getInstance();
		     ArrayList<BoardVO> list = dao.getList();
		     request.setAttribute("board_list", list);
		
	           
		 -->
	
		
		<tr>
			<td align="center">${vo.bId}</td>
			<td align="center">${vo.bName}</td>
			<td align="center">
				<a href="content_view.board?bId=${vo.bId}">
				${vo.bTitle}
				</a>
			</td>
			<td align="center">${vo.bDate}</td>
			<td align="center">${vo.bHit}</td>
		</tr>
		</c:forEach>
		
		<tr>
			<td align="center" colspan="5">
				<a href="write_view.board">[WRITE]</a>
			</td>
		</tr>

	</table>

	</div>
	<jsp:include page="../include/footer.jsp"/>

</body>
</html>