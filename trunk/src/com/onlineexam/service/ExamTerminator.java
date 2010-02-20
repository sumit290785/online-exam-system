package com.onlineexam.service;

import java.util.TimerTask;

/**
 * 
 * @author Joel Tsai
 * 
 */
public interface ExamTerminator {

	void startTerminator(int delayTime, TimerTask task);

	void stop();

	public int getRemainingTime();
}
