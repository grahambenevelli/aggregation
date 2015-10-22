package com.interview.rectangle.impl;

import com.interview.rectangle.Point;

public class TwoPointImpl extends Point {

	private final long x;
	private final long y;

	private TwoPointImpl(long x, long y) {
		this.x = x;
		this.y = y;
	}

	public static TwoPointImpl initialize(long x, long y) {
		return new TwoPointImpl(x, y);
	}

	@Override 
	public long getX() {
		return x;
	}

	@Override 
	public long getY() {
		return y;
	}
}
