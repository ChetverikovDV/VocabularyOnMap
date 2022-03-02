package MapLesson;

import java.util.HashMap;
import java.util.Scanner;

public class Actions {
    public void addNewPair(HashMap<String, String> map, String key, String value) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите слово(англ.)");
            key = scanner.next();
            if (key.equals("0"))
                break;
            System.out.println("Введите перевод(рус.)");
            value = scanner.next();
            map.put(key, value);
            System.out.println(map);
        }
    }
}
