package inputoutput;

import java.util.Scanner;

public class InputOutputDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type age");
        int age = sc.nextInt();
        System.out.println("type name");
        String name = sc.next();

        System.out.println("Name " + name + " age " + age);
    }
}
