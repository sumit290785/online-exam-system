<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<HTML>
<HEAD>
<TITLE>在线考试系统模板管理界面</TITLE>
</HEAD>
<script type="text/javascript">
function selectCategory(id){
alert(id);
document.getElementById("categoryForm:selectedID").value=id;
}
</script>
<body>

<!--这里可以作为header.jsp内容-->
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
<td align="center">
<!--内容请放在这里-->
<f:view>
<h:form id="categoryForm">
<h:dataTable value="#{manageCategory.categoryList}" var="category" styleClass="orders" cellpadding="5"  first="0"  width="80%"  summary="This is a JSF code to create dataTable." dir="LTR">
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="考试科目" />
 </f:facet>
<h:commandLink value="#{category.categoryName}" action="#{manageCategory.editCategory}"  onclick="selectCategory('#{category.id}')">
</h:commandLink>
</h:column></td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="考试满分" />
 </f:facet>
<h:commandLink value="#{category.totalScore}"/>
</h:column>
</td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="考试时间(分钟)" />
 </f:facet>
<h:commandLink value="#{category.examTime}"/>
</h:column>
</td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="考试题数" />
 </f:facet>
<h:commandLink value="#{category.totalQuestions}" />
</h:column>
</td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="通过题数" />
 </f:facet>
<h:commandLink value="#{category.passedQuestions}"/>
</h:column>
<h:column>
<f:facet name="header">
        <h:outputText value="操作" />
 </f:facet>
<h:commandButton value="删除" action="#{manageCategory.deleteCategory}"  onclick="selectCategory('#{category.id}')"/>
</h:column>
</td>
</h:dataTable>
<h:inputHidden id="selectedID" value="#{manageCategory.selectedID}"/>
<tr>
<br>
<td>
<h:commandButton value="添加" action="#{manageCategory.initCategory}"/>
</td>
</h:form>
</f:view>
<tr>
<td>
</td>
<td width="20%">
<a href="manage_main.jsp">回管理主界面</a>
</td>
</tr>
</table>
<br/>

<!--这里可以作为footer.jsp内容-->
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