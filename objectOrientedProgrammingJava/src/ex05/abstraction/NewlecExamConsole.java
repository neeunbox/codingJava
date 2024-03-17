package ex05.abstraction;

import java.util.Scanner;

public class NewlecExamConsole extends ExamConsole {

    @Override
    protected void onPrint(Exam exam) {
        NewlecExam newlecExam = (NewlecExam)exam;
        int com = newlecExam.getCom();
        System.out.printf("컴퓨터 : %3d\n", com);
    }

    @Override
    protected void onInput(Exam exam) {

        NewlecExam newlecExam = (NewlecExam)exam;

        Scanner scan = new Scanner(System.in);

        int com;

        do{
            System.out.print("컴퓨터 :");
            com = scan.nextInt();
        
            if (com<0 || 100<com) {					
                System.out.println("성적범위(0~100)을 벗어났습니다.");
            }
            
        }while(com<0 || 100<com);

        newlecExam.setCom(com);

    }

    @Override
    protected Exam makeExam() {
        return new NewlecExam();
    }

}
