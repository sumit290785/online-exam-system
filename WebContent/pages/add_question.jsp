<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
</head>
<body>
<f:view>
	<h:messages showDetail="#{true}" showSummary="#{true}" />
	<h:form>
		Category:
		<h:selectOneMenu id="categoryID" value="#{addQuestion.categoryId}">
			<f:selectItems value="#{addQuestion.categoryItems}" />
		</h:selectOneMenu><br>
		Knowledge Point:
		<h:selectOneMenu id="knowledagePointID" value="#{addQuestion.knowlegePointId}">
			<f:selectItems value="#{addQuestion.kpItems}" />
		</h:selectOneMenu>
		<h:selectOneRadio id="mutiSelectID" value="#{addQuestion.multiSelect}">
			<f:selectItem itemValue="#{false}" itemLabel="Single Selection" />
			<f:selectItem itemValue="#{true}" itemLabel="Multiple Selection" />
		</h:selectOneRadio>
		Question Content:
		<h:inputTextarea id="questionContentID" value="#{addQuestion.questionContent}"/><br>
		Option:
		<h:inputTextarea id="optionContentID" value="#{addQuestion.optionContent}"/>
      	<h:commandButton action="#{addQuestion.addOption}" value="Add Option" /><br>
      	<h:selectOneMenu id="optionsID" value="#{addQuestion.optionId}">
			<f:selectItems value="#{addQuestion.optionItems}" />
		</h:selectOneMenu>
		<br>
	</h:form>
</f:view>
</body>
</html>