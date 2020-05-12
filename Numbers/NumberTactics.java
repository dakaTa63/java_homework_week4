package Numbers;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NumberTactics {
    public static void main(String[] args) {

        System.out.println("1. Сортиране на въведените числа във възходящ ред\n" +
                "2. Сортиране на въведените числа в низходящ ред\n" +
                "3. Търсене на позиция на конкретно число\n" +
                "4. Разбъркване на числата\n" +
                "2. Изчисляване на сбора на всички числа\n" +
                "6. Намиране на най-голямото число\n" +
                "7. Намиране на най-малкото число\n" +
                "8. Намиране средно-аритметично на числата\n" +
                "9. Проверка за симетричност на масива от числа\n" +
                "10. Обръщане на масива от числа\n" +
                "11. Визуализирай въведените числа\n" +
                "12. Изход\n");


        int elements;
        Scanner numberOfElements = new Scanner(System.in);
        System.out.print("Въведете колко на брой числа ще въвеждате.");
        elements = numberOfElements.nextInt();
        int array[] = new int[elements];
        System.out.println("Въведете елементите: ");
        for (int i = 0; i < elements; i++) {
            array[i] = numberOfElements.nextInt();
        }
        System.out.println(Arrays.toString(array));



        System.out.println("изберете опция от менюто: ");

        Scanner choices = new Scanner(System.in);
        String madeChoice = choices.nextLine();

        if (madeChoice.equals("1")) {
            int length = array.length;
            for (int i = 0; i < length - 1; i++)
                for (int j = 0; j < length - i - 1; j++)
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
            int length1 = array.length;
            for (int i = 0; i < length1; ++i)
                System.out.print(array[i] + " ");
            System.out.println();
        }
        if(madeChoice.equals("5")) {
            int sum = IntStream.of(array).sum();
            System.out.println("сумата е: " + sum);
        }


        if(madeChoice.equals("8")) {
            double sum = IntStream.of(array).sum();
            System.out.println("сумата е: " + sum/2);
        }

        if(madeChoice.equals("12")){
            return;
        }
    }
}
