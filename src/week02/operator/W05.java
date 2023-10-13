package week02.operator;

//대입연산자
public class W05 {

    public static void main(String[] args) {
        //기본대입연산자
        int number = 10;
        number = number + 2;
        System.out.println(number);

        number = number - 2;
        System.out.println(number);

        number = number * 2;
        System.out.println(number);

        number = number / 2;
        System.out.println(number);

        number = number % 2;
        System.out.println(number);
        System.out.println("------------");

        //복합대입연산자
        number = 10;
        number += 2;
        System.out.println(number);

        number -= 2;
        System.out.println(number);

        number *= 2;
        System.out.println(number);

        number /= 2;
        System.out.println(number);

        number %= 2;
        System.out.println(number);
        System.out.println("------------");

        //++ --
        number++;
        System.out.println(number);

        number--;
        System.out.println(number);

    }

}
