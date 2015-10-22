package com.interview.stringSubset;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Find out if the characters in a string are a subset 
 */
@RunWith(Parameterized.class)
public class StringSubsetOrderedQuestionTest {

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ "a", "a", true },
				{ "a", "b", false },
				{ "", "", true },
				{ "a", "bbbbbbbbbbbba", true },
				{ "b", "bbbbbbbbbbbba", true },
				{ "ba", "bbbbbbbbbbbba", true },
				{ "ab", "bbbbbbbbbbbba", true },
				{ "ab", "bbbbbbbbbbbba", false },
				{ "abc", "bbbbbbbbbbbba", false },
				{ "ac", "abbbbbbbbbbbbc", true },
				{ "ac", "cbbbbbbbbbbbba", false },
		});
	}

	private final String needle;
	private final String heystack;
	private final boolean expected;

	public StringSubsetOrderedQuestionTest(String needle, String heystack, boolean expected) {
		this.needle = needle;
		this.heystack = heystack;
		this.expected = expected;
	}
	
	@Test
	public void testIsSubset() {
		StringSubsetQuestion question = StringSubsetQuestion.initialize(heystack);
		assertEquals(expected, question.isOrderedSubset(needle));
	}
}