package chapter_1;

public class question1_1 {
	/**
	 * check if all characters in input are unique
	 * using hash-map like 
	 * @param input: input string
	 * @return true on unique, otherwise false
	 */
	public static boolean check(String input){
		if(input.isEmpty() || input.length() <= 1){
			return true;
		}
		if(input.length() > 26){
			return false;
		}
		int [] Map = new int[26];
		for(int i : Map){
			i = 0;
		}
		for( char s : input.toCharArray()){
			if(Map[Character.toLowerCase(s) - 'a'] == 0){
				Map[Character.toLowerCase(s)-'a'] = 1;
			}
			else{
				return false;
			}
		}
		return true;
	}

}
