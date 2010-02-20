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
	 * Get the remaining time of the current terminator. It's based on milliseconds.
	 * @return the milliseconds of remaining time.
	 */
	public static int getCurrentTerminatorRemainingTime() {
		int runingTime = 0;
		ExamTerminator et = threadExamTerminator.get();
		if (et != null) {
			runingTime = et.getRemainingTime();
		}
		return runingTime;
	}
 }
