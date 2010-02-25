<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>考试</title>
<style type="text/css">
<!--
.USS {
	font-family: "微软雅黑";
	font-size: 20px;
}
-->
</style>
<%
	int time1 = Integer.parseInt((String) request
			.getAttribute("passedTime"));
%>

<script type="text/javascript" >
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
		document.getElementById('leftTime').innerHTML = hours + ":" + minutes
				+ ":" + seconds
		c = c - 1
		t = setTimeout("timedCount()", 1000)

	}
</script>
</head>
<body onload="timedCount2(<%=time1%>)">
<f:view>
	<h:form>

		<table width="700" border="1" bordercolor="#000000" align="center"
			cellpadding="0" cellspacing="0" class="USS">
			<tr>
				<td height="40" bgcolor="#000000">&nbsp;<font color="#FFFFFF">第<h:outputText value="#{takeExam.questionNumber}" />题 ||剩余时间<div id="leftTime"></div>
				</font></td>
			</tr>
			<tr>
				<td height="400" valign="top">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td><h:outputText value="#{takeExam.questionName}" /></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp; <h:selectOneRadio value="#{takeExam.answer}" layout="pageDirection">
							<f:selectItems value="#{takeExam.optionItems}" />
						</h:selectOneRadio></td>
					</tr>
				</table>
				</td>
			</tr>
		</table>
		<table width="700" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td align="right"><br>
				<h:commandButton rendered="#{!takeExam.fstQuestion}"
					action="#{takeExam.showPreQuest}"
					image="Images/testbutton_r1_c1.png" /> <h:commandButton
					rendered="#{!takeExam.lastQuesion}"
					action="#{takeExam.showNxtQuest}"
					image="Images/testbutton_r1_c2.png" /> <h:commandButton
					rendered="#{takeExam.lastQuesion}" action="#{takeExam.finish}"
					image="Images/testbutton_r1_c3.png" /></td>
			</tr>
		</table>




	</h:form>
</f:view>
</body>
</html>