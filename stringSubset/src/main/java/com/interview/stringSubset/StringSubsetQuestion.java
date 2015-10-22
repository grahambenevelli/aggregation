package com.interview.stringSubset;

import com.interview.InterviewQuestion;

/**
 * Find the largest rectangle given a list of points.
 */
public class StringSubsetQuestion implements InterviewQuestion {

	private final String heystack;

	private StringSubsetQuestion(String heystack) {
		this.heystack = heystack;
	}

	public static StringSubsetQuestion initialize(String heystack) {
		return new StringSubsetQuestion(heystack);
	}

	public boolean isSubset(String needle) {
		// TODO
		return false;
	}

	public boolean isOrderedSubset(String needle) {
		// TODO
		return false;
	}
}
