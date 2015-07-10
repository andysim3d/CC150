package chapter_4;

public class question4_3 {
	
	
	public static Btree createMin(int [] arr){
		return question4_3.create(arr, 0, arr.length - 1);
	}
	
	private static Btree create(int [] arr, int start, int end){
		
		if(start < end){
			return null;
		}
		int mid = (start + end) / 2;
		Btree nod = new Btree(arr[mid]);
		nod.setLeft(create(arr, start, mid - 1));
		nod.setRight(create(arr, mid + 1, end));
		return nod;
	}
}
