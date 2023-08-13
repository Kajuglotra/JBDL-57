package org.gfg;

import java.util.List;
import java.util.Map;

public interface KeyAnalyzer {

    void storeKeyword(String key);

    List<String> getAllKeywords();

    default Map<String, Integer> getFrequencies(){
        return null;
    }
    // top 5 results shirt 5 times ,
}
