package week02.array;

public class Arr01 {
    public static void main(String[] args) {
        //배열생성
        int[] intArray = new int[3];
        boolean[] boolArray = new boolean[3]; //초기값 false
        String[] stringArray = new String[3];

        //선언먼저
        int[] intArra2;
        intArra2 = new int[3];

        //단건 조회
        System.out.println(intArray[1]);

        //다건 조회
        for (int i =0; i < intArra2.length;i++){
            System.out.println(intArra2[i]);
        }
    }
}
