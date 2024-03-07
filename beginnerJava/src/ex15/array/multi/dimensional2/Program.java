package ex15.array.multi.dimensional2;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		// 2차원 구현하기
		int[][] kors = new int[3][3];
		int total = 0;
		float avg;
		int menu;
				
		Scanner scan = new Scanner(System.in);

		// 배열 초기화 
		for(int j=0; j<3; j++)
			for(int i=0; i<3; i++)
				kors[j][i] = 0;
		

		//라벨사용
		종료: 
		while(true) {	
			// 메인 메뉴 부분
			System.out.println("┌────────────────────────────────┐");
			System.out.println("│          메인 메뉴                │");
			System.out.println("└────────────────────────────────┘");
			System.out.println("\t1.성적입력");
			System.out.println("\t2.성적출력");
			System.out.println("\t3.종료");
			System.out.print("\t>");
			menu = scan.nextInt();
			
			// switch break 는 switch 문만 벗어난다.
			switch(menu) {
			case 1:
				// 성적 입력 부분
				System.out.println("┌────────────────────────────────┐");
				System.out.println("│          성적 입력                │");
				System.out.println("└────────────────────────────────┘");
				
				for(int j=0; j<3; j++)
					for(int i=0; i<3; i++) {
						do{
							System.out.printf("%d학년 국어%d:", j+1, i+1);
							kors[j][i] = scan.nextInt();
						
							if (kors[j][i]<0 || 100<kors[j][i]) {					
								System.out.println("성정범위(0~100)을 벗어났습니다.");
							}
							
						}while(kors[j][i]<0 || 100<kors[j][i]);
					} 
				
				break;
			case 2:
				// 성적 출력 부분 
				System.out.println("┌────────────────────────────────┐");
				System.out.println("│          성적 출력                │");
				System.out.println("└────────────────────────────────┘");
				
				
				for(int j=0; j<3; j++) {
					total = 0;
					avg = 0.0f;
					System.out.printf("<%d학년 국어성적>─────────────────────────────\n",j+1);
					for(int i=0; i<3; i++) { 
						total += kors[j][i];
						System.out.printf("국어%d : %3d\n", i+1, kors[j][i]);
					}
					avg =  total / 3.0f;
					
					System.out.printf("총점 : %3d\n", total);
					System.out.printf("평균 : %6.2f\n", avg);
					System.out.printf("──────────────────────────────────────────\n");
				}
				break;
			case 3:
				// 라벨사용
				break 종료;
			default:
				System.out.println("입력 오류 1~3 까지만 입력할 수 있습니다.");
			}
			
		}
		System.out.println("Good bye~");
	}
}
