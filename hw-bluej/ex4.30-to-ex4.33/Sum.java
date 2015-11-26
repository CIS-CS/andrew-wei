public class Sum {
	public static void main(String[] args) {
		System.out.println(sum(1, 10));
	}
	
	public static int sum(int a, int b) {
		int n = a;
		int total = 0;
		
		while (n <= b) {
			total = total + n;
			n++;
		}
		
		return total;
	}
}