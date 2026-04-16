package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {

	
	@Test
	public void strictLevelComparision() {
		String expectedName = "Sanu";
		String actualName = "Sanu";
		System.out.println("Hard Assertion Starts");
		Assert.assertEquals(actualName, expectedName);
		Assert.assertEquals(actualName.equals(expectedName), true);
		System.out.println("Hard Assertion mid");
		Assert.assertFalse(actualName.equals(expectedName));
		Assert.assertFalse(actualName.contains(expectedName));
		System.out.println("Hard Assertion ends");
		
		
	}
}
