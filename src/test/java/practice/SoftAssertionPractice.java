package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {
	
	@Test
	public void softAssertion() {
		String expectedFood = "Biryani";
		String actualFood = "Chicken Biryani" ;
		System.out.println("Soft assertion starts");
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualFood, expectedFood);
		s.assertTrue(actualFood.contains(expectedFood));
		System.out.println("Soft Assertion ends");
		s.assertAll();
	}
	

}
