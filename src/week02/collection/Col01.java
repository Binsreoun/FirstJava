package week02.collection;

import java.util.ArrayList;

public class Col01 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(99);
        intList.add(15);
        intList.add(3);

        //get
        System.out.println(intList.get(1));


        //set
        intList.set(1, 10);
        System.out.println(intList.get(1));

        //remove
        System.out.println(intList.get(0));
        intList.remove(0);
        System.out.println(intList.get(0));

        System.out.println(intList.toString());
        intList.clear();
        System.out.println(intList.toString());
    }
}