package week04.homework;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;

        while (!calculateEnded) {
            try {
                calculateEnded=CalculatorApp.start();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        //구현 2.
    }
}
