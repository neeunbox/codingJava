package ex05.abstraction;

public abstract class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public Exam() {
		this(0, 0, 0);
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	// 합계 
	public abstract int total();

	// 자식만 접근 가능
	protected int onTotal() {
		return kor + eng + math;
	}

	// 평균
	public abstract float avg();

}
