package chapter_4;

public class BtreeWP extends Btree {

	private Btree parent;
	public BtreeWP(int val, Btree parent) {
		super(val);
		this.setParent(parent);
		// TODO Auto-generated constructor stub
	}
	public Btree getParent() {
		return parent;
	}
	public void setParent(Btree parent) {
		this.parent = parent;
	}
	

}
