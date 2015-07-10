package chapter_4;

public class question4_5 {
	
	public static boolean check(Btree root){
		return checkIsBSTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private static boolean checkIsBSTree(Btree root, int Min ,int Max){
		if(root == null){
			return true;
		}
		if(root.getVal() < Max && root.getVal() >= Min){
			return checkIsBSTree(root.getLeft() , Min, root.getVal()) && 
					checkIsBSTree(root.getRight(), root.getVal(), Max);
		}
		return false;
//		
//		if(root.getLeft() == null){
//			//if left and right both are null, return true;
//			if(root.getRight() == null){
//				return true;
//			}
//			//if only has right child and right great than root, return right;
//			if(root.getRight().getVal() > root.getVal()){
//				return checkIsBSTree(root.getRight(), root.getVal(), Max);
//			}else{
//				return false;
//			}
//		}
//		
//		if(root.getRight() == null){
//			if(root.getLeft().getVal() <= root.getVal()){
//				return checkIsBSTree(root.getLeft(), Min, root.getVal());
//			}
//			else{
//				return false;
//			}
//		}
//		if((root.getLeft().getVal() <= root.getVal()) &&
//				(root.getRight().getVal() > root.getVal())){
//			return checkIsBSTree(root.getLeft(), Min, root.getVal()) && checkIsBSTree(root.getRight(), root.getVal(),Max);
//		}
//		else{
//			return false;
//		}
	}
}
