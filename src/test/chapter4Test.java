package test;

import static org.junit.Assert.*;

import org.junit.Test;
import chapter_4.*;

public class chapter4Test {

	@Test
	public void question4_1test() {
		Btree b = new Btree(0);
		b.setRight(new Btree(4));
		b.getRight().setRight(new Btree(10));
		assertFalse(chapter_4.question4_1.check(b));
		b.setLeft(new Btree(100));
		assertTrue(chapter_4.question4_1.check(b));
		
	}

}
