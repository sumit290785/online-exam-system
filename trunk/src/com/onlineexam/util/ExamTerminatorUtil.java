package com.onlineexam.util;

import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;

import com.onlineexam.service.ExamTerminator;
import com.onlineexam.service.impl.ExamTerminatorImpl;
import com.onlineexam.web.LoginBean;

public class ExamTerminatorUtil {

	//private static final ThreadLocal<ExamTerminator> threadExamTerminator = new ThreadLocal<ExamTerminator>();
	
	//Temp approach
	private static final Map<String, ExamTerminator> threadExamTerminator = new HashMap<String, ExamTerminator>();
	
	
	public static void startExamTerminatorThread(int delayTime, TimerTask task) {
		stopExamTerminatorThread();
		ExamTerminator et = new ExamTerminatorImpl();
		et.startTerminator(delayTime, task);
		LoginBean loginBean = (LoginBean) FacesUtil.getManagedBean("login");
		threadExamTerminator.put(loginBean.getUniqueLoginInfo(), et);
	}

	public static void stopExamTerminatorThread() {
		LoginBean loginBean = (LoginBean) FacesUtil.getManagedBean("login");
		ExamTerminator et = threadExamTerminator.get(loginBean.getUniqueLoginInfo());
		threadExamTerminator.remove(loginBean.getUniqueLoginInfo());
		if (et != null) {
			et.stop();
		}
	}
	
	/**
	 * Get the remaining time of the current terminator. It's based on seconds.
	 * @return the seconds of remaining time.
	 */
	public static int getCurrentTerminatorRemainingTime() {
		int remainingTime = 0;
		LoginBean loginBean = (LoginBean) FacesUtil.getManagedBean("login");
		ExamTerminator et = threadExamTerminator.get(loginBean.getUniqueLoginInfo());
		if (et != null) {
			remainingTime = et.getRemainingTime();
		}
		return remainingTime;
	}
	
	/**
	 * Get the running time of the current terminator. It's based on seconds.
	 * @return the seconds of running time.
	 */	
	public static int getCurrentTerminatorRuningTime() {
		int runingTime = 0;
		LoginBean loginBean = (LoginBean) FacesUtil.getManagedBean("login");
		ExamTerminator et = threadExamTerminator.get(loginBean.getUniqueLoginInfo());
		if (et != null) {
			runingTime = et.getTimePassed();
		}
		return runingTime;
	}
 }
