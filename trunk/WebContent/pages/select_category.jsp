<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>选择考试科目t</title>
<style type="text/css">
<!--
.USS {
	font-family: "微软雅黑";
	font-size: 22px;
	font-weight: bold;
}
-->
</style>
</head>
<body>
<f:view>
	<h:form>

		<table width="400" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td><img src="Images/choice.png" width="400" height="236" alt="" /></td>
			</tr>
			<tr>
				<td>
				<table width="300" border="0" align="center" cellpadding="0"
					cellspacing="0">
					<tr>
						<td>&nbsp;</td>
					</tr>

					<tr>
						<td width="250" valign="middle" class="USS"><span class="USS">
						<h:selectOneRadio value="#{selectCategory.categoryId}">
							<f:selectItems value="#{selectCategory.categoryMap}" /><br>
						</h:selectOneRadio></span></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td align="center"><input type="image"
					src="Images/choicebar1_r1_c1.png" /><h:commandButton
					action="#{selectCategory.showCategory}"
					image="Images/choicebar1_r1_c2.png" /></td>
			</tr>
		</table>



		<table>

		</table>




	</h:form>
</f:view>
</body>
</html>