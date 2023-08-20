package org.gfg.streams;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example {

    // List of Integers -> filter out the even num , square the even num, return addition of that numbers

    // [1,2,3,4,5,6,7,8,9,10]
    // [2,4,6,8,10]
    // [22, 44, 66 ..]
    // [4,16, 36, ...]
    // 4+16+ = 220

    //parallel stream

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum =0;
        for(int i =0 ; i<list.size(); i++){
            // filtering if it is even
            if(list.get(i)%2 == 0){
                sum += list.get(i)*list.get(i);
            }
        }

        System.out.println("sum after the iterative way : " +sum);

        // declarative -> declare what we want to achieve
        // streams -> declarative way

        System.out.println("first time stamp :"  +System.currentTimeMillis());
        // sequential  stream
       Optional<Integer> a =list.stream().parallel().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                System.out.println("I am inside the filter method");
                return integer%2 ==0;
            }
        }).map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                System.out.println("I am inside the map method");
                return integer*integer;
            }
        }).reduce( new BinaryOperator<Integer>() {
           @Override
           public Integer apply(Integer integer, Integer integer2) {
               System.out.println("First No: " + integer + " second No: "+integer2);
               return integer+integer2;
           }
       });
        System.out.println("final time stamp :"  +System.currentTimeMillis());



//               .reduce(0, new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                System.out.println("I am inside the reduce method");
//                return integer+integer2;
//            }
//        });
       // readability
        System.out.println("sum after the declarative way : " +a);

        list.stream().filter((i -> i%2 ==0)).map(i ->i*i).reduce(0 ,(i,j) ->i+j);
    }
}
