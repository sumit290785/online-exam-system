<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<!--�������������-->
<h1 align="center">���߿���ϵͳ�û���Ӹ��½���</h1>

<f:view>
			
	<h:form>
	<h:outputText value="#{userBean.userId}"/>
	<font color = "red"><h:outputText value="#{userBean.errorMessage}"/></font>
		<table align="center">

			<tr height="20">
				<td width="100"><b>�û���:</b><img align="top"
					src="Images/required_field.gif" border="0" alt="���ֶ��Ǳ����ֶ�"
					title="���ֶ��Ǳ����ֶ�"></td>
				<td><h:inputText value="#{userBean.username}"/>
				</td>
			</tr>
			<tr height="20">
				<td width="100"><b>����:</b><img align="top"
					src="Images/required_field.gif" border="0" alt="���ֶ��Ǳ����ֶ�"
					title="���ֶ��Ǳ����ֶ�"></td>
				<td><h:inputText value="#{userBean.password}"/>
					
				</td>
			</tr>
			<tr height="20">
				<td width="100"><b>��:</b></td>
				<td><h:inputText value="#{userBean.firstName}">
					
				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>��:</b></td>
				<td><h:inputText value="#{userBean.lastName}">
					
				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>�����ʼ�:</b></td>
				<td><h:inputText value="#{userBean.email}">
					
				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>�绰:</b></td>
				<td><h:inputText value="#{userBean.phone}">
					
				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>�ֵ�:</b></td>
				<td><h:inputText value="#{userBean.street}">
					
				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>�ʱ�:</b></td>
				<td><h:inputText value="#{userBean.zipcode}">
					
				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>����:</b></td>
				<td><h:inputText value="#{userBean.city}">
					
				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>�û�����:</b></td>
				<td><h:selectOneMenu value="#{userBean.userType}">
					<f:selectItem itemLabel="ѧ��" itemValue="student" />
					<f:selectItem itemLabel="��ʦ" itemValue="teacher" />
					<f:selectItem itemLabel="����Ա" itemValue="admin" />
				</h:selectOneMenu></td>
			</tr>
			<tr height="20">
				<td></td>
				<td>&nbsp;&nbsp;</td>
				</tr>
				<tr height="20">
					<td></td>
					<td>&nbsp;<h:commandButton value="�����޸�"
						action="#{userBean.saveUser}" />&nbsp;&nbsp;<h:commandButton type = "button" value="ȡ��"
						action="userList" /></td>
				</tr>
		</table>

	</h:form>
</f:view>


<%@ include file="bottom.jsp"%>