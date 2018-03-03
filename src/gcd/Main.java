package gcd;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		//최대공약수 최소공배수
	
		System.out.println("두 정수를 입력하세요: ");
		Scanner scanner = new Scanner (System.in);
		int x = scanner.nextInt(), y = scanner.nextInt(), min = 2, nextX = x, nextY = y, gdb = 1;
		boolean isMod = true;
		if(x < y) min = x;
		else min = y;
		while(isMod) {
			isMod = false;
			for(int i = 2; i <= min; i++) {
				if(nextX % i == 0 && nextY % i == 0) {
					nextX = nextX / i;
					nextY = nextY / i;
					gdb = gdb * i;
					isMod = true;
					break;
				}
			}
		}
		
		System.out.println("최대공약수: " + gdb);
	}
}