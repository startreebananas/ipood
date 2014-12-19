package com.startreebananas.poopwallet;

import java.util.Date;

public class Poop {

	private Date startTime;
	private BristolType type;
	private String notes;
	private long duration; // duration is in seconds
	private double rate; // dollars or other currency per hour
	
	/**
	 * Creates a new Poop that will be charged at a given rate
	 * @param rate rate that the Poop will be charged at
	 */
	public Poop(double rate) {
		this.startTime = new Date();
		this.rate = rate;
	}
	
	/**
	 * Gets the date and time that the Poop started at
	 * @return date and time of Poop as a Date
	 */
	public Date getStartTime() {
		return startTime;
	}
	
	/**
	 * Sets the Bristol Stool type of this Poop
	 * @param type BristolType of this Poop
	 */
	public void setType(BristolType type) {
		this.type = type;
	}
	
	/**
	 * Gets the Bristol Stool of this Poop
	 * @return BristolType of this Poop
	 */
	public BristolType getType() {
		return type;
	}
	
	/**
	 * Sets the Pooper's notes for this Poop
	 * @param notes information the Pooper has recorded for this Poop
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	/**
	 * Gets the Pooper's notes for this Poop
	 * @return notes for this Poop
	 */
	public String getNotes() {
		return notes;
	}
	
	/**
	 * Sets the duration of this Poop
	 * @param duration time in seconds that this Poop took
	 */
	public void setDuration(long duration) {
		this.duration = duration;
	}
	
	/**
	 * Gets the duration of this Poop
	 * @return time in seconds that the Poop took
	 */
	public long getDuration() {
		return duration;
	}
	
	/**
	 * Gets the rate this Poop was charged at
	 * @return rate of this Poop as a double
	 */
	public double getRate() {
		return rate;
	}
	
	/**
	 * Gets the total money earned by this Poop
	 * @return money earned by this Poop 
	 */
	public double getEarnings() {
		// Get rate in terms of currency per second
		double ratePerSecond = rate/3600;
		
		// Multiply new rate by duration
		double moneyEarned = ratePerSecond * duration;
		
		return moneyEarned;
	}
}
