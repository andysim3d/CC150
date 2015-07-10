package chapter_4;
/**
 * Implement a function to check if a tree is balanced 
 * For the purposes of this question, a balanced tree is 
 * defined to be a tree such that no two leaf nodes differ
 * in distance from the root by more than one
 * @author Andy
 *
 */
public class question4_1 {
	
	public static boolean check(Btree root){
		
		if(root == null ||(root.getLeft() == null && root.getRight() == null)){
			return true;
		}
		if(Math.abs( maxDepth(root.getLeft()) - maxDepth(root.getRight())) > 1){
			return false;
		}
		else{
			return true;
		}
		
	}
	
	private static int maxDepth(Btree root){
		//touch the bottom;
		if(root == null){
			return 0;
		}
		else{
			return Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight())) + 1;
		}
		
	}
	
}
