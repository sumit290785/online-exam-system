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
          <td colspan="2" align="center"><FONT color="red"><h:outputText value="#{manageCategory.errorMessage}" /></FONT></td>
          </tr>
	<tr height="20">
		<td width="100"><h:outputText value="��Ŀ����" />
		<img align="top"
			src="Images/required_field.gif" border="0" alt="���ֶ��Ǳ����ֶ�"
			title="���ֶ��Ǳ����ֶ�"></td>
		<td><h:inputText value="#{manageCategory.categoryName}" required="true">
					<f:validateLength maximum="20" minimum="2" />		
			</h:inputText></td>
	</tr>
	<tr height="20">
		<td width="100"><h:outputText value="��Ŀ����:"/>
		<img align="top"
			src="Images/required_field.gif" border="0" alt="���ֶ��Ǳ����ֶ�"
			title="���ֶ��Ǳ����ֶ�"></td>
		<td>
		<h:inputText value="#{manageCategory.questionCount}" required="true">
					</h:inputText></td>
	</tr>
	
 	<tr height="20">
		<td width="100"><h:outputText value="����ͨ������:"/>
		<img align="top"
			src="Images/required_field.gif" border="0" alt="���ֶ��Ǳ����ֶ�"
			title="���ֶ��Ǳ����ֶ�"></td>
		<td>
		<h:inputText value="#{manageCategory.passedQuestion}" required="true">
					</h:inputText></td>
	</tr>
	 
	<tr height="20">
		<td width="100"><h:outputText value="�ܷ�" />		
		<img align="top"
			src="Images/required_field.gif" border="0" alt="���ֶ��Ǳ����ֶ�"
			title="���ֶ��Ǳ����ֶ�"></td>
		<td><h:inputText
					value="#{manageCategory.totalScore}" required="true">
					<f:validateLength maximum="3" minimum="1" />
				</h:inputText></td>
	</tr>
	<tr height="20">
		<td width="100"><h:outputText value="����ʱ��(����)" />
		<img align="top"
			src="Images/required_field.gif" border="0" alt="���ֶ��Ǳ����ֶ�"
			title="���ֶ��Ǳ����ֶ�"></td>
		<td><h:inputText value="#{manageCategory.totalTime}" required="true">
					<f:validateLength maximum="3" minimum="1" />
				</h:inputText></td>
	</tr>
	
	<tr height="20">
		<td></td>
		<td>&nbsp;&nbsp;</td>
		<tr height="20">
		<td></td>
		<td>&nbsp;<h:commandButton value="����" action="#{manageCategory.addCategory}"/>&nbsp;&nbsp;
		<h:commandButton  type="button" value="����" /></td>
		<h:inputHidden id="selectedID" value="#{manageCategory.selectedID}"/>
		
	</tr>
</table>
	</h:form>
</f:view>
<%@ include file="bottom.jsp"%>