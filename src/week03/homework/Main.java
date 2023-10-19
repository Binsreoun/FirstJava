package week03.homework;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operations = sc.nextLine();
        int first = sc.nextInt();
        int second = sc.nextInt();

        if(Objects.equals(operations, "+")){
            Calculator calculator = new Calculator(new AddOperation());
            System.out.println(calculator.calculate(first,second));
        }else if(Objects.equals(operations, "-")){
            Calculator calculator = new Calculator(new SubstractOperation());
            System.out.println(calculator.calculate(first,second));
        }else if(Objects.equals(operations, "*")){
            Calculator calculator = new Calculator(new MultiplyOperation());
            System.out.println(calculator.calculate(first,second));
        }else if(Objects.equals(operations, "/")){
            Calculator calculator = new Calculator(new DivideOperation());
            System.out.println(calculator.calculate(first,second));
        }else if(Objects.equals(operations, "%")){
            System.out.println(first % second);
        }


    }
}
