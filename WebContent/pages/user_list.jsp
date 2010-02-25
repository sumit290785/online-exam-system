<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<!--内容请放在这里-->
<h1 align="center">在线考试系统用户管理界面</h1>
<table class="recordList" width="80%" align="center">
	<tr>
		<th>用户名</th>
		<th>姓</th>
		<th>名</th>
	</tr>
	<tr>
		<td>admin1</td>
		<td>朱</td>
		<td>振华</td>
	</tr>
	<tr>
		<td>admin1</td>
		<td>蔡</td>
		<td>俊</td>
	</tr>
	<tr>
		<td>admin1</td>
		<td>陈</td>
		<td>萍芳</td>
	</tr>
</table>

<f:view>
	<h:form id="userForm">
		<h:dataTable value="#{userListForm.users}" var="user"
			styleClass="recordList" cellpadding="5" first="0" width="80%"
			summary="User List Datatable" dir="LTR">
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="用户名" />
				</f:facet>
				<h:commandLink value="#{user.username}" action="#{user.editUser}"
					onclick="selectID('#{user.userId}')">
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="姓" />
				</f:facet>
				<h:commandLink value="#{user.firstName}" action="#{user.editUser}"
					onclick="selectID('#{user.userId}')">
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="名" />
				</f:facet>
				<h:commandLink value="#{user.lastName}" action="#{user.editUser}"
					onclick="selectID('#{user.userId}')">
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="电子邮件" />
				</f:facet>
				<h:commandLink value="#{user.email}" action="#{user.editUser}"
					onclick="selectID('#{user.userId}')">
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="电话" />
				</f:facet>
				<h:commandLink value="#{user.phone}" action="#{user.editUser}"
					onclick="selectID('#{user.userId}')">
				</h:commandLink>
			</h:column></td>
			<td><h:column>
				<f:facet name="header">
					<h:outputText value="操作" />
				</f:facet>
				<h:commandButton value="删除" image="Images/delete.gif"
					action="#{user.deleteUser}" onclick="selectID('#{user.userId}')" />
			</h:column>
			</td>
		</h:dataTable>
		<tr>
			<td align="center"><h:commandButton value="添加"
				action="#{user.initUser}" /></td>
		</tr>>
</h:form>
</f:view>



<%@ include file="bottom.jsp"%>