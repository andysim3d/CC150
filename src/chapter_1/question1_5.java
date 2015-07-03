package chapter_1;

public class question1_5 {

	public static String compress(String a){
		if(a.isEmpty()){
			return a;
		}
		StringBuffer sb = new StringBuffer();
		int counter = 0;
		char current = a.charAt(0);
		sb.append(current);
		for(int i = 0 ; i < a.length() ; ++i){
			if(current == a.charAt(i)){
				counter ++;
				continue;
			}
			else{
				sb.append(counter);
				counter = 1;
				current = a.charAt(i);
				sb.append(current);
			}
		}
		sb.append(counter);
		
		if(sb.length() >= a.length()){
			return a;
		}		
		return sb.toString();
	}
}
