package hashmap.operation.sort;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortByValue {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 3, 1, 4, 5, 3, 5, 3, 2, 4 };
        printArray(a);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        printMap(map);

        List<NumericMap> list = new ArrayList<>();
        for(Integer key: map.keySet()){
            list.add(new NumericMap(key, map.getOrDefault(key, 0)));
        }

        Collections.sort(list);

        for(NumericMap item: list){
            for(int i=0; i<item.count; i++){
                System.out.println(item.number + ",");
            }
        }

    }

    public static void printArray(int[] a){
        String str = Arrays.stream(a)
                .boxed()
                .map( num -> new Integer(num))
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(str);
    }

    public static void printMap(Map<Integer, Integer> map){
        for(Integer key: map.keySet()){
            System.out.println("Key :" + key + ", value :" + map.getOrDefault(key, 0));
        }
    }
}

class NumericMap implements Comparable<NumericMap> {
    Integer number;
    Integer count;

    NumericMap(Integer number, Integer count){
        this.count = count;
        this.number = number;
    }


    @Override
    public int compareTo(NumericMap o) {
        return count > o.count ? -1 :
                count < o.count ? 1 : 0;
    }
}
