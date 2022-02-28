package MapLesson;
// Наш словарик

import java.util.HashMap;

public class Vocabulary {
    public HashMap<String, String> generateMap() {
        HashMap<String, String> map = new HashMap<>();
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
