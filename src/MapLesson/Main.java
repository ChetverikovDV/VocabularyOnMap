package MapLesson;

import java.util.*;


public class Main {
    public static  void main(String[] args){

        Vocabulary generate = new Vocabulary();                              // Там словарь
       TreeMap<String, String> map = generate.generateMap();

        Scanner scanner = new Scanner(System.in);
        Actions action = new Actions();

        String keyWord = "";
        String value = "";

        action.addNewPair(map, keyWord, value);                               // заполняем словарь
        System.out.println(map);                                              // в цикле пока не 0


        System.out.println("Что хотим перевести? ");
        String temp = scanner.next().toLowerCase(Locale.ROOT);                                         // Вводим слово

        //   if (!map.containsKey(temp) && !map.containsValue(temp)){              // Проверка наличия
        //    System.out.println("Не найдено");                                 // по обоим параметрам
        //}

        if (map.containsKey(temp)) {                                          // Вывод значения по ключу
            System.out.println(temp +" - "+Arrays.toString(map.get(temp).split(",")));
        }
        else{
            FindKey key = new FindKey();                                          // Вывод ключа по значению
            System.out.println("Перевод слова " + temp + " - " + key.findKey(map, temp));
            System.out.println("англ."+key.findKey(map, temp) +" - рус." +Arrays.toString(map.get(key.findKey(map, temp)).split(",")));
        }

        //System.out.println(map);
    }
}
