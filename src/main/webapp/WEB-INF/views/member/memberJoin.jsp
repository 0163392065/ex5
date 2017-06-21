<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
		$(function() {
			$("#btn").click(function() {
				var path = '';
				/* each랑 foreach와 같다. */
				$(".g").each(function() {
					if($(this).prop("checked")){
						path = $(this).val()+"Join";
					}
				});
				
				$("#frm").attr("action", path);
				$("#frm").submit();
				
			});
		});
</script>
<body>

	<form action="" id="frm" method="post" enctype="multipart/form-data">

		<div>
			STUDENT<input type="radio" class="g" checked="checked" name="grade" value="student">
			TEACHER<input type="radio" class="g" name="grade" value="teacher">
		</div>
		
		<!-- 공통 입력 사항 -->
		<div>
			<p>ID : <input type="text" name="id"></p>
			<p>PW : <input type="password" name="pw"></p>
			<p>NAME : <input type="text" name="name"></p>
			<p>AGE : <input type="number" name="age"></p>
			<p>FILE : <input type="file"></p>
			<!-- <p>GRADE : <input type="text" name="grade"></p> -->
			<!-- <p>FNAME : <input type="text" name="fname"></p>
			<p>ORINAME : <input type="text" name="oriname"></p> -->
		</div>
		
		<!-- Student 전용 -->
		<div>
			<p>SID : <input type="text" name="sid"></p>
			<p>PHONE : <input type="text" name="phone"></p>
			<p>TID : <input type="text" name="tid"></p>
		</div>

		<!-- Teacher 전용 -->
		<div>
			<p>TID : <input type="text" name="tid"></p>
			<p>SUBJECT : <input type="text" name="subject"></p>
			<p>HIREDATE : <input type="date" name="hiredate"></p>
		</div>
		<input type="button" value="JOIN" id="btn">
	</form>

</body>
</html>