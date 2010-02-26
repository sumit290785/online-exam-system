<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<!--内容请放在这里-->
<h1 align="center">在线考试系统用户管理界面</h1>

<f:view>
	<h:form id="userForm">
	&nbsp;&nbsp;<h:inputText value="#{userList.searchUser}" />&nbsp;&nbsp;<h:commandButton
			value="查找用户" action="#{userList.searchUserByName}" />
		<h:dataTable value="#{userList.users}" var="userBean"
			styleClass="recordList" cellpadding="5" first="0" width="80%"
			summary="User List Datatable" dir="LTR">
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="用户名" />
				</f:facet>
				<h:commandLink value="#{userBean.username}"
					action="#{userBean.editUser}">
					<f:param name="userId" value="#{userBean.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="姓" />
				</f:facet>
				<h:commandLink value="#{userBean.firstName}"
					action="#{userBean.editUser}">
					<f:param name="userId" value="#{userBean.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="名" />
				</f:facet>
				<h:commandLink value="#{userBean.lastName}"
					action="#{userBean.editUser}">
					<f:param name="userId" value="#{userBean.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="电子邮件" />
				</f:facet>
				<h:commandLink value="#{userBean.email}"
					action="#{userBean.editUser}">
					<f:param name="userId" value="#{userBean.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="电话" />
				</f:facet>
				<h:commandLink value="#{userBean.phone}"
					action="#{userBean.editUser}">
					<f:param name="userId" value="#{userBean.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="用户类型" />
				</f:facet>
				<h:commandLink value="#{userBean.userType}"
					action="#{userBean.editUser}">
					<f:param name="userId" value="#{userBean.userId}" />
				</h:commandLink>
			</h:column></td>

			<td><h:column>
				<f:facet name="header">
					<h:outputText value="操作" />
				</f:facet>
				<h:commandButton value="删除" image="Images/delete.gif"
					action="#{userBean.deleteUser}">
					<f:param name="userId" value="#{userBean.userId}" />
				</h:commandButton>
			</h:column></td>
		</h:dataTable>
		<br />
		&nbsp;&nbsp;<h:commandButton value="添加用户" action="userEdit" />
	</h:form>
</f:view>



<%@ include file="bottom.jsp"%>