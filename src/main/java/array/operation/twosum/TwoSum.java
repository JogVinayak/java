package array.operation.twosum;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class TwoSum {
    public static void main(String[] args) {
        int [] a = {1, 3, 9, 5, 4, 2, 6, 8, 7, 10};
        int givenNumber = 11;

        print(a);
        Arrays.sort(a);
        print(a);

        int l = 0;
        int r = a.length -1;

        while(l < r){
            if(a[l] + a[r] > givenNumber){
                r--;
            }
            else if(a[l] + a[r] < givenNumber){
                l++;
            }else{
                System.out.println("( "+ a[l] + ", " + a[r] + " )");
                l++;
            }
        }
    }

    public static void print(int []a){
        String str = IntStream.of(a).boxed()
                .parallel()
                .map(Integer::valueOf)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(str);
    }
}
