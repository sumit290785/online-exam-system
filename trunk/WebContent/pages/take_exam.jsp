<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>����</title>
<%
	int time1 = Integer.parseInt((String)request.getAttribute("passedTime"));
%>

<script type="text/javascript">
	var c = 0;
	var t;
	function timedCount2(ttt) {
		c = ttt
		timedCount()
	}
	function timedCount() {
		hours = parseInt(c / 3600)
		minutes = parseInt((c % 3600) / 60)
		seconds = parseInt(c % 3600 % 60)
		document.getElementById('leftTime').innerHTML = hours + ":" + minutes + ":"
				+ seconds
		c = c - 1
		t = setTimeout("timedCount()", 1000)
	}
</script>
</head>
<body onload="timedCount2(<%=time1 %>)">
<f:view>
	<h:form>
	ʣ��ʱ��<div id="leftTime"></div><br>
	��<h:outputText value="#{takeExam.questionNumber}" />��<br>

		<h:outputText value="#{takeExam.questionName}" />
		<table>
			<h:selectOneRadio value="#{takeExam.answer}">

				<tr>
					<td><f:selectItems value="#{takeExam.optionMap}" /></td>
					<td></td>
				</tr>

			</h:selectOneRadio>
		</table>



		<h:commandButton rendered="#{!takeExam.fstQuestion}"
			action="#{takeExam.showPreQuest}" value="��һ��" />
		<h:commandButton rendered="#{!takeExam.lastQuesion}"
			action="#{takeExam.showNxtQuest}" value="��һ��" />
		<h:commandButton rendered="#{takeExam.lastQuesion}"
			action="#{takeExam.finish}" value="���" />
	</h:form>
</f:view>
</body>
</html>