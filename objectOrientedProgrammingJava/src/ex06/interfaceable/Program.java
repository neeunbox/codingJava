package ex06.interfaceable;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        FileInputStream fis = new FileInputStream("src/ex06/interfaceable/setting.txt");
        Scanner scan = new Scanner(fis);
        String className = scan.nextLine();
        scan.close();
        fis.close();


        Class<?> clazz = Class.forName(className);

        A a = new A(); // A 클래스도 제네릭 타입을 사용하도록 수정

        Constructor<?> constructor = clazz.getConstructor();

        X x = (X) constructor.newInstance(); // 생성자를 이용하여 인스턴스 생성

        a.setX(x);
        a.print();
    }
}
