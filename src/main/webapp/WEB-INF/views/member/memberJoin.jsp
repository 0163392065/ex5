<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
   $(function() {
      $("#btn").click(function() {
         var path="";
         $(".g").each(function() {
            if($(this).prop("checked")){
               path=$(this).val()+"Join";
               
            };
         });
         $("#frm").attr("action", path).submit();
         
         
      });
   });

</script>
</head>
<body>
   
   <form action="" id="frm" method="post" enctype="multipart/form-data">
      <div>
         STUDENT<input type="radio" class="g" checked="checked" name="grade" value="student">
         TEACHER<input type="radio" class="g" name="grade" value="teacher">
      </div>
      <!-- 공통 입력 -->
      <div>
         <p>ID : <input type="text" name="id"></p>
         <p>PW : <input type="password" name="pw"></p>
         <p>NAME : <input type="text" name="name"></p>
         <p>age : <input type="text" name="age"></p>
         <p>FIlE : <input type="file" name="f1"></p>
      </div>
      
      <!-- Student -->
      <div>
         
         <p>PHONE : <input type="text" name="phone"></p>
         <p>TID : <input type="text" name="tid"></p>
      </div>
      
      <!-- teacher -->
      <div>
         <p>SUBJECT : <input type="text" name="subject"></p>
         <p>HireDATE : <input type="date" name="hireDate"></p>
      </div>
   
      <input type="button" value="JOIN" id="btn">
   </form>


</body>
</html>