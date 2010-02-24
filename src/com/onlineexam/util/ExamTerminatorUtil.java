package com.onlineexam.util;

import java.util.TimerTask;

import com.onlineexam.service.ExamTerminator;
import com.onlineexam.service.impl.ExamTerminatorImpl;

public class ExamTerminatorUtil {

	private static final ThreadLocal<ExamTerminator> threadExamTerminator = new ThreadLocal<ExamTerminator>();

	public static void startExamTerminatorThread(int delayTime, TimerTask task) {
		stopExamTerminatorThread();
		ExamTerminator et = new ExamTerminatorImpl();
		et.startTerminator(delayTime, task);
		threadExamTerminator.set(et);
	}

	public static void stopExamTerminatorThread() {
		ExamTerminator et = threadExamTerminator.get();
		threadExamTerminator.set(null);
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
		ExamTerminator et = threadExamTerminator.get();
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
		ExamTerminator et = threadExamTerminator.get();
		if (et != null) {
			runingTime = et.getTimePassed();
		}
		return runingTime;
	}
 }
