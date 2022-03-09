package MapLesson;

import java.util.*;

public class Actions {
    public void addNewPair(TreeMap<String, String> map, String key, String value) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите слово(англ.)");
            key = scanner.next().toLowerCase(Locale.ROOT);
            if (key.equals("0"))
                break;
            System.out.println("Введите перевод(рус.)");
            value = scanner.next().toLowerCase(Locale.ROOT);
            if (map.containsKey(key)){
                value = map.get(key)+ "," +value;
                System.out.println(Arrays.toString(value.split(","))); // Пробник
            }
            map.put(key, value);
            System.out.println(map);
        }
    }
}
