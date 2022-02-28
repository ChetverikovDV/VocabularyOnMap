package MapLesson;
import java.util.*;

public class Main {
    public static  void main(String[] args){

        Vocabulary generate = new Vocabulary();
        HashMap<String, String> map = generate.generateMap();

        Scanner scanner = new Scanner(System.in);

        String temp = scanner.next();                                         // Вводим слово

        if (!map.containsKey(temp) && !map.containsValue(temp)){              // Проверка наличия
            System.out.println("Не найдено");                                 // по обоим параметрам
        }

        if (map.containsKey(temp)) {                                          // Вывод значения по ключу
            System.out.println(map.get(temp));
        }

        if (map.containsValue(temp)) {                                       // Вывод значения по ключу
            Actions key = new Actions();
            System.out.println(key.findKey(map, temp));
        }
    }
}
