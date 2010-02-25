<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<HTML>
<HEAD>
<link href="style/manage.css" rel="stylesheet" type="text/css" />
<TITLE>���߿���ϵͳģ��������</TITLE>
</HEAD>
<script type="text/javascript">
function selectID(id){
document.getElementById("questionForm:selectedID").value=id;
}
</script>
<body>

<!--���������Ϊheader.jsp����-->
<p>
<table width="100%">
<tr>
<td align="center">
<img src="Images/logo.png"/>
</td>
</tr>
</table>
<hr/>


<table width = "100%">
<tr>
<td align="right">
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
<h:commandButton value="ɾ��" action="#{questionCategory.deleteQuestion}"  onclick="selectID('#{question.id}')"/>
</h:column>
</td>
</h:dataTable>
<h:inputHidden id="selectedID" value="#{questionCategory.selectedID}"/>
<tr>
<br>
<td>
<h:commandButton value="���" action="#{questionQuestion.initQuestion}"/>
</td>

</h:form>
</f:view>
<tr>
<td>
</td>
<td width="20%">
<a href="manage_main.jsp">�ع���������</a>
</td>
</tr>
</table>
<br/>

<!--���������Ϊfooter.jsp����-->
<p>
<hr/>
<table width="100%">
<tr>
<td align="center">
<img src="Images/bottom.jpg"/>
</td>
</tr>
</table>
</body>
</html>