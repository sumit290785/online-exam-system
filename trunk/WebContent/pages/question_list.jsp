<%@ include file="header.jsp"%>
<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<HTML>
<HEAD>
<link href="style/manage.css" rel="stylesheet" type="text/css" />
<TITLE>���߿���ϵͳ����������</TITLE>
</HEAD>
<script type="text/javascript">
function selectID(id){
document.getElementById("questionForm:selectedID").value=id;
}
</script>
<body>
<h1 align = "center">���߿���ϵͳ����������</h1>
<table width = "100%">
<tr>
<td align="center">
<!--�������������-->
<f:view>
<h:form id="questionForm">
<h:dataTable value="#{manageQuestion.questionList}" var="question"    styleClass="recordList" cellpadding="5"  first="0"  width="80%"  summary="This is a JSF code to create dataTable." dir="LTR">
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="������Ŀ" />
 </f:facet>
<h:commandLink value="#{question.category.categoryName}" action="#{questionCategory.editQuestion}"  onclick="selectID('#{category.id}')">
</h:commandLink>
</h:column></td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="��Ŀ����" />
 </f:facet>
<h:commandLink value="#{question.questionContent}" action="#{questionCategory.editCategory}"  onclick="selectID('#{category.id}')"/>
</h:column>
</td>
<h:column>
<f:facet name="header">
        <h:outputText value="����" />
 </f:facet>
<h:commandButton value="ɾ��" image= "Images/delete.gif"action="#{questionCategory.deleteQuestion}"  onclick="selectID('#{question.id}')"/>
</h:column>
</td>
</h:dataTable>
<h:inputHidden id="selectedID" value="#{questionCategory.selectedID}"/>
<tr>
<br>
<td align = "center">
<h:commandButton value="���" action="#{questionQuestion.initQuestion}"/>
</td>
</tr>>
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