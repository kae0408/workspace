<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=utf-8">
<title>ログイン画面</title>
</head>
<body>
	<s:form action="LoginAction">
	<!-- で囲まれたタグに入力された内容が「action=""」で
	指定したActionクラスへ渡されます -->
	<s:textfield name ="name"/>
	<!-- name属性の情報とActionクラスのフィールドメゾット名が紐ずいて情報を渡します-->
	<s:password name ="s:password"/>
	<s:submit value ="ログイン"/>
	<!-- <input>タグ「type="text"」「type="password"」「type="submit"」
	としてブラウザで認識します。-->
	</s:form>
	

</body>
</html>