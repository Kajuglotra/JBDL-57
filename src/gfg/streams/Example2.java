package gfg.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

    public static void main(String[] args) {
//        "kk", "kajahakakjk", "kajkkkkjhghjkk", "kjhgfdfghk"

        // list of string
        // check if the length of string is greater than 10
        // trim it to length 10
        // check if the first and the last char of the string is same then print
        List<String> list = Arrays.asList("kk", "kkjhgfghjk" , "kjhgfdfghjhgfghjhgk" , "kkjhgfghjkkjhg");
        List<String> l1 = list.stream().map(x  -> x.length()> 10 ? x.substring(0,10): x).filter( x->x.charAt(0)==x.charAt(x.length()-1)).collect(Collectors.toList());
        System.out.println(l1);
    }
}
