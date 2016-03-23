import java.util.Scanner;

public class Sentence {
	
	public static void main(String[] args) {
		
		reverse();
	}
	
	
	public static void reverse() {
		
		Scanner input = new Scanner(System.in);
				
		String sentence = input.nextLine();
		
		String[] words = sentence.split(" ");
		
		Stack stack = new Stack(words.length);
		
		try {
			for (String x : words) {
				stack.push(x);
			}

		} catch (Exception e) {

		}
		
		String[] reversed = new String[words.length];
		
		try {
			for (int i = 0; i < words.length; i++) {
				reversed[i] = stack.pop();
			}	
		} catch (Exception e) {
			
		}
		
		for (int i = 0; i < reversed.length; i++) {
			if (reversed[i].contains(".")) {
				reversed[i] = "." + reversed[i].substring(0, reversed[i].length() - 1);
			}
			else if (reversed[i].contains(",")) {
				reversed[i] = "," + reversed[i].substring(0, reversed[i].length() - 1);
			}
			else if (reversed[i].contains("!")) {
				reversed[i] = "!" + reversed[i].substring(0, reversed[i].length() - 1);
			}
			else if (reversed[i].contains("?")) {
				reversed[i] = "?" + reversed[i].substring(0, reversed[i].length() - 1);
			}
		}

		
		for (String x : reversed) {
			System.out.print(x + " ");
		}
		
	}
}