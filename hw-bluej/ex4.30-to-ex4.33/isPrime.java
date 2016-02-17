public class isPrime {
	
	public static void main(String[] args) {
		System.out.println(isPrime(6178111));
	}
	
	public static boolean isPrime(int n) {
		int counter = 2;
		
		while (counter < n) {
			if (n % counter == 0) {
				return false;
			}
			else {
				counter++;
			}
		}
		
		return true;
	}
}