<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<script type="text/javascript">
	function selectUser(id) {
		document.getElementById("userForm:currentUserID").value = id;
	}
</script>
<!--�������������-->
<h1 align="center">���߿���ϵͳ�û��������</h1>
<table width="100%">
	<tr>
		<td align="center"><f:view>
			<h:form id="userForm">
	&nbsp;&nbsp;<h:inputText value="#{userList.searchUser}" />&nbsp;&nbsp;<h:commandButton
					value="�����û�" action="#{userList.searchUserByName}" />
				<h:dataTable value="#{userList.users}" var="user"
					styleClass="recordList" cellpadding="5" first="0" width="80%"
					summary="User List Datatable" dir="LTR">
					<td><h:column>
						<f:facet name="header">
							<h:outputText value="�û���" />
						</f:facet>
						<h:commandLink value="#{user.username}"
							action="#{userList.editUser}"
							onclick="selectUser('#{user.userId}')" />
					</h:column></td>
					<td><h:column>
						<f:facet name="header">
							<h:outputText value="��" />
						</f:facet>
						<h:commandLink value="#{user.firstName}"
							action="#{userList.editUser}"
							onclick="selectUser('#{user.userId}')" />
					</h:column></td>
					<td><h:column>
						<f:facet name="header">
							<h:outputText value="��" />
						</f:facet>
						<h:commandLink value="#{user.lastName}"
							action="#{userList.editUser}"
							onclick="selectUser('#{user.userId}')" />
					</h:column></td>
					<td><h:column>
						<f:facet name="header">
							<h:outputText value="�����ʼ�" />
						</f:facet>
						<h:commandLink value="#{currentUser.email}"
							action="#{userList.editUser}"
							onclick="selectUser('#{user.userId}')" />
					</h:column></td>
					<td><h:column>
						<f:facet name="header">
							<h:outputText value="�绰" />
						</f:facet>
						<h:commandLink value="#{user.phone}" action="#{userList.editUser}"
							onclick="selectUser('#{user.userId}')" />
					</h:column></td>
					<td><h:column>
						<f:facet name="header">
							<h:outputText value="�û�����" />
						</f:facet>
						<h:commandLink value="#{user.userType}"
							action="#{userList.editUser}"
							onclick="selectUser('#{user.userId}')" />

					</h:column></td>

					<td><h:column>
						<f:facet name="header">
							<h:outputText value="����" />
						</f:facet>
						<h:commandButton value="ɾ��" image="Images/delete.gif"
							action="#{userList.deleteUser}"
							onclick="selectUser('#{user.userId}')" />
					</h:column></td>
				</h:dataTable>
				<h:inputHidden id="currentUserID" value="#{userList.currentUserID}" />
				<br />
		&nbsp;&nbsp;<h:commandButton value="����û�" action="userEdit" />
			</h:form>
		</f:view></td>
</table>


<%@ include file="bottom.jsp"%>