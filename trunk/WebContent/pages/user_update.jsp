<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<!--�������������-->
<h1 align="center">���߿���ϵͳ�û���Ӹ��½���</h1>

<f:view>

	<h:form>

		<table align="center">
			<font color="red"><h:outputText
				value="#{userList.currentUser.errorMessage}" /></font>
			<tr height="20">
				<td width="100"><b>�û���:</b><img align="top"
					src="Images/required_field.gif" border="0" alt="���ֶ��Ǳ����ֶ�"
					title="���ֶ��Ǳ����ֶ�"></td>
				<td><h:inputText value="#{userList.currentUser.username}" /></td>
			</tr>
			<tr height="20">
				<td width="100"><b>����:</b><img align="top"
					src="Images/required_field.gif" border="0" alt="���ֶ��Ǳ����ֶ�"
					title="���ֶ��Ǳ����ֶ�"></td>
				<td><h:inputText value="#{userList.currentUser.password}" /></td>
			</tr>
			<tr height="20">
				<td width="100"><b>��:</b></td>
				<td><h:inputText value="#{userList.currentUser.firstName}">

				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>��:</b></td>
				<td><h:inputText value="#{userList.currentUser.lastName}">

				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>�����ʼ�:</b></td>
				<td><h:inputText value="#{userList.currentUser.email}">

				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>�绰:</b></td>
				<td><h:inputText value="#{userList.currentUser.phone}">

				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>�ֵ�:</b></td>
				<td><h:inputText value="#{userList.currentUser.street}">

				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>�ʱ�:</b></td>
				<td><h:inputText value="#{userList.currentUser.zipcode}">

				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>����:</b></td>
				<td><h:inputText value="#{userList.currentUser.city}">

				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>�û�����:</b></td>
				<td><h:selectOneMenu value="#{userList.currentUser.userType}">
					<f:selectItem itemLabel="ѧ��" itemValue="student" />
					<f:selectItem itemLabel="��ʦ" itemValue="teacher" />
					<f:selectItem itemLabel="����Ա" itemValue="admin" />
				</h:selectOneMenu></td>
			</tr>
			<tr height="20">
				<td width="100"><b>���俼�Կ�Ŀ:</b></td>
				<td><h:selectManyCheckbox required="false"
					layout="pageDirection" value="#{userList.currentUser.category}">
					<f:selectItems value="#{userList.currentUser.totalCategory}" />
				</h:selectManyCheckbox></td>
			</tr>
			<tr height="20">
				<td></td>
				<td>&nbsp;&nbsp;</td>
			</tr>
			<tr height="20">
				<td></td>
				<td>&nbsp;<h:commandButton value="�����޸�"
					action="#{userList.saveUser}" />&nbsp;&nbsp;<h:commandButton
					type="button" value="ȡ��" action="userList" /></td>
			</tr>
		</table>
		<h:inputHidden id="currentUserID"
			value="#{userList.currentUser.userId}" />
	</h:form>
</f:view>


<%@ include file="bottom.jsp"%>