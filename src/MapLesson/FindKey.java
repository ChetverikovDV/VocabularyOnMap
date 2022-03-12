package MapLesson;
//поиск ключа по значению
import java.util.HashMap;
import java.util.Map;

public class FindKey {
   public String findKey(Map<String, String> map, String value) {
        for (String k : map.keySet()) {
            for (int i = 0; i < map.get(k).split(",").length; i++) {
                //System.out.println(map.get(k).split(",")[i]);

                if ((map.get(k).split(",")[i].strip()).equals(value)) {
                    // System.out.println("key - "+k);
                    //System.out.println("iterator - "+i);
                    return k;
                }
            }
        }
        return "отсутствует";
    }
}
