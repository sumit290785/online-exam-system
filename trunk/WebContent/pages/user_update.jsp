<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<!--内容请放在这里-->
<h1 align="center">在线考试系统用户添加更新界面</h1>

<f:view>
			
	<h:form>
	<h:outputText value="#{userBean.userId}"/>
	<font color = "red"><h:outputText value="#{userBean.errorMessage}"/></font>
		<table align="center">

			<tr height="20">
				<td width="100"><b>用户名:</b><img align="top"
					src="Images/required_field.gif" border="0" alt="此字段是必填字段"
					title="此字段是必填字段"></td>
				<td><h:inputText value="#{userBean.username}"/>
				</td>
			</tr>
			<tr height="20">
				<td width="100"><b>密码:</b><img align="top"
					src="Images/required_field.gif" border="0" alt="此字段是必填字段"
					title="此字段是必填字段"></td>
				<td><h:inputText value="#{userBean.password}"/>
					
				</td>
			</tr>
			<tr height="20">
				<td width="100"><b>姓:</b></td>
				<td><h:inputText value="#{userBean.firstName}">
					
				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>名:</b></td>
				<td><h:inputText value="#{userBean.lastName}">
					
				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>电子邮件:</b></td>
				<td><h:inputText value="#{userBean.email}">
					
				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>电话:</b></td>
				<td><h:inputText value="#{userBean.phone}">
					
				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>街道:</b></td>
				<td><h:inputText value="#{userBean.street}">
					
				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>邮编:</b></td>
				<td><h:inputText value="#{userBean.zipcode}">
					
				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>城市:</b></td>
				<td><h:inputText value="#{userBean.city}">
					
				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>用户类型:</b></td>
				<td><h:selectOneMenu value="#{userBean.userType}">
					<f:selectItem itemLabel="学生" itemValue="student" />
					<f:selectItem itemLabel="老师" itemValue="teacher" />
					<f:selectItem itemLabel="管理员" itemValue="admin" />
				</h:selectOneMenu></td>
			</tr>
			<tr height="20">
				<td></td>
				<td>&nbsp;&nbsp;</td>
				</tr>
				<tr height="20">
					<td></td>
					<td>&nbsp;<h:commandButton value="保存修改"
						action="#{userBean.saveUser}" />&nbsp;&nbsp;<h:commandButton type = "button" value="取消"
						action="userList" /></td>
				</tr>
		</table>

	</h:form>
</f:view>


<%@ include file="bottom.jsp"%>