public class HelloWorld {
	public static void main(String[] args) {
		
		int n = 0;
		
		try {
			n = Integer.parseInt(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No input found. Try again.");
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Must be an even integer.");
		}
		
		if (n % 2 == 0) {
			for (int i = 0; i < n; i++) {
				System.out.println("Hello World!");
			}
		} else {
			System.out.println("Invalid input. Must be an even integer.");
		}
	}
}