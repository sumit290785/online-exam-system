<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<script type="text/javascript">
	function selectUser(id) {
		document.getElementById("userForm:currentUserID").value = id;
	}
</script>
<!--内容请放在这里-->
<h1 align="center">在线考试系统用户管理界面</h1>
<table width="100%">
	<tr>
		<td align="center"><f:view>
			<h:form id="userForm">
	&nbsp;&nbsp;<h:inputText value="#{userList.searchUser}" />&nbsp;&nbsp;<h:commandButton
					value="查找用户" action="#{userList.searchUserByName}" />
				<h:dataTable value="#{userList.users}" var="user"
					styleClass="recordList" cellpadding="5" first="0" width="80%"
					summary="User List Datatable" dir="LTR">
					<td><h:column>
						<f:facet name="header">
							<h:outputText value="用户名" />
						</f:facet>
						<h:commandLink value="#{user.username}"
							action="#{userList.editUser}"
							onclick="selectUser('#{user.userId}')" />
					</h:column></td>
					<td><h:column>
						<f:facet name="header">
							<h:outputText value="姓" />
						</f:facet>
						<h:commandLink value="#{user.firstName}"
							action="#{userList.editUser}"
							onclick="selectUser('#{user.userId}')" />
					</h:column></td>
					<td><h:column>
						<f:facet name="header">
							<h:outputText value="名" />
						</f:facet>
						<h:commandLink value="#{user.lastName}"
							action="#{userList.editUser}"
							onclick="selectUser('#{user.userId}')" />
					</h:column></td>
					<td><h:column>
						<f:facet name="header">
							<h:outputText value="电子邮件" />
						</f:facet>
						<h:commandLink value="#{currentUser.email}"
							action="#{userList.editUser}"
							onclick="selectUser('#{user.userId}')" />
					</h:column></td>
					<td><h:column>
						<f:facet name="header">
							<h:outputText value="电话" />
						</f:facet>
						<h:commandLink value="#{user.phone}" action="#{userList.editUser}"
							onclick="selectUser('#{user.userId}')" />
					</h:column></td>
					<td><h:column>
						<f:facet name="header">
							<h:outputText value="用户类型" />
						</f:facet>
						<h:commandLink value="#{user.userType}"
							action="#{userList.editUser}"
							onclick="selectUser('#{user.userId}')" />

					</h:column></td>

					<td><h:column>
						<f:facet name="header">
							<h:outputText value="操作" />
						</f:facet>
						<h:commandButton value="删除" image="Images/delete.gif"
							action="#{userList.deleteUser}"
							onclick="selectUser('#{user.userId}')" />
					</h:column></td>
				</h:dataTable>
				<h:inputHidden id="currentUserID" value="#{userList.currentUserID}" />
				<br />
		&nbsp;&nbsp;<h:commandButton value="添加用户" action="userEdit" />
			</h:form>
		</f:view></td>
</table>


<%@ include file="bottom.jsp"%>