package MapLesson;
import java.util.*;

public class Main {
    public static  void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("hat", "шляпа");
        map.put("ball", "мяч");
        map.put("sword", "меч");
        map.put("ant", "муравей");
        map.put("exit", "выход");
        map.put("стол", "table");
        map.put("table", "стол");

        Scanner scanner = new Scanner(System.in);

        String temp = scanner.next();                                         // Вводим слово

        if (!map.containsKey(temp) && !map.containsValue(temp)){              // Проверка наличия
            System.out.println("Не найдено");                                 // по обоим параметрам
        }

        if (map.containsKey(temp)) {                                          // Вывод значения по ключу
            System.out.println(map.get(temp));
        }

        String engKey = "";                                                   // Поиск ключа по значению
        for (String k : map.keySet()){
            if (map.get(k).equals(temp) ) {                                   // написать проверку на наличие значеничя
                engKey = k;                                                   // если нет, не начинать
                break;
            }
        }
        System.out.println(engKey);

    }
}
