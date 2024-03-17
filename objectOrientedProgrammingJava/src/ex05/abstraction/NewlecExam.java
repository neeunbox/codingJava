package ex05.abstraction;

public class NewlecExam extends Exam{

    // 컴퓨터 과목
    private int com;

    // 생성자
    public NewlecExam() {
        this(0,0,0,0);
    }

    // 셍상자 오버로드
    public NewlecExam(int kor, int eng, int math, int com) {
        super(kor, eng, math);
        this.com = com;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }
    

    @Override
    public int total() {
        int total = onTotal() + com;
        return total;
    }

    @Override
    public float avg() {
        return total() / 4.0f;
    }


}
