<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<c:if test="${member eq null }">
<a href="member/memberJoin">MemberJoin</a>
<a href="member/memberLogin">Login</a>
</c:if>
<c:if test="${member ne null }">
<a href="member/memberLogout">Logout</a>
<a href="member/memberPage">MyPage</a>
</c:if>
</body>
</html>
