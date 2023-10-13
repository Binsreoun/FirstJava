package week02.collection;


import java.util.HashSet;
import java.util.Set;

public class Col05 {
    public static void main(String[] args) {
        //Set(집합) : 순서X 중복X 생성자 X
        //HashSet(생성자 O), TreeSet 응용가능

        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        for (Integer value: intSet){
            System.out.println(value);
        }

        //contains
        System.out.println(intSet.contains(2));
        System.out.println(intSet.contains(5));
    }
}
