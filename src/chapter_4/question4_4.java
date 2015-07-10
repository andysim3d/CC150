package chapter_4;

import java.util.LinkedList;

public class question4_4 {
	private LinkedList<LinkedList<Btree>> create(Btree root){
		LinkedList<LinkedList<Btree>> result = new LinkedList<LinkedList<Btree>>();
		LinkedList<Btree> tmpTree = new LinkedList<Btree>();
		if(root == null){
			return result;
		}
		tmpTree.add(root);
		while(tmpTree.isEmpty()){
			LinkedList<Btree> nextlevel = new LinkedList<Btree>();
			result.add(tmpTree);
			for(Btree bt : tmpTree){
				if(bt.getLeft() != null){
					nextlevel.add(bt.getLeft());
				}
				if(bt.getRight() != null){
					nextlevel.add(bt.getRight());
				}
			}
			tmpTree = nextlevel;
		}
		
		return result;
	}
}
