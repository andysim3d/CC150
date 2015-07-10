package chapter_4;

/**
 * binary tree prototype
 * @author Andy
 *
 */
public class Btree {
	private Object val;
	private Btree left;
	private Btree right;
	
	public Btree( int val){
		this.setVal(val);
		setLeft(null);
		setRight(null);
	}

	public Btree getLeft() {
		return left;
	}

	public void setLeft(Btree left) {
		this.left = left;
	}

	public Btree getRight() {
		return right;
	}

	public void setRight(Btree right) {
		this.right = right;
	}

	public int getVal() {
		return (int)val;
	}

	public void setVal(Object val) {
		this.val = val;
	}
	
}
