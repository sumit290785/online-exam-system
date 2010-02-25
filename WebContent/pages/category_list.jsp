<%@ include file="header.jsp"%>
<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<HTML>
<HEAD>
<link href="style/manage.css" rel="stylesheet" type="text/css" />
<TITLE>���߿���ϵͳģ��������</TITLE>
</HEAD>
<script type="text/javascript">
function selectCategory(id){
document.getElementById("categoryForm:selectedID").value=id;
}
</script>
<body>
<h1 align = "center">���߿���ϵͳģ��������</h1>
<table width = "100%">
<tr>
<td align="center">
<!--�������������-->
<f:view>
<h:form id="categoryForm">
<h:dataTable value="#{manageCategory.categoryList}" styleClass="recordList" var="category"  cellpadding="5"  first="0"  width="80%"  summary="This is a JSF code to create dataTable." dir="LTR">
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
<h:commandLink value="#{category.totalScore}" action="#{manageCategory.editCategory}"  onclick="selectCategory('#{category.id}')"/>
</h:column>
</td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="����ʱ��(����)"/>
 </f:facet>
<h:commandLink value="#{category.examTime}" action="#{manageCategory.editCategory}"  onclick="selectCategory('#{category.id}')"/>
</h:column>
</td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="��������" />
 </f:facet>
<h:commandLink value="#{category.totalQuestions}" action="#{manageCategory.editCategory}"  onclick="selectCategory('#{category.id}')"/>
</h:column>
</td>
<td>
<h:column>
<f:facet name="header">
        <h:outputText value="ͨ������" />
 </f:facet>
<h:commandLink value="#{category.passedQuestions}"  action="#{manageCategory.editCategory}"  onclick="selectCategory('#{category.id}')"/>
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
<td align = "center">
<h:commandButton value="���" action="#{manageCategory.initCategory}"/>
</td>
</h:form>
</f:view>
</table>
<br/>

<!--���������Ϊfooter.jsp����-->
<%@ include file="bottom.jsp"%>
<!--���������Ϊfooter.jsp����-->
</body>
</html>