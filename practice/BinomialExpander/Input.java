import java.util.Scanner;

public class Input {
	
	public static void main(String[] args) {
		
		Input input = new Input();
		input.run();
		
	}
	
	public void run() {
		
		System.out.println("Binomial Expander in the form of (a + b)^n\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input your a term:");
		String x = input.next();
		
		System.out.println("Input your b term:");
		String y = input.next();
		
		System.out.println("Input your n term:");
		
		int n = -1;
		
		while (n < 0) {
			try {
			 	String exp = input.next();
				n = Integer.parseInt(exp);
				
				while (n < 0) {
					System.out.println("Please enter a postitive integer.");
					exp = input.next();
					n = Integer.parseInt(exp);
				}
				
			}
			catch (NumberFormatException e) {
				System.out.println("Please enter a positive integer:");
			}
		}
		
		Expander b = new Expander();
		
		System.out.println("\nExpanding (" + x + " + " + y + ")^" + n + ", gives:\n" + b.expand(x, y, n));
	}
}