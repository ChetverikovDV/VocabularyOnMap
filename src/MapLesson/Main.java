package MapLesson;

import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static  void main(String[] args){

        Vocabulary generate = new Vocabulary();                              // Там словарь
        HashMap<String, String> map = generate.generateMap();

        Scanner scanner = new Scanner(System.in);
        Actions action = new Actions();

        String keyWord = "";
        String value = "";

        action.addNewPair(map, keyWord, value);                               // заполняем словарь
        System.out.println(map);                                              // в цикле пока не 0

        System.out.println("Что хотим перевести? ");
        String temp = scanner.next();                                         // Вводим слово

        if (!map.containsKey(temp) && !map.containsValue(temp)){              // Проверка наличия
            System.out.println("Не найдено");                                 // по обоим параметрам
        }

        if (map.containsKey(temp)) {                                          // Вывод значения по ключу
            System.out.println(map.get(temp));
        }

        if (map.containsValue(temp)) {                                       // Вывод значения по ключу
            FindKey key = new FindKey();
            System.out.println(key.findKey(map, temp));
        }
    }
}
