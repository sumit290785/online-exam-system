<%@ include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<!--�������������-->
<h1 align="center">���߿���ϵͳ���Կ�Ŀ��Ӹ��½���</h1>
<f:view>
	<h:messages showDetail="#{true}" showSummary="#{true}" />
	<h:form>
		<table align="center">

	<tr height="20">
		<td width="100"><h:outputText value="��Ŀ����" />
		<img align="top"
			src="Images/required_field.gif" border="0" alt="���ֶ��Ǳ����ֶ�"
			title="���ֶ��Ǳ����ֶ�"></td>
		<td>
		<h:selectOneListbox required="false" value="#{manageQuestion.questionContent}" size="1"> 
		<f:selectItems value="#{manageQuestion.categoryList}"/> 
		</h:selectOneListbox> <p>		
			</td>
	</tr>
	<tr height="20">
		<td width="100"><h:outputText value="��Ŀ����" />
		<img align="top"
			src="Images/required_field.gif" border="0" alt="���ֶ��Ǳ����ֶ�"
			title="���ֶ��Ǳ����ֶ�"></td>
		<td><h:inputTextarea value="#{manageQuestion.questionContent}" required="true"  >
					<f:validateLength maximum="500" minimum="2" />		
			</h:inputTextarea></td>
	</tr>
	<tr height="20">
		<td></td>
		<td>&nbsp;&nbsp;</td>
		<tr height="20">
		<td></td>
		<td>&nbsp;<h:commandButton value="����" action="#{manageQuestion.addQuestion}"/>&nbsp;&nbsp;
		<h:commandButton  type="button" value="����" onclick="/pages/question_edit.faces"/></td>
		<h:inputHidden id="selectedID" value="#{manageQuestion.selectedID}"/>
		
	</tr>
</table>
	</h:form>
</f:view>
<%@ include file="bottom.jsp"%>