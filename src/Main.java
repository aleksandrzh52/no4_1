import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }
    }

    private static boolean checkName(String name) {
        String[] ArrayName = name.split(" ");
        if (ArrayName.length > 2 && ArrayName.length < 4) {
            sort(ArrayName);
            System.out.println(Arrays.toString(ArrayName));

        } else {
            System.out.println("Введено некоректное имя, введите имя еще раз");
            return false;
        }
        return true;
    }
}
