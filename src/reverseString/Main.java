package reverseString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력받은 문자열 거꾸로 출력
		
		System.out.println("문자를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		
		for (int i = text.length()-1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}
		
		/*	
		 	간결한 방법
		  	System.out.println(new StringBuilder(text).reverse().toString());
		*/
		
	}

}
