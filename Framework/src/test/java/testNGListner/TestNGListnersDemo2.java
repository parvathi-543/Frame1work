package testNGListner;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListnersDemo2 {
	@Test
	public void test1() {
		System.out.println("python ");
	}
	@Test
	public void test2() {
		System.out.println("java ");
	}
	@Test
	public void test3() {
		System.out.println("c ");
		//Assert.assertTrue(false);
	}
	@Test
	public void test4() {
		System.out.println("c++ ");
	}
	@Test
	public void test5() {
		System.out.println("ruby ");
		throw new SkipException("this method is skipped");
	}
}