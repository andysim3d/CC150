package test;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter_1.question1_1;
import chapter_1.question1_2;
import chapter_1.question1_3;
import chapter_1.question1_4;
import chapter_1.question1_5;

public class chapter1Test {

	@Test
	public void question1() {
		assertTrue(question1_1.check("abcdefghijklmnoPqrstuvwxyz"));
		assertFalse(question1_1.check("aA"));
	}
	
	@Test
	public void question2(){
		String input = "abcdefg";
		char [] inp = input.toCharArray().clone();
		StringBuffer sb = new StringBuffer(input);
		char [] res = sb.reverse().toString().toCharArray().clone();
		question1_2.reverse(inp);
		assertTrue(inp.length == res.length);
		for(int i = 0 ; i < inp.length ; ++i){
			assertTrue(inp[i] == res[i]);
		}
	}
	

	@Test
	public void question3() {
		assertTrue(question1_3.check("fuck", "fcuk"));
		assertFalse(question1_3.check("aA","ab"));
	}
	

	@Test
	public void question4() {
		String a = "hello world";
		assertTrue(question1_4.transfer(a).equals("hello%20world"));
		assertFalse(question1_4.transfer(a).equals(a));
	}

	@Test
	public void question5() {
		String a = "aabcccccaaa";
		assertTrue(question1_5.compress(a).equals("a2b1c5a3"));
		assertTrue(question1_4.transfer("abcd").equals("abcd"));
	}
}
