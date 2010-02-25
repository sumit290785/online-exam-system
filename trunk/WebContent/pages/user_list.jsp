<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<!--内容请放在这里-->
<h1 align="center">在线考试系统用户管理界面</h1>

<f:view>
	<h:form id="userForm">
		<h:dataTable value="#{userList.users}" var="user"
			styleClass="recordList" cellpadding="5" first="0" width="80%"
			summary="User List Datatable" dir="LTR">
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="用户名" />
				</f:facet>
				<h:commandLink value="#{user.username}" action="#{user.editUser}">
					<f:param name="userId" value="#{user.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="姓" />
				</f:facet>
				<h:commandLink value="#{user.firstName}" action="#{user.editUser}">
					<f:param name="userId" value="#{user.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="名" />
				</f:facet>
				<h:commandLink value="#{user.lastName}" action="#{user.editUser}">
					<f:param name="userId" value="#{user.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="电子邮件" />
				</f:facet>
				<h:commandLink value="#{user.email}" action="#{user.editUser}">
					<f:param name="userId" value="#{user.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="电话" />
				</f:facet>
				<h:commandLink value="#{user.phone}" action="#{user.editUser}">
					<f:param name="userId" value="#{user.userId}" />
				</h:commandLink>
			</h:column></td>

			<td><h:column>
				<f:facet name="header">
					<h:outputText value="操作" />
				</f:facet>
				<h:commandButton value="删除" image="Images/delete.gif"
					action="#{user.deleteUser}">
					<f:param name="userId" value="#{user.userId}" />
				</h:commandButton>
			</h:column></td>
		</h:dataTable>
		<br />
		&nbsp;&nbsp;<h:commandButton value="添加用户" action="#{user.initUser}" />
	</h:form>
</f:view>



<%@ include file="bottom.jsp"%>