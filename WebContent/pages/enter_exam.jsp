<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ page import="com.onlineexam.web.EnterExamForm"%>
<%@ page import="com.onlineexam.util.FacesUtil"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>准备考试</title>
<style type="text/css">
<!--
.USS {
	font-family: "微软雅黑";
	font-size: 18px;
	font-weight: bold;
}
-->
</style>
</head>
<body>
<f:view>
	<h:form>

		<table width="500" border="0" align="center" cellpadding="0"
			cellspacing="0" class="USS">
			<tr>
				<td>你选择的考试科目是： <h:outputText value="#{selectCategory.categoryName}" /></td>
			</tr>
			<tr>
				<td align="center">&nbsp;</td>
			</tr>
			<tr>
				<td>请仔细阅读《考试和考试纪律规定》，并确认开始考试！</td>
			</tr>
			<tr>
				<td><textarea cols="100%" rows="25" name="principle"
					readonly="readonly">
考试和考试纪律规定
考试是对教与学的效果进行检验的一种形式，为了坚持公平、公正的原则，严肃考试纪律，特作如下规定：
一、各课程的复习、考试（包括考察）均应严格按照学校规定的日期、地点进行，不得擅自变动；如需变动必须事先征得教务处同意。
二、各教程任课老师，应认真组织好学生复习、考试。复习要紧扣课程大纲规定的教学目的和要求，并针对学生学习的薄弱环节，加以指导；任何教师都不得在复习时以各种方式透露或暗示同考试有关的内容，如有违反者，轻者批评教育，重则纪律处分。
三、各课程考试命题，应按照教学大纲的要求，着重检查学生的基本知识、基础理论、基本技能（实践能力）和独立分析问题、解决问题的能力。试题难易应有适当坡度。每一科目试题的答卷时间，一般以两学时为宜。
四、考试前各教学单位要认真检查试卷，发现错误或印刷不清等要马上补救，不要待试场开考后方作说明。要负责安排落实好试场，并检查试场的各项设备是否齐全安好。
五、学生应提前五分钟，凭考试证进入试场，服从监考老师调度，按指定的座位入座。迟到超过十五分钟，不准参加考试，作缺考处理。考试时，原则上不得离开试场，如有特殊情况必须中途离开时，须经监考老师同意，并以离场一次为限。
六、考试时除考试必需的用具及允许携带的书籍外，不得携带其它任何笔记、书籍及手机等通讯工具。答题一律用蓝、黑钢笔或圆珠笔，书写要清楚。
七、试场内必须保持安静，不准抽烟。学生考完后，应将试题、答卷和草稿纸一起交给监考教师，不得带出试场。交卷后，应立即退出试场，不得以任何理由翻阅试卷。离场后，不得在试场附近谈话和逗留。
八、学生应在规定的时间内答卷，不得拖延时间，交卷时间到，学生须在原座位静候监考教师收完试卷清点无误后，方可离场。
九、学生口试抽签原则上以一次为限，不得更换，口试完毕离开试场后，不得泄露试题内容，尚未口试的学生不准探听口试内容。
十、考试时，学生不听从监考教师安排，影响他人考试；不听劝告将与考试有关的笔记、书籍及手机通讯工具等带入考场的违纪者，根据其违纪程度，给予警告或严重警告直至记过处分，试卷成绩以零分记；将试卷擅自带出考场的，给予记过处分，试卷成绩以零分记。
十一、 考试时，学生不得交头接耳，不准抄袭，不准互递纸条，严禁暗中夹带与考试有关的纸条、笔记等。如有上述行为者，视为作弊。第一次作弊给予留校察看处分；重犯者，予以退学；由他人代替考试或替他人参加考试、组织作弊、使用通讯设备作弊及其他严重作弊行为者，予以开除学籍处分；替考未遂者，给予留校察看处分。
十二、 监考教师应严守职责，不得迟到、早退，中途不得擅离监考岗位。考试前十分钟到达试场并作好试场的检查清理工作，发现问题应及时处理。如遇试场安排不当，或因设备等原因影响考试准时进行，监考人员应立即与有关部门联系采取措施解决，所延误的考试时间，允许补足，对失职人员要查究责任。监考时，要集中精力，认真负责，不得做与监考无关的事情。发现问题应及时报告主考，并妥善作出处理。考试结束时，须认真填写考场情况记录表并及时上报教务处。凡监考失职，将根据情况，给予批评教育直至处分。
十三、 学生应独立完成答卷，监考人员发现违纪作弊者（包括协同作弊者），处理要慎重，首先要及时报告主考，掌握确凿证据，应当众宣布取消其考试资格，没收其试卷，令其退出试场。该课程成绩以零分计，不准参加正常补考。并根据其违纪程度，酌情给予相应的处分。考试结束后，主考和监考人员须及时将违纪作弊者（包括协同作弊者）详细情况的书面报告连同证据交教务处处理。
十四、 因考试违纪未获得该课程成绩的学生，如以后确有悔改表现，由本人申请，经院（系）领导审核同意，报教务处批准，毕业前可给予一次补考的机会。
十五、 考试结束后，各院（系）、部要及时组织教师阅卷，评分标准要统一，做到公平、公正。试卷要有专人负责保管，以备查阅，试卷的保存期为三学年。
    </textarea></td>
			</tr>
			<tr>
				<td align="center">&nbsp;</td>
			</tr>
			<tr>
				<td align="center"><h:commandButton
					action="#{enterExam.cancel}" image="Images/home_r1_c1.png" >
					</h:commandButton>
					<h:commandButton action="#{enterExam.takeExam}" image="Images/home_r1_c2.png" >
					</h:commandButton>
					</td>
			</tr>
		</table>

	</h:form>
</f:view>
</body>
</html>