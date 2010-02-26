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
		<td colspan="2" align="center"><FONT color="red"><h:outputText value="#{manageQuestion.errorMessage}" /></FONT>	
		</td>
	</tr>
		<tr height="20">
		<td width="100"><h:outputText value="科目名称" />
		<img align="top"
			src="Images/required_field.gif" border="0" alt="此字段是必填字段"
			title="此字段是必填字段"></td>
		<td>
		<h:selectOneListbox required="false" value="#{manageQuestion.category}" size="1"> 
		<f:selectItems value="#{manageQuestion.categoryList}"/> 
		</h:selectOneListbox> <p>		
			</td>
	</tr>
	<tr height="40">
		<td><h:outputText value="题目内容" />
		<img align="top"
			src="Images/required_field.gif" border="0" alt="此字段是必填字段"
			title="此字段是必填字段"></td>
		<td><h:inputTextarea value="#{manageQuestion.questionContent}"  style="height:auto;width: 100%;">	
			</h:inputTextarea></td>
	</tr>
	<tr height="20">
		<td colspan=2 align="center"><h:outputText value="以下为选项部分，正确答案清在对应的选择框中打勾" /></td>
	</tr>
	<tr height="20">
		<td width="100"><h:outputText value="选项1" /></td>
		<td><h:inputTextarea value="#{manageQuestion.opt1.option}"  style="height:auto;width: 100%;">
			</h:inputTextarea></td>
		<td width="100"><h:selectBooleanCheckbox value="#{manageQuestion.opt1.correct}" /></td>
	</tr>
	
	<tr height="20">
		<td width="100"><h:outputText value="选项2" /></td>
		<td><h:inputTextarea value="#{manageQuestion.opt2.option}"  style="height:auto;width: 100%;" >
				</h:inputTextarea></td>
		<td width="100"><h:selectBooleanCheckbox value="#{manageQuestion.opt2.correct}" /></td>
	</tr>
	
		<tr height="20">
		<td width="100"><h:outputText value="选项3" /></td>
		<td><h:inputTextarea value="#{manageQuestion.opt3.option}" style="height:auto;width: 100%;" >
				</h:inputTextarea></td>
		<td width="100"><h:selectBooleanCheckbox value="#{manageQuestion.opt3.correct}" /></td>
	</tr>
	
	<tr height="20">
		<td width="100"><h:outputText value="选项4" /></td>
		<td><h:inputTextarea value="#{manageQuestion.opt4.option}" style="height:auto;width: 100%;">
			</h:inputTextarea></td>
<td width="100"><h:selectBooleanCheckbox value="#{manageQuestion.opt4.correct}" /></td>
	</tr>
	
	<tr height="20">
		<td width="100"><h:outputText value="选项5" /></td>
		<td><h:inputTextarea value="#{manageQuestion.opt5.option}" style="height:auto;width: 100%;" >
				</h:inputTextarea></td>
		<td width="100"><h:selectBooleanCheckbox value="#{manageQuestion.opt5.correct}" /></td>
	</tr>
	
	<tr height="20">
		<td width="100"><h:outputText value="选项6" /></td>
		<td><h:inputTextarea value="#{manageQuestion.opt6.option}" style="height:auto;width: 100%;" >
			</h:inputTextarea></td>
		<td width="100"><h:selectBooleanCheckbox value="#{manageQuestion.opt6.correct}" /></td>
	</tr>
			<h:inputHidden value ="#{manageQuestion.opt1.id}"/>
			<h:inputHidden value ="#{manageQuestion.opt2.id}"/>
			<h:inputHidden value ="#{manageQuestion.opt3.id}"/>
			<h:inputHidden value ="#{manageQuestion.opt4.id}"/>
			<h:inputHidden value ="#{manageQuestion.opt5.id}"/>
			<h:inputHidden value ="#{manageQuestion.opt6.id}"/>
	
	<tr height="20">
		<td></td>
		<td>&nbsp;&nbsp;</td>
		<tr height="20">
		<td></td>
		<td>&nbsp;<h:commandButton value="保存" action="#{manageQuestion.saveQuestion}"/>&nbsp;&nbsp;
		<h:commandButton  type="button" value="返回" action="list"/></td>
		<h:inputHidden id="selectedID" value="#{manageQuestion.selectedID}"/>
		
	</tr>
</table>
	</h:form>
</f:view>
<%@ include file="bottom.jsp"%>