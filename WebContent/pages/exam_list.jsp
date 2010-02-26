<%@ include file="header.jsp"%>
<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<HTML>
<HEAD>
<link href="style/manage.css" rel="stylesheet" type="text/css" />
<TITLE>在线考试系统考试纪录管理界面</TITLE>
</HEAD>
<script type="text/javascript">
function selectID(id){
document.getElementById("questionForm:selectedID").value=id;
}
</script>
<body>
<h1 align = "center">在线考试系统考试纪录管理界面</h1>
<table width = "100%">
<tr>
<td align="center">
<!--内容请放在这里-->
<f:view>
<h:form id="examForm">
<h:dataTable value="#{manageExam.examList}" var="exam"    styleClass="recordList" cellpadding="5"  first="0"  width="80%"  rows="200" summary="This is a JSF code to create dataTable." dir="LTR">
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="所属科目" />
 </f:facet>
<h:commandLink value="#{exam.category}"  onclick="selectID('#{exam.id}')">
</h:commandLink>
</h:column></td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="用户名" />
 </f:facet>
<h:commandLink value="#{exam.user}"  onclick="selectID('#{exam.id}')"/>
</h:column>
</td>
<h:column>
<f:facet name="header">
        <h:outputText value="操作" />
 </f:facet>
<h:commandButton value="删除" image= "Images/delete.gif"action="#{manageExam.deleteExam}"  onclick="selectID('#{exam.id}')"/>
</h:column>
</td>
</h:dataTable>
<h:inputHidden id="selectedID" value="#{manageExam.selectedID}"/>
<tr>
<br>
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