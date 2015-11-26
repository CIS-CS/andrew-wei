public class MultiplesOfFive {
	public static void main(String[] args) {
		int n = 10;
		
		while (n <= 95) {
			if (n % 5 == 0) {
				System.out.println(n);
			}
			
			n++;
		}
	}
}