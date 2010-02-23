<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>在线考试系统</title>
<style type="text/css">
<!--
.ol {
	font-family: "微软雅黑";
}
.USS {
	font-family: "微软雅黑";
	font-weight: bold;
	font-size: 20px;
}
-->
</style>
</head>

<body>
<f:view>
	 <h:messages showDetail="#{true}" showSummary="#{true}"/>
	<h:form>
<table width="200" border="0" align="center">
  <tr>
    <td align="center" valign="middle"><img src="Images/welcome/welcome.png" width="760" height="400" /></td>
  </tr>
  <tr>
  	<td>&nbsp;</td>
  </tr>
  <tr>
    <td align="center" valign="middle"><table width="400" border="0">
        <tr>
          <td><table width="400" border="0">
          <tr><td>&nbsp;</td>
          <td align="left"><FONT color="red"><h:outputText value="用户名或密码错误" rendered="#{login.loginFailed}" /></FONT></td>
          </tr>
            <tr>
              <td width="120" align="right" class="USS">
              		<h:outputLabel for="userId">
			<h:outputText value="用户名" />
		</h:outputLabel>

             </td>
              <td width="264" align="left">&nbsp;
              		<h:inputText id="userId" value="#{login.userId}"></h:inputText>
              </td>
            </tr>
          </table></td>
        </tr>
        <tr>
          <td><table width="400" border="0">
            <tr>
              <td width="120" align="right" class="USS">
     		<h:outputLabel for="password">
			<h:outputText value="密码" />
		</h:outputLabel>         
             </td>
              <td width="264" align="left">&nbsp;
              <h:inputSecret id="password" required="#{true}" value="#{login.password}" />
              </td>
            </tr>
          </table></td>
        </tr>
        <tr>
          <td><table width="400" border="0">
            <tr>
              <td width="234">&nbsp;</td>
              <td width="156" align="left"><h:commandButton action="#{login.login}" image="Images/welcome/logon.png" value="Login" /></td>
            </tr>
          </table></td>
        </tr>
      </table>
    <p>&nbsp;</p></td>
  </tr>
</table>
	</h:form>
</f:view>
</body>
</html>
