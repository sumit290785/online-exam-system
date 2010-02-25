<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<!--�������������-->
<h1 align="center">���߿���ϵͳ�û��������</h1>

<f:view>
	<h:form id="userForm">
		<h:dataTable value="#{userList.users}" var="user"
			styleClass="recordList" cellpadding="5" first="0" width="80%"
			summary="User List Datatable" dir="LTR">
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="�û���" />
				</f:facet>
				<h:commandLink value="#{user.username}" action="#{user.editUser}">
					<f:param name="userId" value="#{user.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="��" />
				</f:facet>
				<h:commandLink value="#{user.firstName}" action="#{user.editUser}">
					<f:param name="userId" value="#{user.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="��" />
				</f:facet>
				<h:commandLink value="#{user.lastName}" action="#{user.editUser}">
					<f:param name="userId" value="#{user.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="�����ʼ�" />
				</f:facet>
				<h:commandLink value="#{user.email}" action="#{user.editUser}">
					<f:param name="userId" value="#{user.userId}" />
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="�绰" />
				</f:facet>
				<h:commandLink value="#{user.phone}" action="#{user.editUser}">
					<f:param name="userId" value="#{user.userId}" />
				</h:commandLink>
			</h:column></td>

			<td><h:column>
				<f:facet name="header">
					<h:outputText value="����" />
				</f:facet>
				<h:commandButton value="ɾ��" image="Images/delete.gif"
					action="#{user.deleteUser}">
					<f:param name="userId" value="#{user.userId}" />
				</h:commandButton>
			</h:column></td>
		</h:dataTable>
		<br />
		&nbsp;&nbsp;<h:commandButton value="����û�" action="#{user.initUser}" />
	</h:form>
</f:view>



<%@ include file="bottom.jsp"%>