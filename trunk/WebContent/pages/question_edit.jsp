<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<!--内容请放在这里-->
<h1 align="center">在线考试系统考试科目添加更新界面</h1>
<f:view>
	<h:messages showDetail="#{true}" showSummary="#{true}" />
	<h:form>
		<table align="center">

	<tr height="20">
		<td width="100"><h:outputText value="科目名称" />
		<img align="top"
			src="Images/required_field.gif" border="0" alt="此字段是必填字段"
			title="此字段是必填字段"></td>
		<td>
		<h:selectOneListbox required="false" value="#{manageQuestion.questionContent}" size="1"> 
		<f:selectItems value="#{manageQuestion.categoryList}"/> 
		</h:selectOneListbox> <p>		
			</td>
	</tr>
	<tr height="20">
		<td width="100"><h:outputText value="题目内容" />
		<img align="top"
			src="Images/required_field.gif" border="0" alt="此字段是必填字段"
			title="此字段是必填字段"></td>
		<td><h:inputTextarea value="#{manageQuestion.questionContent}" required="true"  >
					<f:validateLength maximum="500" minimum="2" />		
			</h:inputTextarea></td>
	</tr>
	<tr height="20">
		<td></td>
		<td>&nbsp;&nbsp;</td>
		<tr height="20">
		<td></td>
		<td>&nbsp;<h:commandButton value="保存" action="#{manageQuestion.addQuestion}"/>&nbsp;&nbsp;
		<h:commandButton  type="button" value="返回" onclick="/pages/question_edit.faces"/></td>
		<h:inputHidden id="selectedID" value="#{manageQuestion.selectedID}"/>
		
	</tr>
</table>
	</h:form>
</f:view>
<%@ include file="bottom.jsp"%>