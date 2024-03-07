package ex13.control.continuebreak;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 스페이스로 구분해서 5개 입력하세요: ");
		
		// 3 Enter, 34 5 6 234 345 54 45 Enter

		while(scan.hasNext()) {
			n = scan.nextInt();
			
			// 10보다 작업 값은 건너 뛰고 싶어요.
			if (n < 10) 
				continue;
			
			// 300보다 크면 종료 할께요.
			if (n > 300)
				break;
			
			System.out.println(n);
		}	
	}
}
