package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DictionaryImp implements IDictionary {
    private static Map<String, String> dictionaries;

    static {
        dictionaries = new HashMap<>();
        dictionaries.put("one", "mot");
        dictionaries.put("two", "hai");
        dictionaries.put("three", "ba");
        dictionaries.put("four", "bon");
        dictionaries.put("five", "nam");
    }

    @Override
    public Map<String, String> findAll() {
        return new HashMap<>(dictionaries);
    }

    @Override
    public String translator(String keyword) {
        Set<String> keys = dictionaries.keySet();
        for (String key :
                keys) {
            if (key.equalsIgnoreCase(keyword)) {
                return dictionaries.get(key);
            }
        }
        return "not-found !";
    }
}
