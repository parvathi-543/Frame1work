package testNGListner;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListnersDemo3 {
	@Test
	public void test7() {
		System.out.println("python ");
	}
	@Test
	public void test8() {
		System.out.println("java ");
	}
	@Test
	public void test9() {
		System.out.println("c ");
		//Assert.assertTrue(false);
	}
	@Test
	public void test10() {
		System.out.println("c++ ");
	}
	@Test
	public void test11() {
		System.out.println("ruby ");
		throw new SkipException("this method is skipped");
	}
}