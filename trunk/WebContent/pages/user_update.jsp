<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<!--内容请放在这里-->
<h1 align="center">在线考试系统用户添加更新界面</h1>

<f:view>

	<h:form>

		<table align="center">
			<font color="red"><h:outputText
				value="#{userList.currentUser.errorMessage}" /></font>
			<tr height="20">
				<td width="100"><b>用户名:</b><img align="top"
					src="Images/required_field.gif" border="0" alt="此字段是必填字段"
					title="此字段是必填字段"></td>
				<td><h:inputText value="#{userList.currentUser.username}" /></td>
			</tr>
			<tr height="20">
				<td width="100"><b>密码:</b><img align="top"
					src="Images/required_field.gif" border="0" alt="此字段是必填字段"
					title="此字段是必填字段"></td>
				<td><h:inputText value="#{userList.currentUser.password}" /></td>
			</tr>
			<tr height="20">
				<td width="100"><b>姓:</b></td>
				<td><h:inputText value="#{userList.currentUser.firstName}">

				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>名:</b></td>
				<td><h:inputText value="#{userList.currentUser.lastName}">

				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>电子邮件:</b></td>
				<td><h:inputText value="#{userList.currentUser.email}">

				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>电话:</b></td>
				<td><h:inputText value="#{userList.currentUser.phone}">

				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>街道:</b></td>
				<td><h:inputText value="#{userList.currentUser.street}">

				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>邮编:</b></td>
				<td><h:inputText value="#{userList.currentUser.zipcode}">

				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>城市:</b></td>
				<td><h:inputText value="#{userList.currentUser.city}">

				</h:inputText></td>
			</tr>
			<tr height="20">
				<td width="100"><b>用户类型:</b></td>
				<td><h:selectOneMenu value="#{userList.currentUser.userType}">
					<f:selectItem itemLabel="学生" itemValue="student" />
					<f:selectItem itemLabel="老师" itemValue="teacher" />
					<f:selectItem itemLabel="管理员" itemValue="admin" />
				</h:selectOneMenu></td>
			</tr>
			<tr height="20">
				<td width="100"><b>分配考试科目:</b></td>
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
				<td>&nbsp;<h:commandButton value="保存修改"
					action="#{userList.saveUser}" />&nbsp;&nbsp;<h:commandButton
					type="button" value="取消" action="userList" /></td>
			</tr>
		</table>
		<h:inputHidden id="currentUserID"
			value="#{userList.currentUser.userId}" />
	</h:form>
</f:view>


<%@ include file="bottom.jsp"%>