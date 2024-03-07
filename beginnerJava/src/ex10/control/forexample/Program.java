package ex10.control.forexample;

public class Program {
	
	public static void main(String[] args) {
		
		int total = 0;
		
		// 1~10 까지의 합
		for(int i=0; i<10; i++ ) {
			total += 1+i;
		}

		System.out.printf("total is %d\n", total);
		
		// 초기
		total = 0;
		
		// 3~7 까지의 합 
		for(int i=0; i<5; i++) {
			total += 3+i;
		}
		
		System.out.printf("total is %d\n", total);

		
		// 초기
		total = 0;
		
		// 산수좀 하는 사람 3~7 까지의 합 
		total = 5*(3+7)/2;

		System.out.printf("total is %d\n", total);
	}
}
