<%@ include file="header.jsp"%>
<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<HTML>
<HEAD>
<link href="style/manage.css" rel="stylesheet" type="text/css" />
<TITLE>���߿���ϵͳ���Լ�¼�������</TITLE>
</HEAD>
<script type="text/javascript">
function selectID(id){
document.getElementById("questionForm:selectedID").value=id;
}
</script>
<body>
<h1 align = "center">���߿���ϵͳ���Լ�¼�������</h1>
<table width = "100%">
<tr>
<td align="center">
<!--�������������-->
<f:view>
<h:form id="examForm">
<h:dataTable value="#{manageExam.examList}" var="examForm"    styleClass="recordList" cellpadding="5"  first="0"  width="80%"  rows="200" summary="This is a JSF code to create dataTable." dir="LTR">
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="������Ŀ" />
 </f:facet>
<h:commandLink value="#{examForm.category}"  onclick="selectID('#{examForm.id}')">
</h:commandLink>
</h:column></td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="������½��" />
 </f:facet>
<h:commandLink value="#{examForm.user}"  onclick="selectID('#{examForm.id}')"/>
</h:column>
</td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="��������" />
 </f:facet>
<h:commandLink value="#{examForm.userName}"  onclick="selectID('#{examForm.id}')"/>
</h:column>
</td>
<h:column>
<f:facet name="header">
        <h:outputText value="���Գɼ�" />
 </f:facet>
<h:commandLink value="#{examForm.totalScore}"  onclick="selectID('#{examForm.id}')"/>
</h:column>
</td>
<h:column>
<f:facet name="header">
        <h:outputText value="���˽��" />
 </f:facet>
<h:commandLink value="#{examForm.passed}"  onclick="selectID('#{examForm.id}')"/>
</h:column>
</td>
<h:column>
<f:facet name="header">
        <h:outputText value="����" />
 </f:facet>
<h:commandButton value="ɾ��" image= "Images/delete.gif"action="#{manageExam.deleteExam}"  onclick="selectID('#{exam.id}')"/>
</h:column>
</td>
</h:dataTable>
<h:inputHidden id="selectedID" value="#{manageExam.selectedID}"/>
<tr>
<br>
</tr>
</h:form>
</f:view>
<tr>
<td>
</td>
</tr>
</table>
<br/>

<!--���������Ϊfooter.jsp����-->
<%@ include file="bottom.jsp"%>
</body>
</html>