package primeNumber;

public class Main {
	public static void main(String[] args) {
		// 2부터 100까지 소수 구하기
		int count = 0;
		int[] pns = new int[100];
		for (int x = 2; x < 101; x++) {
			boolean isSub = false;
			for (int y = 2; y < x; y++) {
				if (x % y == 0) {
					isSub = true;
					break;
				}
			}
			if (isSub == false) {
				pns[count] = x;
				count++;
			}
		}
		
		System.out.print("소수: ");
		for(int i = 0; i < count; i++) {
			System.out.print(pns[i]);
			if(i != count-1) {
				System.out.print(", ");
			} else {
				System.out.print('\n');
			}
		}
		
		System.out.print("소수 총 개수: " + count);
	}
}
