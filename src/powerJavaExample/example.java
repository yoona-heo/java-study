package powerJavaExample;

import java.util.Scanner;

/* Power JAVA Chapter 10
 * 배열을 이용하여 간단한 극장 예약 시스템을 작성하여 보자. 아주 작은 극장이라서 좌석이 10개밖에 안 된다.
 * 사용자가 예약을 하려고 하면 먼저 좌석 배치표를 보여준다. 즉 예약이 끝난 좌석은 1로, 예약이 안된 자석은 0으로 나타낸다.
 */

public class example {
	public static void main(String[] args) {
		int size = 10;
		Scanner scan = new Scanner(System.in);
		int[] seats = new int[size];
		while (true) {
			System.out.print("좌석을 예약하시겠습니까? (1 또는 0) ");
			int reserve = scan.nextInt();
			if (reserve == 0) {
				break;
			}
			if (reserve != 1 && reserve != 0) {
				System.out.println("잘못 입력하였습니다.");
				continue;
			}
			System.out.println("---------------------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			System.out.println("---------------------------------");
			/*
			for (int i = 0; i < seat.length; i++) {
				int seat = seats[i];
				System.out.print(seat + " ");
			}
			*/
			for(int seat : seats) {
				System.out.print(seat + " ");
			}
			System.out.println();
			System.out.print("몇 번째 좌석을 예약하시겠습니까? ");
			int order = scan.nextInt();
			if (seats[order - 1] != 1) {
				seats[order - 1] = 1;
				System.out.println("예약되었습니다.");
			} else {
				System.out.println("이미 예약되어있습니다. 다른 좌석을 선택해주세요.");
			}
		}
		scan.close();
	}
}
