package chapter_1;

public class question1_8 {
	
	public static boolean isSubString(String a, String b){
		return true;
	}
	public static boolean check(String a, String b){
		if(a.length() != b.length()){
			return false;
		}
		String c = a + a;
		return isSubString(c, b);
	}
}
