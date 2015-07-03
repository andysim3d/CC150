package chapter_1;

public class question1_4 {
	/**
	 * change all space in string into "%20"
	 * @param a before change
	 * @return after changed
	 */
	public static String transfer(String a){
		if(a.isEmpty()){
			return a;
		}
		int length = a.length();
		for(char s : a.toCharArray()){
			//for each space, I need to change it to '%20', that will 2 character
			if(s == ' '){
				length += 2;
			}
		}
		StringBuffer sb = new StringBuffer(length);
		for(int i = 0 ; i < a.length() ; ++i){
			if(a.charAt(i) == ' '){
				sb.append("%20");
				
			}
			else{
				sb.append(a.charAt(i));
			}
		}
		return sb.toString();
		
	}
	
	
}
