package FizzBuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    public static void main(String... args) {

    }

    public String numberToFizzBuzz(int number) {
        if (IsMultipleOf(number, 15)) {
            return "FizzBuzz";
        } else if (IsMultipleOf(number, 5)) {
            return "Buzz";
        } else if (IsMultipleOf(number, 3)) {
            return "Fizz";
        } else {
            return Integer.toString(number);
        }
    }

    private boolean IsMultipleOf(int number, int divisor) {
        return number % divisor == 0;
    }

    public void generateAndPrintFizzBuzzes() {
        Stream<String> fizzBuzzes = IntStream.range(1, 101).mapToObj(this::numberToFizzBuzz);
        System.out.println(fizzBuzzes.collect(Collectors.joining(", ")));
    }
}