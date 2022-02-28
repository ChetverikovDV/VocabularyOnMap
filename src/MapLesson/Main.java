package MapLesson;

import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static  void main(String[] args){

        Vocabulary generate = new Vocabulary();                              // Там словарь
        HashMap<String, String> map = generate.generateMap();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добавим слово ");                                // добавляем пару (вынести в класс)
        String keyWord = scanner.next();
        System.out.println("Добавим перевод ");
        String value = scanner.next();
        map.put(keyWord, value);

        System.out.println(map);
        System.out.println("Удалим стол");                                    // это все
        map.remove("стол");                                              // удаляем стол
        System.out.println(map);                                             // это все


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
