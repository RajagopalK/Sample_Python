package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.java.Main;

public class Multiply {

	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void multiply() {
		Main main = new Main(2, 4, 8);
		Assert.assertEquals(64, main.multiply());
	}
}
