<%@ include file="header.jsp"%>
<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<HTML>
<HEAD>
<link href="style/manage.css" rel="stylesheet" type="text/css" />
<TITLE>在线考试系统考题管理界面</TITLE>
</HEAD>
<script type="text/javascript">
function selectID(id){
document.getElementById("questionForm:selectedID").value=id;
}
</script>
<body>
<h1 align = "center">在线考试系统考题管理界面</h1>
<table width = "100%">
<tr>
<td align="center">
<!--内容请放在这里-->
<f:view>
<h:form id="questionForm">
<h:dataTable value="#{manageQuestion.questionList}" var="question"    styleClass="recordList" cellpadding="5"  first="0"  width="80%"  summary="This is a JSF code to create dataTable." dir="LTR">
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="所属科目" />
 </f:facet>
<h:commandLink value="#{question.category.categoryName}" action="#{questionCategory.editQuestion}"  onclick="selectID('#{category.id}')">
</h:commandLink>
</h:column></td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="题目内容" />
 </f:facet>
<h:commandLink value="#{question.questionContent}" action="#{questionCategory.editCategory}"  onclick="selectID('#{category.id}')"/>
</h:column>
</td>
<h:column>
<f:facet name="header">
        <h:outputText value="操作" />
 </f:facet>
<h:commandButton value="删除" image= "Images/delete.gif"action="#{questionCategory.deleteQuestion}"  onclick="selectID('#{question.id}')"/>
</h:column>
</td>
</h:dataTable>
<h:inputHidden id="selectedID" value="#{questionCategory.selectedID}"/>
<tr>
<br>
<td align = "center">
<h:commandButton value="添加" action="#{questionQuestion.initQuestion}"/>
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

<!--这里可以作为footer.jsp内容-->
<%@ include file="bottom.jsp"%>
</body>
</html>