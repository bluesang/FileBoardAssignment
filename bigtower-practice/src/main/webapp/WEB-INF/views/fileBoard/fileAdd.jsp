<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action ="/fileAdd" method="post"  enctype="multipart/form-data">
		<div>
			파일이름 : <input type="text" name="fName" />
		</div>
		<div>
			파일선택 : <input type="file" name="multipartFile"/>
		</div>
		<input type="submit" value="파일 올리기" />
		<input type="reset" value="취소" />
	</form>
</body>
</html>