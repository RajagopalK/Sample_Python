package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.java.Main;

public class Divisible {

	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void divideBy() {
		Main main = new Main(5, 2, 3);
		Assert.assertEquals(0, main.divide());
	}
}
