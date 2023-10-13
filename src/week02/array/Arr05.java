package week02.array;

public class Arr05 {
    public static void main(String[] args) {

        //String 기능
        String str = "ABCD";

        //length
        int strLength = str.length();
        System.out.println(strLength);

        //charAt
        char strChar = str.charAt(1);
        System.out.println(strChar);

        //substring
        String strSub = str.substring(0,3);
        System.out.println(strSub);

        //equals
        String newStr = "ABCD";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        //toCharArray
        char[] strCharArray = str.toCharArray();

        //char[] to string
        char[] charArray = {'A','B','C'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);
    }
}
