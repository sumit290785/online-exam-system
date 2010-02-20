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
<title>准备考试</title>
</head>
<body>
<f:view>
	<h:form>
		<td><h:outputText value="你选择的科目是：" /><h:outputText value="#{categoryId}" />



		<table width="800" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td height="50" align="center"><strong class="USS">考试和考试纪律规定</strong></td>
			</tr>
			<tr>
				<td>
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					class="USS2">
					<tr>
						<td width="8%" height="61" valign="top">&nbsp;一、</td>
						<td width="92%" valign="top">
						<p>各课程的复习、考试（包括考察）均应严格按照学校规定的日期、地点进行，不得擅自变动；如需变动必须事先征得教务处同意。</p>
						</td>
					</tr>
					<tr>
						<td height="84" valign="top">&nbsp;二、</td>
						<td valign="top">各教程任课老师，应认真组织好学生复习、考试。复习要紧扣课程大纲规定的教学目的和要求，并针对学生学习的薄弱环节，加以指导；任何教师都不得在复习时以各种方式透露或暗示同考试有关的内容，如有违反者，轻者批评教育，重则纪律处分。</td>
					</tr>
					<tr>
						<td height="84" valign="top">&nbsp;三、</td>
						<td valign="top">各课程考试命题，应按照教学大纲的要求，着重检查学生的基本知识、基础理论、基本技能（实践能力）和独立分析问题、解决问题的能力。试题难易应有适当坡度。每一科目试题的答卷时间，一般以两学时为宜。</td>
					</tr>
					<tr>
						<td height="61" valign="top">&nbsp;四、</td>
						<td valign="top">考试前各教学单位要认真检查试卷，发现错误或印刷不清等要马上补救，不要待试场开考后方作说明。要负责安排落实好试场，并检查试场的各项设备是否齐全安好。</td>
					</tr>
					<tr>
						<td height="84" valign="top">&nbsp;五、</td>
						<td valign="top">学生应提前五分钟，凭考试证进入试场，服从监考老师调度，按指定的座位入座。迟到超过十五分钟，不准参加考试，作缺考处理。考试时，原则上不得离开试场，如有特殊情况必须中途离开时，须经监考老师同意，并以离场一次为限。</td>
					</tr>
					<tr>
						<td height="64" valign="top">&nbsp;六、</td>
						<td valign="top">考试时除考试必需的用具及允许携带的书籍外，不得携带其它任何笔记、书籍及手机等通讯工具。答题一律用蓝、黑钢笔或圆珠笔，书写要清楚。</td>
					</tr>
					<tr>
						<td height="85" valign="top">&nbsp;七、</td>
						<td valign="top">试场内必须保持安静，不准抽烟。学生考完后，应将试题、答卷和草稿纸一起交给监考教师，不得带出试场。交卷后，应立即退出试场，不得以任何理由翻阅试卷。离场后，不得在试场附近谈话和逗留。</td>
					</tr>
					<tr>
						<td height="63" valign="top">&nbsp;八、</td>
						<td valign="top">学生应在规定的时间内答卷，不得拖延时间，交卷时间到，学生须在原座位静候监考教师收完试卷清点无误后，方可离场。</td>
					</tr>
					<tr>
						<td height="64" valign="top">&nbsp;九、</td>
						<td valign="top">学生口试抽签原则上以一次为限，不得更换，口试完毕离开试场后，不得泄露试题内容，尚未口试的学生不准探听口试内容。</td>
					</tr>
					<tr>
						<td height="85" valign="top">&nbsp;十、</td>
						<td valign="top">考试时，学生不听从监考教师安排，影响他人考试；不听劝告将与考试有关的笔记、书籍及手机通讯工具等带入考场的违纪者，根据其违纪程度，给予警告或严重警告直至记过处分，试卷成绩以零分记；将试卷擅自带出考场的，给予记过处分，试卷成绩以零分记。</td>
					</tr>

				</table>
				</td>
			</tr>
		</table>
		<h:commandButton action="#{enterExam.takeExam}" value="开始考试" /> <h:commandButton
			action="#{enterExam.cancel}" value="重选科目" />
	</h:form>
</f:view>
</body>
</html>