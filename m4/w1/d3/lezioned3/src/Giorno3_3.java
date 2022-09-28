
public class Giorno3_3 {

	public static void main(String[] args) {
		
		int x = 10, y = 20;
		int[] arr = {10, 20, y, 40, x};		// 10 20 20 40 10
		
		x = 50;
		y = -10;
		
		System.out.println( arr[2] + arr[arr.length-1] );
		
		update(x, arr);
		
		System.out.println( java.util.Arrays.toString(arr) );
		System.out.println( arr[2] );
		
		update2( arr );
		System.out.println( arr[2] + arr[0] );
		
	}
	
	static void update(int x, int[] arr) {
		x = 20;
		
		arr[2] = 100;
	}
	
	static void update2(int[] arr) {
		arr = new int[] {45, 67, 89};
	}

}
