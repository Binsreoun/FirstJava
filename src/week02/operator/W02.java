package week02.operator;

public class W02 {
    public static void main(String[] args) {
        //사칙연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);//몫만 리턴한다
        System.out.println(2 / 4);
        System.out.println(4 % 2);//나머지를 리턴한다
        System.out.println(5 % 2);
        System.out.println("----------------");
        //우선순위 연산
        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);
        System.out.println(2 + (2 * 2));

        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

    }
}
