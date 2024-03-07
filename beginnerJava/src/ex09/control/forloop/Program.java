package ex09.control.forloop;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		
		int kor1, kor2, kor3;
		int total;
		float avg;
				
		Scanner scan = new Scanner(System.in);
		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		while(true) {	
			// 성적 입력 부분
			System.out.println("┌────────────────────────────────┐");
			System.out.println("│          성적 입력                │");
			System.out.println("└────────────────────────────────┘");
			
			// kor1 input
			do{
				System.out.print("국어1:");
				kor1 = scan.nextInt();
			
				if (kor1<0 || 100<kor1) {					
					System.out.println("성정범위(0~100)을 벗어났습니다.");
				}
				
			}while(kor1<0 || 100<kor1);

			// kor2 input
			do{
				System.out.print("국어2:");
				kor2 = scan.nextInt();
				
				if (kor2<0 || 100<kor2) {					
					System.out.println("성정범위(0~100)을 벗어났습니다.");
				}
				
			}while(kor2<0 || 100<kor2);
			
			// kor3 input
			do{
				System.out.print("국어3:");
				kor3 = scan.nextInt();
				
				if (kor3<0 || 100<kor3) {					
					System.out.println("성정범위(0~100)을 벗어났습니다.");
				}
				
			}while(kor3<0 || 100<kor3);
			
			// 성적 출력 부분 
			System.out.println("┌────────────────────────────────┐");
			System.out.println("│          성적 출력                │");
			System.out.println("└────────────────────────────────┘");
			
			total = kor1 + kor2 + kor3;
			avg = total / 3.0f;
	
			// 3, 2, 1
//			for(int i=0; i<3; i++) {				
//				System.out.printf("국어%d : %3d\n", 3-i, kor1);
//			}
			
			for(int i=0; i<3; i++) {				
				System.out.printf("국어%d : %3d\n", i+1, kor1);
			}
			
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
		}
	}
}
