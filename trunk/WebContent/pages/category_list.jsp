<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<HTML>
<HEAD>
<TITLE>���߿���ϵͳģ��������</TITLE>
</HEAD>
<script type="text/javascript">
function selectCategory(id){
alert(id);
document.getElementById("categoryForm:selectedID").value=id;
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
<td align="center">
<!--�������������-->
<f:view>
<h:form id="categoryForm">
<h:dataTable value="#{manageCategory.categoryList}" var="category" styleClass="orders" cellpadding="5"  first="0"  width="80%"  summary="This is a JSF code to create dataTable." dir="LTR">
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="���Կ�Ŀ" />
 </f:facet>
<h:commandLink value="#{category.categoryName}" action="#{manageCategory.editCategory}"  onclick="selectCategory('#{category.id}')">
</h:commandLink>
</h:column></td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="��������" />
 </f:facet>
<h:commandLink value="#{category.totalScore}"/>
</h:column>
</td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="����ʱ��(����)" />
 </f:facet>
<h:commandLink value="#{category.examTime}"/>
</h:column>
</td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="��������" />
 </f:facet>
<h:commandLink value="#{category.totalQuestions}" />
</h:column>
</td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="ͨ������" />
 </f:facet>
<h:commandLink value="#{category.passedQuestions}"/>
</h:column>
<h:column>
<f:facet name="header">
        <h:outputText value="����" />
 </f:facet>
<h:commandButton value="ɾ��" action="#{manageCategory.deleteCategory}"  onclick="selectCategory('#{category.id}')"/>
</h:column>
</td>
</h:dataTable>
<h:inputHidden id="selectedID" value="#{manageCategory.selectedID}"/>
<tr>
<br>
<td>
<h:commandButton value="���" action="#{manageCategory.initCategory}"/>
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