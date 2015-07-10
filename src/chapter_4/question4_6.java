package chapter_4;

public class question4_6 {
	public static Btree inorderSuc(BtreeWP node){
		
		if(node == null){
			return null;
		}
		if(node.getRight() != null){
			//notice there
			return getMostLeft(node.getRight());
		}
		else{
			Btree n = node;
			Btree x = node.getParent();
			while( x != null && x.getLeft() != n){
				n = x;
				x = ((BtreeWP)x).getParent();
			}
			return x;
		}
	}
	public static Btree getMostLeft(Btree node){
		if(node == null){
			return null;
		}
		while(node.getLeft() != null){
			node = node.getLeft();
		}
		return node;
	}
}
