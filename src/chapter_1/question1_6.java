package chapter_1;

public class question1_6 {

	public static void rotate(short [] [] imageMat){
		
		// if 1 * 1, no need to rotate;
		if(imageMat.length <=1 ){
			return ;
		}
		int length = imageMat.length;
		
		//Horizontal rotate
		for(int i = 0 ; i < length / 2; ++i){
			for( int j = 0 ; j < length ; ++j){
				
				short tmp = imageMat[length - i - 1][j];
				imageMat[length - i - 1][j] = imageMat[i][j];
				imageMat[i][j] = tmp;
			}
		}
		
		//
		for(int i = 0 ; i < length ; ++i){
			for(int j = i ; j < length ; ++ j){

				short tmp = imageMat[i][j];
				imageMat[i][j] = imageMat[j][i];
				imageMat[j][i] = tmp;
				
			}
		}
		
		return;		
	}
}
