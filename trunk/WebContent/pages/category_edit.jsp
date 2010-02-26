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
          <td colspan="2" align="center"><FONT color="red"><h:outputText value="#{manageCategory.errorMessage}" /></FONT></td>
          </tr>
	<tr height="20">
		<td width="100"><h:outputText value="科目名称" />
		<img align="top"
			src="Images/required_field.gif" border="0" alt="此字段是必填字段"
			title="此字段是必填字段"></td>
		<td><h:inputText value="#{manageCategory.categoryName}" >		
			</h:inputText></td>
	</tr>
	<tr height="20">
		<td width="100"><h:outputText value="题目数量:"/>
		<img align="top"
			src="Images/required_field.gif" border="0" alt="此字段是必填字段"
			title="此字段是必填字段"></td>
		<td>
		<h:inputText value="#{manageCategory.questionCount}" >
					</h:inputText></td>
	</tr>
	
 	<tr height="20">
		<td width="100"><h:outputText value="考核通过题数:"/>
		<img align="top"
			src="Images/required_field.gif" border="0" alt="此字段是必填字段"
			title="此字段是必填字段"></td>
		<td>
		<h:inputText value="#{manageCategory.passedQuestion}" >
					</h:inputText></td>
	</tr>
	 
	<tr height="20">
		<td width="100"><h:outputText value="总分" />		
		<img align="top"
			src="Images/required_field.gif" border="0" alt="此字段是必填字段"
			title="此字段是必填字段"></td>
		<td><h:inputText
					value="#{manageCategory.totalScore}" >
				</h:inputText></td>
	</tr>
	<tr height="20">
		<td width="100"><h:outputText value="允许时间(分钟)" />
		<img align="top"
			src="Images/required_field.gif" border="0" alt="此字段是必填字段"
			title="此字段是必填字段"></td>
		<td><h:inputText value="#{manageCategory.totalTime}" >
				</h:inputText></td>
	</tr>
	
	<tr height="20">
		<td></td>
		<td>&nbsp;&nbsp;</td>
		<tr height="20">
		<td></td>
		<td>&nbsp;<h:commandButton value="保存" action="#{manageCategory.addCategory}"/>&nbsp;&nbsp;
		<h:commandButton  type="button" value="返回" action="list"/></td>
		<h:inputHidden id="selectedID" value="#{manageCategory.selectedID}"/>
		
	</tr>
</table>
	</h:form>
</f:view>
<%@ include file="bottom.jsp"%>