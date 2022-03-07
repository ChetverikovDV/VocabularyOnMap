package MapLesson;
//поиск ключа по значению
import java.util.HashMap;
import java.util.Map;

public class FindKey {
   public String findKey(Map<String, String> map, String key) {
        for (String k : map.keySet()) {
            if (map.get(k).equals(key)) {
                return k;
            }
        }
        return "";
    }
}
