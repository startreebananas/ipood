package com.startreebananas.poopwallet;

// TODO This is gross and may be useless

public enum BristolType {
	
	HARDLUMPS(1), 
	LUMPYSAUSAGE(2), 
	CRACKEDSAUSAGE(3), 
	SMOOTHSAUSAGE(4), 
	CLEARCUTBLOBS(5), 
	FLUFFYPIECES(6), 
	WATERY(7);
	
	private int typeNumber;
	
	private BristolType(int type) {
		typeNumber = type;
	}
	
	public int getTypeNumber() {
		return typeNumber;
	}
}
