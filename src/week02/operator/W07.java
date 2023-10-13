package week02.operator;

public class W07 {
    //기타연산자

    public static void main(String[] args) {
        //1.형변환연산자
        int intNumber = 93 + (int) 98.8;
        System.out.println(intNumber);

        double doubleNumber = (double) 93 + 98.8;
        System.out.println(doubleNumber);

        //2.삼항연산자(비교연산자와 항상 함께 쓰인다)
        int x = 1;
        int y = 9;
        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x != y) ? "정답" : "오답";
        System.out.println(s);

        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x<y) ? x:y;
        System.out.println(min);
    }
}
