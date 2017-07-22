package com.darkness.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.darkness.model.Model;

public class ModelTest {
	private Model mModel;

	@Before
	public void setUp() {
		mModel = new Model();
	}

	@Test
	public void testAddNumber() {
		int expectedValue = 5;
		int actualValue = mModel.addNumber(2, 3);
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testCheckLogin() {
		boolean expectedValue = true;
		boolean actualValue = mModel.checkLogin("darkness", "123456");

		assertEquals(expectedValue, actualValue);

		assertTrue(mModel.checkLogin("darkness", "123456"));
		assertFalse(mModel.checkLogin("nguyenvantra", "abcabc"));
	}

	@Test(expected = NullPointerException.class)
	public void testAddArrayIndex() {
		int[] arr = { 1, 2, 3, 4 };
		//int[] arr = null;

		int[] expectedArrayValue = { 3, 4, 5, 6 };
		int[] actualArrayValue = mModel.addArrayIndex(arr);

		assertArrayEquals(expectedArrayValue, actualArrayValue);
	}
}
