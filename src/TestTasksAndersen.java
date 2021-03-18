import java.util.Scanner;

public class TestTasksAndersen {

    public static void main(String[] args) {

        System.out.println("Task 1");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введи число:");
        int number = scan.nextInt();
        if (number > 7){
            System.out.println("Привет");
        } else if (number <= 7){
            System.out.println("Не здороваюсь.");
        }

        System.out.println("-------------------------------");

        System.out.println("Task 2");

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String actuality = scan2.nextLine();
        String expected = "Вячеслав";
        if (actuality.equals(expected)){
            System.out.println("Привет, " + expected);
        } else {
            System.out.println("Нет такого имени");
        }

        System.out.println("-------------------------------");

        System.out.println("Task 3");

        System.out.println("Массив состоит из: ");
        int[] numbersArray = new int[15];
        for (int i = 0; i < numbersArray.length; i ++){
            numbersArray[i] = ((int) (Math.random() * 101));
            System.out.print(numbersArray[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Числа, кратные 3 в массиве: ");
        int aliquot;
        for (int i = 1; i < numbersArray.length; i ++){
            if ((numbersArray[i] %3 == 0) && (numbersArray[i] != 0)){
                aliquot = numbersArray[i];
                System.out.print(aliquot + " ");
            }
        }

        System.out.println("");
        System.out.println("-------------------------------");

        System.out.println("Task 4");

        System.out.println("Нет, эту скобочную последовательность нельзя считать правильной.");
        System.out.println("Правильная последовательность: [[((())()(()))]]");
    }
}
