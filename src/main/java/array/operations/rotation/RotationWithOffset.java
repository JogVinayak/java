package array.operations.rotation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RotationWithOffset {
    public static void main(String[] args) {
        List<Integer> numbers =  IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        Integer []a  = new Integer[numbers.size()];
        int index = 0;

        for(Integer item : numbers){
            a[index++] = item;
        }

        printArray(a);
        a = rotationWithOffset(a, 2);
        printArray(a);
    }

    public static Integer[] rotationWithOffset(Integer []a, int offset){
        int lastIndex = a.length - 1;
        int startIndex = a.length - offset;
        Integer [] buffer = new Integer[offset];

        // take out the offset elements
        for(int i = startIndex, j=0; i<=lastIndex; i++, j++){
            buffer[j] = a [i];
        }

        printArray(buffer);



        // move all the initial elements to last
        // make room for offset
        for(int i = startIndex-1; i >= 0; i--){
            a [ i + offset ] = a [i];
        }

        // place integers from buffer to original array

        for(int i=0; i<buffer.length; i++) {
            a[i] = buffer[i];
        }


        return a;
    }


    public static void printArray(Integer[] a){
        String str = Arrays.stream(a)
                .map( String::valueOf )
                .collect(Collectors.joining(", "));

        System.out.println(str);
    }
}
