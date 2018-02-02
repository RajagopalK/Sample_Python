package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.java.Main;

public class Sum {


	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void sum() {
		Main main = new Main(3, 5, 8);
		Assert.assertEquals(16, main.sum());
	}
}
