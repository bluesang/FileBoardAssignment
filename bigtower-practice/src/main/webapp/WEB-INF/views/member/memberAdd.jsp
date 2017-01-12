<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/memberAdd" method="post">
		<div>
			ID : <input type="text" name="mId" />
		</div>
		<div>
			PW : <input type="password" name="mPw" />
		</div>
		<div>
			이름 : <input type="text" name="mName" />
		</div>
		<div>
			등급 : 
			<select name="mLevel">
				<option>관리자</option>
				<option>사용자</option>
			</select>
		</div>
			<input type="submit" name="가입하기" />
			<input type="reset" name="초기화" />
	</form>
</body>
</html>