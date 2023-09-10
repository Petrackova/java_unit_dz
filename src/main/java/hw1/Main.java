package hw1;

import java.util.Scanner;
import static org.assertj.core.api.Assertions.*;

public class Main {
    public static void main(String[] args) {
        // Валидный тест
        assertThat(Calculator.calculatingDiscount(100.0, 20)).isEqualTo(80);
        // Отрицательная сумма покупки
        assertThat(Calculator.calculatingDiscount(-100.0,20)).isEqualTo(80);
        // Валидный тест
        assertThat(Calculator.calculatingDiscount(100.0,100)).isEqualTo(0);
        // Процент скидки не может быть больше 100%
        assertThat(Calculator.calculatingDiscount(100.0,1000)).isEqualTo(0);
        // Сумма покупки не может быть 0, так как это не покупка
        assertThat(Calculator.calculatingDiscount(0.0,100)).isEqualTo(0);
    }
}