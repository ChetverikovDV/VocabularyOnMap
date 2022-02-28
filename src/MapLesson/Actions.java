package MapLesson;
//поиск ключа по значению
import java.util.HashMap;

public class Actions {
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
    public HashMap<String, String> generateMap(){
        HashMap<String, String> map = new HashMap();
        map.put("hat", "шляпа");
        map.put("ball", "мяч");
        map.put("sword", "меч");
        map.put("ant", "муравей");
        map.put("exit", "выход");
        map.put("стол", "table");
        map.put("table", "стол");
        return map;
    }
}
