package ex01.grade.calculation.division;

import java.util.Scanner;

public class StructuredProgram {


	static final int SIZE = 3;
	
	public static void main(String[] args) {
		
		int[] korList = new int[SIZE];
		
		int menu; //1:INPUT, 2:PRINT, 3:EXIT
		
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3;		
		
		//라벨사용
		종료: 
		while(true) {	
			menu = inputMenu();
			
			// switch break 는 switch 문만 벗어난다.
			switch(menu) {
			case MENU_INPUT:
				inputKors(korList);
				break;
			case MENU_PRINT:
				printKors(korList);
				break;
			case MENU_EXIT:
				// 라벨사용
				break 종료;
			default:
				System.out.println("입력 오류 1~3 까지만 입력할 수 있습니다.");
			}
			
		}
		System.out.println("Good bye~");

	}
	
	// 메뉴입력 
	static int inputMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		// 메인 메뉴 부분
		System.out.println("┌────────────────────────────────┐");
		System.out.println("│          메인 메뉴                │");
		System.out.println("└────────────────────────────────┘");
		System.out.println("\t1.성적입력");
		System.out.println("\t2.성적출력");
		System.out.println("\t3.종료");
		System.out.print("\t선택>");
		int menu = scan.nextInt();
		
		return menu;
	}
	
	
	// 성적입력
	static void inputKors(int[] kors) {
		
		Scanner scan = new Scanner(System.in);
		int kor;
		
		// 성적 입력 부분
		System.out.println("┌────────────────────────────────┐");
		System.out.println("│          성적 입력                │");
		System.out.println("└────────────────────────────────┘");
		
		for(int i=0; i<SIZE; i++) {
			do{
				System.out.printf("국어%d:", i+1);
				kor = scan.nextInt();
			
				if (kor<0 || 100<kor) {					
					System.out.println("성정범위(0~100)을 벗어났습니다.");
				}
				
			}while(kor<0 || 100<kor);
			kors[i] = kor;
		} 
	}
	
	// 성적출력
	static void printKors(int[] kors) {

		int total = 0;
		float avg;
		
		// 성적 출력 부분 
		System.out.println("┌────────────────────────────────┐");
		System.out.println("│          성적 출력                │");
		System.out.println("└────────────────────────────────┘");
		
		// 성적 계산 
		for(int i=0; i<SIZE; i++)
			total += kors[i];

		// 평균 계산
		avg =  total / 3.0f;

		
		for(int i=0; i<SIZE; i++) {				
			System.out.printf("국어%d : %3d\n", i+1, kors[i]);
		}
		
		System.out.printf("총점 : %3d\n", total);
		System.out.printf("평균 : %6.2f\n", avg);
	}
}
