<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<!--�������������-->
<h1 align="center">���߿���ϵͳ�û���Ӹ��½���</h1>
<table align="center">

	<tr height="20">
		<td width="100"><b>�û���:</b><img align="top"
			src="Images/required_field.gif" border="0" alt="���ֶ��Ǳ����ֶ�"
			title="���ֶ��Ǳ����ֶ�"></td>
		<td><input type="text" id="username" name="username" size="20"
			maxlength="20" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>����:</b><img align="top"
			src="Images/required_field.gif" border="0" alt="���ֶ��Ǳ����ֶ�"
			title="���ֶ��Ǳ����ֶ�"></td>
		<td><input type="password" id="password" name="password" size="20"
			maxlength="20" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>��:</b></td>
		<td><input type="text" id="firstName" name="firstName" size="30"
			maxlength="50" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>��:</b></td>
		<td><input type="text" id="lastName" name="lastName" size="30"
			maxlength="50" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>�����ʼ�:</b></td>
		<td><input type="text" id="email" name="email" size="30"
			maxlength="50" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>�绰:</b></td>
		<td><input type="text" id="phone" name="phone" size="20"
			maxlength="20" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>�ֵ�:</b></td>
		<td><input type="text" id="street" name="street" size="30"
			maxlength="255" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>�ʱ�:</b></td>
		<td><input type="text" id="zipcode" name="zipcode" size="16"
			maxlength="16" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>����:</b></td>
		<td><input type="text" id="city" name="city" size="30"
			maxlength="100" /></td>
	</tr>
	<tr height="20">
		<td width="100"><b>�û�����:</b></td>
		<td><select  name="userType"><option value="student">ѧ��</option><option value="teacher">��ʦ</option><option value="admin">����Ա</option></select></td>
	</tr>
	<tr height="20">
		<td></td>
		<td>&nbsp;&nbsp;</td>
		<tr height="20">
		<td></td>
		<td>&nbsp;<input type="submit" name="save" value="�����޸�">&nbsp;&nbsp;<input type="submit"  name="cancel" value="ȡ��"></td>
	</tr>
</table>


<%@ include file="bottom.jsp"%>