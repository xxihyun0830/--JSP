<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<div class="brand" style="color:silver">DECADANCE</div>  
	
	<% if (session.getAttribute("id") == null) { %>        
    	<div class="address-bar" style="color:silver">猫 </div>
	<%} else { %>      
	    <div class="address-bar" style="color:silver">猫 <br>
	    WELCOME, <%=session.getAttribute("name") %>!
	    </div>
    <% } %>
    <!-- header start (메뉴 바) -->
    <nav class="navbar navbar-default" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                
                <a class="navbar-brand" href="/decadance">DECADANCE</a>
            </div>
           
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                	
                    <li>
                        <a href="/decadance">HOME</a>
                    </li>
                    <li>
                        <a href="/decadance/member/member.jsp">MEMBER</a>
                    </li>
                    <li>
                        <a href="/decadance/board/list.board">BOARD</a>
                    </li>
                    
                    <%if(session.getAttribute("id") == null) { %>
                    
                    <li>
                        <a href="/decadance/members/login_form.jsp">LOGIN</a>
                    </li>
                    <li>
                        <a href="/decadance/members/join_form.jsp" style="color:red">JOIN</a>
                    </li>
                     <%}else { %>
                    <li>
                        <a href="/decadance/members/mypage.jsp">MYPAGE</a>
                    </li>
                    <li>
                        <a href="/decadance/members/logout.jsp" style="color:red">LOGOUT</a>
                    </li>
                    <%} %>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
    <!-- header end -->