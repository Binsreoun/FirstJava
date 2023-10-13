package week02.operator;

public class W08 {
    //연산자의 우선순위 : 산술>비교>논리>대입 *단 괄호로 감싸주면 괄호안 연산이 우선으로 계산
    public static void main(String[] args) {
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z;
        System.out.println(result);
        System.out.println("----------");

        result = x + 10 < y && y < z;
        System.out.println(result);
        System.out.println("----------");

        result = x+ 2 * 3>y;
        System.out.println(result);
        System.out.println("----------");



    }
}
