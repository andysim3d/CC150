package chapter_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class chapter1Test {

	@Test
	public void test() {
		assertTrue(question1_1.check("abcdefghijklmnoPqrstuvwxyz"));
		assertFalse(question1_1.check("aA"));
	}

}
