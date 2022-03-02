package MapLesson;
//поиск ключа по значению
import java.util.HashMap;

public class FindKey {
   public String findKey(HashMap<String, String> map, String key) {
        String engKey = "";
        for (String k : map.keySet()) {
            if (map.get(k).equals(key)) {
                engKey = k;
                break;
            }
        }
        return engKey;
    }
}
