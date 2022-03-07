package MapLesson;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Actions {
    public void addNewPair(HashMap<String, String> map, String key, String value) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите слово(англ.)");
            key = scanner.next().toLowerCase(Locale.ROOT);
            if (key.equals("0"))
                break;
            System.out.println("Введите перевод(рус.)");
            value = scanner.next().toLowerCase(Locale.ROOT);
            if (map.containsKey(key)){
                value = map.get(key)+ "," +value;            //тупо приклеил
            }
            map.put(key, value);
            System.out.println(map);
        }
    }
}
