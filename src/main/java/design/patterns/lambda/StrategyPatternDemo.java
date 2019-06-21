package design.patterns.lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StrategyPatternDemo {

    public static int totalValues(List<Integer> values, Predicate<Integer> predicate){
        /*int result = 0;
        for(int a: values){
            if(predicate.test(a)) {
                result += a;
            }

        }
        return result;*/

        return values.stream().filter(predicate).reduce(0, Integer::sum);
    }
    public static void main(String[] args) {
        List<Integer> values = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        System.out.println(totalValues(values, e-> true));
        System.out.println(totalValues(values, e-> e % 2 == 0));
        System.out.println(totalValues(values, e-> e % 2 != 0));
    }
}

