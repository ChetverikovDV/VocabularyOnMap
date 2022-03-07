package MapLesson;
// Наш словарик

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class Vocabulary {
    public HashMap<String, String> generateMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("haT".toLowerCase(Locale.ROOT), "шЛяпа".toLowerCase(Locale.ROOT)); //для наглядности
        map.put("ball", "мяч");
        map.put("sword", "меч");
        map.put("ant", "муравей");
        map.put("exit", "выход");
        map.put("table", "стол");
        return map;
    }
}
