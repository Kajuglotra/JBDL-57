package org.gfg;

import java.util.ArrayList;
import java.util.List;

public class ListKeyAnalyzerImpl implements KeyAnalyzer{

    private List<String> list;

    public ListKeyAnalyzerImpl(){
        list = new ArrayList<>();
    }
    @Override
    public void storeKeyword(String key) {
        list.add(key);
    }

    @Override
    public List<String> getAllKeywords() {
        return list;
    }
}
