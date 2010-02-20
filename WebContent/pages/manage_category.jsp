<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>管理科目</title>
</head>
<body>
<f:view>
	<h:messages showDetail="#{true}" showSummary="#{true}" />
	<h:form>
		<table width="200" border="0">
			<tr>
				<td><h:outputText value="科目名称" /></td>
				<td align="left">&nbsp; <h:inputText
					value="#{manageCategory.categoryName}">
					<f:validateLength maximum="20" minimum="2" />
				</h:inputText></td>
			</tr>
			<tr>
				<td><h:outputText value="总题数" /></td>
				<td align="left">&nbsp; <h:inputText
					value="#{manageCategory.questionCount}">
					<f:validateLength maximum="3" minimum="1" />
				</h:inputText></td>
			</tr>
						<tr>
				<td><h:outputText value="允许时间(分钟)" /></td>
				<td align="left">&nbsp; <h:inputText
					value="#{manageCategory.totalTime}">
					<f:validateLength maximum="3" minimum="1" />
				</h:inputText></td>
			</tr>
									<tr>
				<td><h:outputText value="及格分数" /></td>
				<td align="left">&nbsp; <h:inputText
					value="#{manageCategory.passScore}">
					<f:validateLength maximum="4" minimum="1" />
				</h:inputText></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><h:commandButton action="#{manageCategory.addCategory}"
					value="添加" /></td>
			</tr>
		</table>
	</h:form>
</f:view>
</body>
</html>