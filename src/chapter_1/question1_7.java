package chapter_1;

public class question1_7 {
	public static void setZero(int [] [] Mat){
		int length = Mat.length;
		int width = Mat[0].length;
		boolean [] lenZero = new boolean[length];
		boolean [] widZero = new boolean[width];
		for(boolean b : lenZero){
			b = false;
		}
		for(boolean b : widZero){
			b = false;
		}
		for(int i = 0; i < width ; ++ i){
			for (int j = 0 ; j < length; ++ j){
				if(Mat[i][j] == 0){
					lenZero[i] = true;
					widZero[j] = true;
				}
			}
		}
		for(int i = 0 ; i < width ; ++ i){
			for( int j = 0; j < length ; ++ j){
				if(lenZero[i] || widZero[j]){
					Mat[i][j] = 0;
				}
			}
		}
	}
}
