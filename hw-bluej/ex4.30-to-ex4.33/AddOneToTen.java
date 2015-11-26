public class AddOneToTen {
	public static void main(String[] args) {
		int n = 0;
		int total = 0;
		
		while (n <= 10) {
			total = total + n;
			n++;
		}
		
		System.out.println(total);
	}
}