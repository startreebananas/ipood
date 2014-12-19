package com.startreebananas.poopwallet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PoopLog {
	
	private ArrayList<ArrayList<Poop>> poopHolder;
	private int totalPoops;
	
	public PoopLog() {
		poopHolder = new ArrayList<ArrayList<Poop>>();
	}
	
	/**
	 * Adds a Poop at the correct DateTime in the Poop Log.
	 * @param date when Poop was created
	 * @param poop Poop that needs to be added
	 * @return true if insertion was successful; false otherwise
	 */
	public Boolean addPoop(Date date, Poop poop) {
		
		// Get date from date-time object passed in
		
		// Traverse rows to find correct date-row
		
		// Get time from date-time object passed in
		
		// Traverse date-row by times to find the 
		// right place to insert new Poop
		
		totalPoops++;
		
		return false;
	}
	
	public Boolean deletePoop(Date date) {
		
		// Get date from date-time object passed in
		
		// Traverse rows to find correct date-row
		
		// Get time from date-time object passed in
		
		// Traverse date-row by times to find the 
		// right Poop to delete
		
		totalPoops--;
		
		return false;
	}
	
	public List<Poop> getPoopsByDay(Date date) {
		
		// Get date from date-time object passed in
		
		// Traverse rows to find correct date-row
		
		// Return row
		
		return null;
	}
	
	public ArrayList<ArrayList<Poop>> getPoopLog() {
		return poopHolder;
	}
	
	public int getTotalPoops() {
		return totalPoops;
	}
	
	// TODO Not sure why this method is in here???
	public double calculateTotalEarnings(List<Poop> poops) {
		
		double earnings = 0.0;
		
		for (Poop poop : poops) {
			earnings += poop.getEarnings();
		}
		
		return earnings;
	}
	
	public double calculateTotalEarningsFromDate(Date date) {
		
		// Get date from date-time object passed in
		
		// Traverse rows to find correct date-row
		
		// Get time from date-time object passed in
		
		// Traverse date-row by times to find the 
		// right place to start calculating earnings from
		
		// Create list from the rest of poops from that date
		
		// Call calculateTotalEarnings and pass in that list of poops
		
		return 0.0;
	}
}
