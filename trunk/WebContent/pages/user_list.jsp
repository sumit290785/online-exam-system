<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<!--�������������-->
<h1 align="center">���߿���ϵͳ�û��������</h1>
<table class="recordList" width="80%" align="center">
	<tr>
		<th>�û���</th>
		<th>��</th>
		<th>��</th>
	</tr>
	<tr>
		<td>admin1</td>
		<td>��</td>
		<td>��</td>
	</tr>
	<tr>
		<td>admin1</td>
		<td>��</td>
		<td>��</td>
	</tr>
	<tr>
		<td>admin1</td>
		<td>��</td>
		<td>Ƽ��</td>
	</tr>
</table>

<f:view>
	<h:form id="userForm">
		<h:dataTable value="#{userListForm.users}" var="user"
			styleClass="recordList" cellpadding="5" first="0" width="80%"
			summary="User List Datatable" dir="LTR">
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="�û���" />
				</f:facet>
				<h:commandLink value="#{user.username}" action="#{user.editUser}"
					onclick="selectID('#{user.userId}')">
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="��" />
				</f:facet>
				<h:commandLink value="#{user.firstName}" action="#{user.editUser}"
					onclick="selectID('#{user.userId}')">
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="��" />
				</f:facet>
				<h:commandLink value="#{user.lastName}" action="#{user.editUser}"
					onclick="selectID('#{user.userId}')">
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="�����ʼ�" />
				</f:facet>
				<h:commandLink value="#{user.email}" action="#{user.editUser}"
					onclick="selectID('#{user.userId}')">
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="�绰" />
				</f:facet>
				<h:commandLink value="#{user.phone}" action="#{user.editUser}"
					onclick="selectID('#{user.userId}')">
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="����" />
				</f:facet>
				<h:commandButton value="ɾ��" image="Images/delete.gif"
					action="#{user.deleteUser}" onclick="selectID('#{user.userId}')" />
			</h:column>
			</td>
		</h:dataTable>
		<tr>
			<td align="center"><h:commandButton value="���"
				action="#{user.initUser}" /></td>
		</tr>>
</h:form>
</f:view>



<%@ include file="bottom.jsp"%>