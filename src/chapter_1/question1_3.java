package chapter_1;

public class question1_3 {
	/**
	 * check if a could transfer to b
	 * @param a 
	 * @param b
	 * @return true on could, otherwise false
	 */
	public static boolean check(String a, String b){
		if(a.length() != b.length()){
			return false;
		}
		short [] mapA = mapping(a);
		short [] mapB = mapping(b);
		
		return mapEqual(mapA, mapB);
	}
	
	private static short [] mapping(String a){
		short [] map = new short['z' - 'A']; 
		for(short i : map){
			i = 0;
		}
		for( char c : a.toCharArray()){
			map[c - 'A'] ++;
		}
		return map;
	}
	
	private static boolean mapEqual(short [] leftMap, short [] rightMap){
		for(int i = 0 ; i < leftMap.length ; i ++){
			if(leftMap[i] != rightMap[i]){
				return false;
			}
		}
		return true;
	}
}
