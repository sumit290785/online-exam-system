<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<!--内容请放在这里-->
<h1 align="center">在线考试系统用户添加更新界面</h1>
<table align="center">

	<tr height="20">
		<td width="100"><b>用户名:</b><img align="top"
			src="Images/required_field.gif" border="0" alt="此字段是必填字段"
			title="此字段是必填字段"></td>
		<td><input type="text" id="username" name="username" size="20"
			maxlength="20" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>密码:</b><img align="top"
			src="Images/required_field.gif" border="0" alt="此字段是必填字段"
			title="此字段是必填字段"></td>
		<td><input type="password" id="password" name="password" size="20"
			maxlength="20" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>姓:</b></td>
		<td><input type="text" id="firstName" name="firstName" size="30"
			maxlength="50" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>名:</b></td>
		<td><input type="text" id="lastName" name="lastName" size="30"
			maxlength="50" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>电子邮件:</b></td>
		<td><input type="text" id="email" name="email" size="30"
			maxlength="50" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>电话:</b></td>
		<td><input type="text" id="phone" name="phone" size="20"
			maxlength="20" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>街道:</b></td>
		<td><input type="text" id="street" name="street" size="30"
			maxlength="255" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>邮编:</b></td>
		<td><input type="text" id="zipcode" name="zipcode" size="16"
			maxlength="16" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>城市:</b></td>
		<td><input type="text" id="city" name="city" size="30"
			maxlength="100" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>用户类型:</b></td>
		<td><select  name="userType"><option value="student">学生</option><option value="teacher">老师</option><option value="admin">管理员</option></select></td>
	</tr>
	<tr height="20">
		<td></td>
		<td>&nbsp;&nbsp;</td>
		<tr height="20">
		<td></td>
		<td>&nbsp;<input type="submit" name="save" value="保存修改">&nbsp;&nbsp;<input type="submit"  name="cancel" value="取消"></td>
	</tr>
</table>


<%@ include file="bottom.jsp"%>