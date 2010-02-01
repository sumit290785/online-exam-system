<!doctype html public "-//w3c//dtd html 4.0 transitional//en">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Login</title>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
</head>
<body>
Log in with your User ID and Password.
<br />
<br />
<f:view>
	 <h:messages showDetail="#{true}" showSummary="#{true}"/>
	<h:form>
		<h:outputLabel for="userId">
			<h:outputText value="User ID" />
		</h:outputLabel>
		<h:inputText id="userId" value="#{login.userId}">
			<f:validateLength maximum="20"
                                  minimum="3"/>
        </h:inputText>
		<br />

		<h:outputLabel for="password">
			<h:outputText value="Password" />
		</h:outputLabel>
		<h:inputSecret id="password" required="#{true}" value="#{login.password}" />
		<br />
		<!--
		<h:outputLabel for="birthday">
			<h:outputText value="Birthday" />
		</h:outputLabel>

		<h:inputText id="birthday" required="#{true}" value="#{login.birthday}">
			<f:convertDateTime pattern="MM/dd/yyyy" />
		</h:inputText>
		  -->
		<h:commandButton action="#{login.login}" value="Login" />
	</h:form>
</f:view>
</body>
</html>