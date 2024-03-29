package ex04.IsolateUIcode;

public class ExamList {
	private Exam[] exams;
    private int current;
	
    // 생성자 중복코드 제거
	public ExamList() {
		this(3);
	}
	
	// 생성자 오버로드
	public ExamList(int size) {
		exams = new Exam[size];
		current = 0;
	}

	// 출력값 처리 분리
	public Exam get(int i) {
		return  this.exams[i];
	}

	// 입력값 처리 분리
	public void add(Exam exam) {
		// 1.배열의 크기가 capacity 와 같은가?
		System.out.println("array length :" + exams.length);
		System.out.println("current :" + current);
		if (exams.length == current) {
			// 2.크기가 5개 정도 더 큰 새로운 배열을 생성하시오.  
			Exam[] temp	= new Exam[current + 5];
			// 3.값을 옮겨준다.
			for(int i=0; i<current; i++) {
				temp[i] = exams[i];
			}
			// 4.새로만든 배열을 참조하도록 한다.
			exams = temp;
		}
		exams[current] = exam;
		current++;
	}

	// 입력받은 배열의 크기를 돌려준다.
	public int size() {
		return current;
	}
	
}
