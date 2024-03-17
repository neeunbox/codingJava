package ex05.abstraction;

import java.util.Scanner;

public abstract class ExamConsole {
	
	private ExamList list = new ExamList();
	

	// 성적 출력 
	public void print() {
		this.print(list.size());
	}
	

	// 성적 출력 오버로드
	public void print(int size) {
		// 성적 출력 부분 
		System.out.println("┌────────────────────────────────┐");
		System.out.println("│          성적 출력             │");
		System.out.println("└────────────────────────────────┘");
		
		
		for(int i=0; i<size; i++) {
			
			Exam exam = list.get(i);
		
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			
			// total 사용
			int total = exam.total();
			
			// avg 사용
			float avg = exam.avg();
					
			System.out.printf("국어 : %3d\n", kor);
			System.out.printf("영어 : %3d\n", eng);
			System.out.printf("수학 : %3d\n", math);

			// 이벤트 메소드 다른 과목 입력부분 확장
			onPrint(exam);
	
			
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("─────────────────────────────────");
		}
	}


	// 생적 입력
	public void input() {
		// 성적 입력 부분
		Scanner scan = new Scanner(System.in);


		System.out.println("┌────────────────────────────────┐");
		System.out.println("│          성적 입력             │");
		System.out.println("└────────────────────────────────┘");
		
			
		int kor, eng, math;
		
			do{
				System.out.print("국어 :");
				kor = scan.nextInt();
			
				if (kor<0 || 100<kor) {					
					System.out.println("성적범위(0~100)을 벗어났습니다.");
				}
				
			}while(kor<0 || 100<kor);
			
			do{
				System.out.print("영어 :");
				eng = scan.nextInt();
			
				if (eng<0 || 100<eng) {					
					System.out.println("성적범위(0~100)을 벗어났습니다.");
				}
				
			}while(eng<0 || 100<eng);
			
			do{
				System.out.print("수학 :");
				math = scan.nextInt();
			
				if (math<0 || 100<math) {					
					System.out.println("성적범위(0~100)을 벗어났습니다.");
				}
				
			}while(math<0 || 100<math);
			
			
			// 자식에서 만들어 주세요. (추상메세드)
			Exam exam = makeExam();

			exam.setKor(kor);
			exam.setEng(eng);
			exam.setMath(math);

			// 이벤트 함수 다른 과목 입력 부분 확장
			onInput(exam);
			
			// 데이터 추가
			list.add(exam);
		}


	// 자식에서 출력하는 부분 확장 한다.
	protected abstract void onPrint(Exam exam);


	// 자식에서 입력하는 부분 확장 한다.
	protected abstract void onInput(Exam exam);


	// 자식에서 만들수 있게 추상 메스드화 한다.
	protected abstract Exam makeExam();

}
