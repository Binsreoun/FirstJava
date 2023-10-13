package week02.collection;

import java.util.LinkedList;

public class Col02 {
    public static void main(String[] args) {
        // LinkedList 기본적 기능은 -> ArrayList와 동일 (조회 느림,추가 빠름)

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(3);

        System.out.println(linkedList.toString());

        linkedList.add(200);
        System.out.println(linkedList.toString());

        linkedList.add(2,4);
        System.out.println(linkedList.toString());

        linkedList.set(1,30);
        System.out.println(linkedList.toString());

        linkedList.remove(1);
        System.out.println(linkedList.toString());

        linkedList.clear();
        System.out.println(linkedList.toString());
    }
}
