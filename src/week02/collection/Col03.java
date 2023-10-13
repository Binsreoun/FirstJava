package week02.collection;

import java.util.Stack;

public class Col03 {

    public static void main(String[] args) {
        //Stack 바구니, 처음넣은게 제일 밑
        Stack<Integer> intStack = new Stack<Integer>();

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        while (!intStack.isEmpty()){
            System.out.println(intStack.pop());
        }

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);
        //peak
        System.out.println(intStack.peek());
        //size
        System.out.println(intStack.size());
    }
}
