<%@ page language="java" contentType="text/html; charset=GB18030" pageEncoding="GB18030"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>完成考试</title>
<style type="text/css">
#Layer1 {
	position:absolute;
	width:178px;
	height:102px;
	z-index:1;
	top:500px;
	left:49%;
}
.USS_TITLE {
	font-family: "微软雅黑";
	font-weight: bold;
	font-size: 30px;
}

.USS_TEXT {
	font-family: "微软雅黑";
	font-weight: bold;
	font-size: 24px;
}

.USS_TITLE {
	font-size: 36px;
}

</style>
<style media=print>
.NOPRINT{display:none;}
</style>
</head>
<div id="Layer1">
<img src="Images/PASS.png" />
<!--
<img src="Images/FAIL.png" />
-->
</div>
<OBJECT id=WebBrowser classid=CLSID:8856F961-340A-11D0-A96B-00C04FD705A2 height=0 width=0>
</OBJECT>
<body>
<f:view>
<table width="600" border="0" align="center" cellpadding="0" cellspacing="0" class="NOPRINT">
  <tr>
  	<td align="right">
      <input type="image" src="Images/TestPrintBar_r1_c1.png" onclick=document.all.WebBrowser.ExecWB(8,1)><input type="image" src="Images/TestPrintBar_r1_c2.png" onclick=document.all.WebBrowser.ExecWB(7,1)><input type="image" src="Images/TestPrintBar_r1_c3.png" onclick=document.all.WebBrowser.ExecWB(6,1)>
    </td>
  </tr>
</table>
<table width="600" border="1" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td>
    <table width="500" border="0" align="center" cellpadding="0" cellspacing="0" class="USS_TITLE">
      <tr>
        <td>&nbsp;</td>
        </tr>
      <tr>
        <td align="center"><p>考试成绩单</p><hr width="90%" color="#000000" size="5"></td>
      </tr>
      <tr>
        <td><table background="background.png" width="400" border="0" align="center" cellpadding="0" cellspacing="0" class="USS_TEXT">
          <tr>
            <td height="32"></td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td width="143" height="64" align="right"><p>考生学号:</p></td>
            <td width="257" align="center">1080379183</td>
          </tr>
          <tr>
            <td height="64" align="right">考生姓名:</td>
            <td align="center">刘冰</td>
          </tr>
          <tr>
            <td height="64" align="right"><p>考试科目:</p></td>
            <td align="center">高级软件工程</td>
          </tr>
          <tr>
            <td height="64" align="right">考试用时:</td>
            <td align="center">01:20:34</td>
          </tr>
          <tr>
            <td height="64" align="right">考试成绩:</td>
            <td align="center">98 (A)</td>
          </tr>
          <tr>
            <td height="64" align="right"><p>是否通过:</p></td>
            <td align="center">&nbsp;</td>
          </tr>
          <tr>
            <td height="32"></td>
            <td>&nbsp;</td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td><table width="200" border="0" align="right" cellpadding="0" cellspacing="0">
          <tr>
            <td class="USS_TEXT">&nbsp;</td>
          </tr>
          <tr align="center">
            <td class="USS_TEXT">上海交通大学</td>
          </tr>
          <tr align="center">
            <td class="USS_TEXT">2010年02月27日</td>
          </tr>
          <tr>
            <td class="USS_TEXT">&nbsp;</td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
</table>
<p>&nbsp;</p>
</f:view>
</body>
</html>