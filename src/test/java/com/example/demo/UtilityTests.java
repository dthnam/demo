package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilityTests {

	@Test
	void calcShouldReturnCorrectResultWhenAddingTwoNumbers() throws Exception {
		int a = 0;
		int b = 1;

		assertEquals(1, Utility.calc(a, b, Operator.ADD));
	}

}
