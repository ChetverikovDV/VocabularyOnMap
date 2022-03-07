package MapLesson;
// Наш словарик

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

public class Vocabulary {
    public TreeMap<String, String> generateMap() {
      TreeMap<String, String> map = new TreeMap<>();
        map.put("haT".toLowerCase(Locale.ROOT), "шЛяпа".toLowerCase(Locale.ROOT)); //для наглядности
        map.put("ball", "мяч");
        map.put("sword", "меч");
        map.put("ant", "муравей");
        map.put("exit", "выход");
        map.put("table", "стол");
        return map;
    }
}
