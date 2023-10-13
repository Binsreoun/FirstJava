package week02.array;

public class Arr08 {

    public static void main(String[] args) {

        int[] arr = {3,2,1,5,0};

        int max = arr[0];

        for(int num: arr){
            if(num>max){
                max = num;
            }
        }

        System.out.println("최대값은 =>" + max);

        int min = arr[0];

        for(int num: arr){
            if(num<min){
                min = num;
            }
        }

        System.out.println("최대값은 =>" + min);
    }
}
