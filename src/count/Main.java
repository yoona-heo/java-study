package count;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 입력받은 문자열의 자음과 모음의 개수를 계산하여 출력

		System.out.println("문자를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();

		char[] vowelArray = { 'a', 'e', 'i', 'o', 'u' };
		int vowelCount = 0;

		for (int x = 0; x <= text.length() - 1; x++) {
			for (int y = 0; y <= vowelArray.length-1; y++) {
				if (text.charAt(x) == vowelArray[y]) {
					vowelCount++;
				}
			}

		}

		System.out.print(text + "의 자음 수: " + vowelCount + ", 모음 수: " + (text.length() - vowelCount));
		
		// 자음 consonant
		// 모음 vowel
	}

}
