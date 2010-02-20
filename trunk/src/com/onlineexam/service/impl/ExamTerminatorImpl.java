package com.onlineexam.service.impl;

import java.util.Timer;
import java.util.TimerTask;

import com.onlineexam.service.ExamTerminator;

/**
 * @author Joel Tsai
 * 
 */
public class ExamTerminatorImpl implements ExamTerminator {
	private Timer timer;

	/** The passed time based on seconds. */
	private int passedTime;

	private long startTime;

	private long currentTime;
	
	private int delayTime;

	public void startTerminator(int delaytime, TimerTask task) {
		timer = new Timer();
		delayTime = delaytime;
		startTime = System.currentTimeMillis();
		timer.schedule(task, delaytime * 1000);
	}

	public void stop() {
		timer.cancel();
	}

	/**
	 * Get the remaining time, milliseconds.
	 * @return the remaining time.
	 */
	public int getRemainingTime() {
		currentTime = System.currentTimeMillis();
		passedTime = (int) ((currentTime - startTime) / 1000);
		return delayTime - passedTime;
	}
}
