package com.interview.stringSubset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Find out if the characters in a string are a subset 
 */
@RunWith(Parameterized.class)
public class StringSubsetQuestionTest {

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ "a", "a", true },
				{ "a", "b", false },
				{ "", "", true },
				{ "a", "bbbbbbbbbbbba", true },
				{ "b", "bbbbbbbbbbbba", true },
				{ "ab", "bbbbbbbbbbbba", true },
				{ "abc", "bbbbbbbbbbbba", false },
				{ "ac", "abbbbbbbbbbbbc", true },
		});
	}

	private final String needle;
	private final String heystack;
	private final boolean expected;

	public StringSubsetQuestionTest(String needle, String heystack, boolean expected) {
		this.needle = needle;
		this.heystack = heystack;
		this.expected = expected;
	}
	
	@Test
	public void testIsSubset() {
		StringSubsetQuestion question = StringSubsetQuestion.initialize(heystack);
		assertEquals(expected, question.isSubset(needle));
	}
}