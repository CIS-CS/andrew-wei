import java.util.Scanner;

public class Sentence {
	
	public static void main(String[] args) {
		
		reverse();
	}
	
	
	public static void reverse() {
		System.out.println("Enter a sentence of 10 or less words:");
		
		Scanner input = new Scanner(System.in);
				
		String sentence = input.nextLine();
		
		String[] words = sentence.split(" ");
		
		Stack stack = new Stack(10);
		
		try {
			for (String x : words) {
				stack.push(x);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		String[] reversed = new String[10];
		
		try {
			for (int i = 0; i < words.length; i++) {
				reversed[i] = stack.pop();
			}	
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		/*for (int i = 0; i < reversed.length; i++) {
			if (reversed[i].contains(".")) {
				reversed[i] = "." + reversed[i].substring(0, reversed[i].length() - 1);
			}
		}*/

		
		for (int i = 0; i < words.length; i++) {
			System.out.print(reversed[i] + " ");
		}
		
	}
}