package week02;

import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Collection = sc.nextLine();
        String title = sc.nextLine();

        switch (Collection) {
            case "List":
                ArrayList<String> strList = new ArrayList<>();
                while (true){
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strList.add(text);
                }
                System.out.println("[ List로 저장된 " + title + " ]");
                int i = 1;
                for (String text2 : strList) {
                    System.out.println(i++ + ". " + text2);
                }
                break;
            case "Set":
                LinkedHashSet<String> strSet = new LinkedHashSet<>();
                while (true){
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strSet.add(text);
                }
                System.out.println("[ Set로 저장된 " + title + " ]");
                i = 1;
                for (String text3 : strSet) {
                    System.out.println(i++ + ". " + text3);
                }
                break;
            case "Map":
                Map<Integer, String> strMap = new HashMap<>();
                int number = 1;
                while (true){
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strMap.put(number++,text);
                }
                i = 1;
                System.out.println("[ Map으로장된 " + title + " ]");
                for (String value:strMap.values()) {
                    System.out.println(i++ + ". " + value);
                }
                break;
        }

    }
}
