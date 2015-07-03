package chapter_1;

public class question1_2 {

	/**
	 * reverse a char [] with O(n) time-complicity and O(1) space-complicity 
	 * @param str input string
	 */
	public static void reverse(char[] str){
		if(str == null){
			return;
		}
		int start = 0;
		int end = 0;
		//
		end = str.length -1;
		while(start < end){
			char tmp = str[start];
			str[start] = str[end];
			str[end] = tmp;
			start ++;
			end --;
		}
		return;
	}
}
