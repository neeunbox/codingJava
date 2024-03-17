package ex05.abstraction;

public class NewlecExamConsole extends ExamConsole {

    @Override
    protected Exam makeExam() {
        return new NewlecExam();
    }


}
