<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ page import="com.onlineexam.web.EnterExamForm" %>
<%@ page import="com.onlineexam.util.FacesUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>׼������</title>
</head>
<body>
<f:view>
	<h:form>
		<td><h:outputText value="��ѡ��Ŀ�Ŀ�ǣ�" /><h:outputText value="#{categoryId}" />



		<table width="800" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td height="50" align="center"><strong class="USS">���ԺͿ��Լ��ɹ涨</strong></td>
			</tr>
			<tr>
				<td>
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					class="USS2">
					<tr>
						<td width="8%" height="61" valign="top">&nbsp;һ��</td>
						<td width="92%" valign="top">
						<p>���γ̵ĸ�ϰ�����ԣ��������죩��Ӧ�ϸ���ѧУ�涨�����ڡ��ص���У��������Ա䶯������䶯�����������ý���ͬ�⡣</p>
						</td>
					</tr>
					<tr>
						<td height="84" valign="top">&nbsp;����</td>
						<td valign="top">���̳��ο���ʦ��Ӧ������֯��ѧ����ϰ�����ԡ���ϰҪ���ۿγ̴�ٹ涨�Ľ�ѧĿ�ĺ�Ҫ�󣬲����ѧ��ѧϰ�ı������ڣ�����ָ�����κν�ʦ�������ڸ�ϰʱ�Ը��ַ�ʽ͸¶��ʾͬ�����йص����ݣ�����Υ���ߣ���������������������ɴ��֡�</td>
					</tr>
					<tr>
						<td height="84" valign="top">&nbsp;����</td>
						<td valign="top">���γ̿������⣬Ӧ���ս�ѧ��ٵ�Ҫ�����ؼ��ѧ���Ļ���֪ʶ���������ۡ��������ܣ�ʵ���������Ͷ����������⡢����������������������Ӧ���ʵ��¶ȡ�ÿһ��Ŀ����Ĵ��ʱ�䣬һ������ѧʱΪ�ˡ�</td>
					</tr>
					<tr>
						<td height="61" valign="top">&nbsp;�ġ�</td>
						<td valign="top">����ǰ����ѧ��λҪ�������Ծ����ִ����ӡˢ�����Ҫ���ϲ��ȣ���Ҫ���Գ���������˵����Ҫ��������ʵ���Գ���������Գ��ĸ����豸�Ƿ���ȫ���á�</td>
					</tr>
					<tr>
						<td height="84" valign="top">&nbsp;�塢</td>
						<td valign="top">ѧ��Ӧ��ǰ����ӣ�ƾ����֤�����Գ������Ӽ࿼��ʦ���ȣ���ָ������λ�������ٵ�����ʮ����ӣ���׼�μӿ��ԣ���ȱ����������ʱ��ԭ���ϲ����뿪�Գ��������������������;�뿪ʱ���뾭�࿼��ʦͬ�⣬�����볡һ��Ϊ�ޡ�</td>
					</tr>
					<tr>
						<td height="64" valign="top">&nbsp;����</td>
						<td valign="top">����ʱ�����Ա�����þ߼�����Я�����鼮�⣬����Я�������καʼǡ��鼮���ֻ���ͨѶ���ߡ�����һ���������ڸֱʻ�Բ��ʣ���дҪ�����</td>
					</tr>
					<tr>
						<td height="85" valign="top">&nbsp;�ߡ�</td>
						<td valign="top">�Գ��ڱ��뱣�ְ�������׼���̡�ѧ�������Ӧ�����⡢���Ͳݸ�ֽһ�𽻸��࿼��ʦ�����ô����Գ��������Ӧ�����˳��Գ����������κ����ɷ����Ծ��볡�󣬲������Գ�����̸���Ͷ�����</td>
					</tr>
					<tr>
						<td height="63" valign="top">&nbsp;�ˡ�</td>
						<td valign="top">ѧ��Ӧ�ڹ涨��ʱ���ڴ����������ʱ�䣬����ʱ�䵽��ѧ������ԭ��λ����࿼��ʦ�����Ծ��������󣬷����볡��</td>
					</tr>
					<tr>
						<td height="64" valign="top">&nbsp;�š�</td>
						<td valign="top">ѧ�����Գ�ǩԭ������һ��Ϊ�ޣ����ø�������������뿪�Գ��󣬲���й¶�������ݣ���δ���Ե�ѧ����׼̽���������ݡ�</td>
					</tr>
					<tr>
						<td height="85" valign="top">&nbsp;ʮ��</td>
						<td valign="top">����ʱ��ѧ�������Ӽ࿼��ʦ���ţ�Ӱ�����˿��ԣ�����Ȱ�潫�뿼���йصıʼǡ��鼮���ֻ�ͨѶ���ߵȴ��뿼����Υ���ߣ�������Υ�ͳ̶ȣ����辯������ؾ���ֱ���ǹ����֣��Ծ�ɼ�����ּǣ����Ծ����Դ��������ģ�����ǹ����֣��Ծ�ɼ�����ּǡ�</td>
					</tr>

				</table>
				</td>
			</tr>
		</table>
		<h:commandButton action="#{enterExam.takeExam}" value="��ʼ����" /> <h:commandButton
			action="#{enterExam.cancel}" value="��ѡ��Ŀ" />
	</h:form>
</f:view>
</body>
</html>