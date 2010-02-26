<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<!--�������������-->
<h1 align="center">���߿���ϵͳ�û��������</h1>

<f:view>
	<h:form id="userForm">
	&nbsp;&nbsp;<h:inputText value="#{userList.searchUser}" />&nbsp;&nbsp;<h:commandButton
			value="�����û�" action="#{userList.searchUserByName}" />
		<h:dataTable value="#{userList.users}" var="userBean"
			styleClass="recordList" cellpadding="5" first="0" width="80%"
			summary="User List Datatable" dir="LTR">
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="�û���" />
				</f:facet>
				<h:commandLink value="#{userBean.username}"
					action="#{userBean.editUser}">
					<f:param name="userId" value="#{userBean.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="��" />
				</f:facet>
				<h:commandLink value="#{userBean.firstName}"
					action="#{userBean.editUser}">
					<f:param name="userId" value="#{userBean.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="��" />
				</f:facet>
				<h:commandLink value="#{userBean.lastName}"
					action="#{userBean.editUser}">
					<f:param name="userId" value="#{userBean.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="�����ʼ�" />
				</f:facet>
				<h:commandLink value="#{userBean.email}"
					action="#{userBean.editUser}">
					<f:param name="userId" value="#{userBean.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="�绰" />
				</f:facet>
				<h:commandLink value="#{userBean.phone}"
					action="#{userBean.editUser}">
					<f:param name="userId" value="#{userBean.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="�û�����" />
				</f:facet>
				<h:commandLink value="#{userBean.userType}"
					action="#{userBean.editUser}">
					<f:param name="userId" value="#{userBean.userId}" />
				</h:commandLink>
			</h:column></td>

			<td><h:column>
				<f:facet name="header">
					<h:outputText value="����" />
				</f:facet>
				<h:commandButton value="ɾ��" image="Images/delete.gif"
					action="#{userBean.deleteUser}">
					<f:param name="userId" value="#{userBean.userId}" />
				</h:commandButton>
			</h:column></td>
		</h:dataTable>
		<br />
		&nbsp;&nbsp;<h:commandButton value="����û�" action="userEdit" />
	</h:form>
</f:view>



<%@ include file="bottom.jsp"%>