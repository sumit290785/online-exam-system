<%@ include file="header.jsp"%>
<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
	
<HTML>
<HEAD>
<TITLE>在线考试系统管理界面</TITLE>
</HEAD>
<body>

<!--content for management main-->
<table width = "100%" border="0">
<tr>
<td width = "30%">
</td>
<td>
<table border="0">
<tr>
  <td><a href="user_list.faces">用户管理</a></td>
</tr>
<tr>
  <td><br/></td>
</tr>
<tr>
  <td><a href="question_list.faces">考试题库管理</a></td>
</tr>
<tr>
  <td><br/></td>
</tr>
<tr>
  <td><a href="category_list.faces"/>考试模板管理</td>
</tr>
<tr>
  <td><br/></td>
</tr>
<tr>
  <td><a href="exam_list.faces">学生考试历史查询</a></td>
</tr>
<tr>
  <td><br/></td>
</tr>
</table>
</td>
</tr>
</table>
<br/>
<%@ include file="bottom.jsp"%>
<!--这里可以作为footer.jsp内容-->

</body>
</html>
