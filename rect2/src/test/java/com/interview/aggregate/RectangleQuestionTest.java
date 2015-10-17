package com.interview.aggregate;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Sets;
import com.interview.aggregate.impl.TwoPointImpl;

public class RectangleQuestionTest {
	
	private RectangleQuestion rectangleQuestion;
	
	@Before
	public void setup() {
		rectangleQuestion = new RectangleQuestion();
	}

	/**
	 * 	[
	 * 		{x: 1, y: 1},
	 * 		{x: 2, y: 2}
	 * 	] 
	 *
	 * 	{x: 1, y: 1} && {x: 2, y: 2} => 1 (correct)
	 */
	@Test
	public void testSkyline2Points() throws Exception {
		Set<Point> points = Sets.newHashSet(
				TwoPointImpl.intialize(1, 1),
				TwoPointImpl.intialize(2, 2)
		);

		long result = rectangleQuestion.largestRectangle(points);
		assertEquals(1, result);
	}

	/**
	 * 	[
	 * 		{x: 1, y: 1},
	 * 		{x: -1, y: -1}
	 * 	] 
	 *
	 * 	{x: 1, y: 1} && {x: -1, y: -1} => 4 (correct)
	 */
	@Test
	public void testSkyline2PointsNegatives() throws Exception {
		Set<Point> points = Sets.newHashSet(
				TwoPointImpl.intialize(1, 1),
				TwoPointImpl.intialize(2, 2)
		);

		long result = rectangleQuestion.largestRectangle(points);
		assertEquals(4, result);
	}

	/**
	 * 	[
	 * 		{x: 1, y: 1},
	 * 		{x: 1, y: 10}
	 * 	] 
	 *
	 * 	{x: 1, y: 1} && {x: 1, y: 10} => 0 (correct)
	 */
	@Test
	public void testSkyline2PointsLine() throws Exception {
		Set<Point> points = Sets.newHashSet(
				TwoPointImpl.intialize(1, 1),
				TwoPointImpl.intialize(2, 2)
		);

		long result = rectangleQuestion.largestRectangle(points);
		assertEquals(0, result);
	}

	/**
	 * 	[
	 * 		{x: 1, y: 1},
	 * 		{x: 2, y: 2},
	 * 		{x: 3, y: 4}
	 * 	]
	 *
	 * 	{x: 1, y: 1} && {x: 2, y: 2} => 1
	 * 	{x: 1, y: 1} && {x: 3, y: 4} => 6 (correct)
	 * 	{x: 2, y: 2} && {x: 3, y: 4} => 2 	
	 */
	@Test
	public void testSkyline3Points() throws Exception {
		Set<Point> points = Sets.newHashSet(
				TwoPointImpl.intialize(1, 1),
				TwoPointImpl.intialize(2, 2)
		);

		long result = rectangleQuestion.largestRectangle(points);
		assertEquals(6, result);
	}

	/**
	 * 	[
	 * 		{x: 1, y: 1},
	 * 		{x: 2, y: 2},
	 * 		{x: 3, y: 4},
	 * 		{x: 2, y: 4}
	 * 	]
	 *
	 * 	{x: 1, y: 1} && {x: 2, y: 2} => 1
	 * 	{x: 1, y: 1} && {x: 3, y: 4} => 6 (correct)
	 * 	{x: 1, y: 1} && {x: 2, y: 4} => 3 	
	 * 	{x: 2, y: 2} && {x: 3, y: 4} => 2
	 * 	{x: 2, y: 2} && {x: 2, y: 4} => 0
	 * 	{x: 3, y: 4} && {x: 2, y: 4} => 0 	
	 */
	@Test
	public void testSkyline4Points() throws Exception {
		Set<Point> points = Sets.newHashSet(
				TwoPointImpl.intialize(1, 1),
				TwoPointImpl.intialize(2, 2)
		);

		long result = rectangleQuestion.largestRectangle(points);
		assertEquals(6, result);
	}
}