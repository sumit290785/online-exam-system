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
		<td colspan="2" align="center"><FONT color="red"><h:outputText value="#{manageQuestion.errorMessage}" /></FONT>	
		</td>
	</tr>
		<tr height="20">
		<td width="100"><h:outputText value="��Ŀ����" />
		<img align="top"
			src="Images/required_field.gif" border="0" alt="���ֶ��Ǳ����ֶ�"
			title="���ֶ��Ǳ����ֶ�"></td>
		<td>
		<h:selectOneListbox required="false" value="#{manageQuestion.category}" size="1"> 
		<f:selectItems value="#{manageQuestion.categoryList}"/> 
		</h:selectOneListbox> <p>		
			</td>
	</tr>
	<tr height="40">
		<td><h:outputText value="��Ŀ����" />
		<img align="top"
			src="Images/required_field.gif" border="0" alt="���ֶ��Ǳ����ֶ�"
			title="���ֶ��Ǳ����ֶ�"></td>
		<td><h:inputTextarea value="#{manageQuestion.questionContent}"  style="height:auto;width: 100%;">	
			</h:inputTextarea></td>
	</tr>
	<tr height="20">
		<td colspan=2 align="center"><h:outputText value="����Ϊѡ��֣���ȷ�����ڶ�Ӧ��ѡ����д�" /></td>
	</tr>
	<tr height="20">
		<td width="100"><h:outputText value="ѡ��1" /></td>
		<td><h:inputTextarea value="#{manageQuestion.opt1.option}"  style="height:auto;width: 100%;">
			</h:inputTextarea></td>
		<td width="100"><h:selectBooleanCheckbox value="#{manageQuestion.opt1.correct}" /></td>
	</tr>
	
	<tr height="20">
		<td width="100"><h:outputText value="ѡ��2" /></td>
		<td><h:inputTextarea value="#{manageQuestion.opt2.option}"  style="height:auto;width: 100%;" >
				</h:inputTextarea></td>
		<td width="100"><h:selectBooleanCheckbox value="#{manageQuestion.opt2.correct}" /></td>
	</tr>
	
		<tr height="20">
		<td width="100"><h:outputText value="ѡ��3" /></td>
		<td><h:inputTextarea value="#{manageQuestion.opt3.option}" style="height:auto;width: 100%;" >
				</h:inputTextarea></td>
		<td width="100"><h:selectBooleanCheckbox value="#{manageQuestion.opt3.correct}" /></td>
	</tr>
	
	<tr height="20">
		<td width="100"><h:outputText value="ѡ��4" /></td>
		<td><h:inputTextarea value="#{manageQuestion.opt4.option}" style="height:auto;width: 100%;">
			</h:inputTextarea></td>
<td width="100"><h:selectBooleanCheckbox value="#{manageQuestion.opt4.correct}" /></td>
	</tr>
	
	<tr height="20">
		<td width="100"><h:outputText value="ѡ��5" /></td>
		<td><h:inputTextarea value="#{manageQuestion.opt5.option}" style="height:auto;width: 100%;" >
				</h:inputTextarea></td>
		<td width="100"><h:selectBooleanCheckbox value="#{manageQuestion.opt5.correct}" /></td>
	</tr>
	
	<tr height="20">
		<td width="100"><h:outputText value="ѡ��6" /></td>
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
		<td>&nbsp;<h:commandButton value="����" action="#{manageQuestion.saveQuestion}"/>&nbsp;&nbsp;
		<h:commandButton  type="button" value="����" action="list"/></td>
		<h:inputHidden id="selectedID" value="#{manageQuestion.selectedID}"/>
		
	</tr>
</table>
	</h:form>
</f:view>
<%@ include file="bottom.jsp"%>