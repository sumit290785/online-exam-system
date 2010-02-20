<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>选择考试科目</title>
</head>
<body>
<f:view>
	<h:form>
	


    <table>
    <h:selectOneRadio value="#{selectCategory.categoryId}">

        <tr>
          <td><f:selectItems value="#{selectCategory.categoryMap}" /></td>
          <td></td>
        </tr>

     </h:selectOneRadio>
    </table>
 

    
		<h:commandButton action="#{selectCategory.showCategory}"  value="确认" />
	</h:form>
</f:view>
</body>
</html>