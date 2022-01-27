package com.educandoweb.pomodoro.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class TimerConfig implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private int pomodoroDuration;
	private int shortPauseDuration;
	private int longPauseDuration;
	private int pomodorosPerCycle;
	@OneToOne(mappedBy="timerConfig")
	@JoinColumn(name = "user_id")
	private User user;
	
	public TimerConfig()
	{
		
	}
	
	public TimerConfig(Long id, int pomodoroDuration, int shortPauseDuration, int longPauseDuration, int pomodorosPerCycle,
			User user) {
		super();
		this.pomodoroDuration = pomodoroDuration;
		this.shortPauseDuration = shortPauseDuration;
		this.longPauseDuration = longPauseDuration;
		this.pomodorosPerCycle = pomodorosPerCycle;
		this.user = user;
		this.id = id;
	}

	public int getPomodoroDuration() {
		return pomodoroDuration;
	}

	public void setPomodoroDuration(int pomodoroDuration) {
		this.pomodoroDuration = pomodoroDuration;
	}

	public int getShortPauseDuration() {
		return shortPauseDuration;
	}

	public void setShortPauseDuration(int shortPauseDuration) {
		this.shortPauseDuration = shortPauseDuration;
	}

	public int getLongPauseDuration() {
		return longPauseDuration;
	}

	public void setLongPauseDuration(int longPauseDuration) {
		this.longPauseDuration = longPauseDuration;
	}

	public int getPomodorosPerCycle() {
		return pomodorosPerCycle;
	}

	public void setPomodorosPerCycle(int pomodorosPerCycle) {
		this.pomodorosPerCycle = pomodorosPerCycle;
	}

	public User getUser() {
		return user;
	}



	
	

}
