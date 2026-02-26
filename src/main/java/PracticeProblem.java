/**
 * Lesson: String Manipulation
 * Author: Kaveeshan
 * Date Created: Feb 26, 2026
 * Date Last Modified: Feb 26, 2026
 */
import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
	}

	public static void q1() {
		//Write question 1 code here
		 Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a sentence: ");
        String word = scanner.nextLine();
		System.out.println(word.contains("on"));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input the word mango: ");

		String word = s.nextLine();
		boolean ismango = word.toLowerCase().equals("mango");
		System.out.print(ismango);
		System.out.println();
	}

	public static void q3() {
		//Write question 3 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a word: ");
        String word = scanner.nextLine();

        System.out.print("Input a letter: ");
        String letter = scanner.nextLine();

      
        int firstIndex = word.indexOf(letter);
        int lastIndex = word.lastIndexOf(letter);

        System.out.println(firstIndex);
        System.out.println(lastIndex);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a sentence: ");
        String sentence = scanner.nextLine();

        int length = sentence.length();

        System.out.println("Your sentence is " + length + " characters long");

	}

	public static void q5() {
		//Write question 5 code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Input a word to replace: ");
        String wordToReplace = scanner.nextLine();

        System.out.print("What word would you like to replace it with: ");
        String replacementWord = scanner.nextLine();

        String newSentence = sentence.replace(wordToReplace, replacementWord);

        System.out.println(newSentence);

	}

	public static void q6() {
		//Write question 6 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a sentence: ");
        String sentence = scanner.nextLine();

        sentence = sentence.trim();

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());

	}

	public static void q7() {
		//Write question 7 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a word: ");
        String word = scanner.nextLine();


        String firstFour = word.substring(0, 4);

        String lastFour = word.substring(word.length() - 4);

        System.out.println(firstFour);
        System.out.println(lastFour);
	}

	public static void q8() {
		//Write question 8 code here
	}

}
