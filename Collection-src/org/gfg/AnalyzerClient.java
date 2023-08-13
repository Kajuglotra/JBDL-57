package org.gfg;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class AnalyzerClient {
    public static void main(String[] args) {
        KeyAnalyzer keyAnalyzer = new MapKeyAnalyzerImpl();
        keyAnalyzer.storeKeyword("pen");
        keyAnalyzer.storeKeyword("pencil");
        keyAnalyzer.storeKeyword("pen");
        keyAnalyzer.storeKeyword("pencil");
        keyAnalyzer.storeKeyword("shirt");
        keyAnalyzer.storeKeyword("button");
        keyAnalyzer.storeKeyword("chain");
        keyAnalyzer.storeKeyword("bottle");
        keyAnalyzer.storeKeyword("chain");
        keyAnalyzer.storeKeyword("chain");
        keyAnalyzer.storeKeyword("pen");

        System.out.println(keyAnalyzer.getFrequencies());


    }
}
// comparator
// comparable