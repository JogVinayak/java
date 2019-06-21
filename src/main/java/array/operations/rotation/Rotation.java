package array.operations.rotation;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Rotation {
    public static void main(String[] args) {

        int []a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printArray(a);
        a = rotation(a);
        a = rotation(a);
        printArray(a);

    }

    public static int [] rotation (int [] a) {
        int last = a[a.length - 1];

        for(int i = a.length -1 ; i > 0; i--){
            a[i] = a [i - 1];
        }

        a[0] = last;

        return a;
    }

    public static void printArray(int []a){

        String str = IntStream.of(a)
                .boxed()
                .map( in -> new Integer(in))
                .map(String::valueOf)
                .collect( Collectors.joining(", "));

        System.out.println(str);
    }
}
