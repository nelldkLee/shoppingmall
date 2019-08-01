package com.cafe24.shoppingmall.dto;

public enum Progress {
	DEPOSIT_WAIT(1), DEPOSIT_DONE(2), DELIVERY_WAIT(3), DELIVERY_PROCEEDING(4), DELIVERY_DONE(5);

	private final int value;

	Progress(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public static Progress valueOf(int value) {
		switch(value) {
			case 1: return Progress.DEPOSIT_WAIT;
			case 2: return Progress.DEPOSIT_DONE;
			case 3: return Progress.DELIVERY_WAIT;
			case 4: return Progress.DELIVERY_PROCEEDING;
			case 5: return Progress.DELIVERY_DONE;
			default: throw new AssertionError("Unknown Progress: " + value);
		}
	}
}
