package practice;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(genericUtility.ListenersImplementation.class)
public class TestNGPractice {
	
	@Test(priority = 1)
     public void sanWakes() {
		System.out.println("Good morning san");
		
	}
	@Test(priority=2)
	public void sanEats() {

		System.out.println("san eats biryani");
	}
	
	@Test(priority=3)
	public void sanMakesReels() {

		System.out.println("how  r u");
	}
	
	@Test(priority=4)
	public void sanSleeps() {
	
		System.out.println("Good night");
	}
	//@Test(priority= -2)
	//public void sanChats() {
		//System.out.println("Happy birthday");
	//}
	
	
	
	
	//@Ignore
	//@Test(priority =5)
	//public void sanWakes1() {
		//Assert.fail();
		//System.out.println("Good morning");
	//}
	
	//@Test(priority=2,dependsOnMethods = {"sanWakes","sanChats"})
	//public void saaEats() {
		//System.out.println("saa eats biryani");
	//}
}


























