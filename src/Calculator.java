import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    int min = Integer.MIN_VALUE;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> devide = (x, y) -> x / y;  - первоначальная реализация кода
    // ошибка с делением на ноль

    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? min : x / y;
    // теперь деление на ноль не исключение кидает, а выдает минимальное интовое значение

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * - 1;

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
