package service;

import java.util.Map;

public interface IDictionary {
    Map<String, String> findAll();
    String translator(String keyword);
}
