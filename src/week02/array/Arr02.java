package week02.array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        //초기화
        int[] intArr = {10,20,30,40,50};
        String[] stringArray = {"a","b","c","d","e"};

        for (int i =0; i<intArr.length;i++){
            System.out.println(i);
        }

        for(int item:intArr){
            System.out.println(item);
        }

        Arrays.fill(intArr,1);

        for(int item:intArr){
            System.out.println(item);
        }

    }
}
