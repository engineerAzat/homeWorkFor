public class Main {
    public static void main(String[] args) {

        // Первое задание

        System.out.println("\nTask 1\n");
        for (int i = 1; i <= 10; i++ )
            System.out.print(i + " ");


        // Второе задание

        System.out.println("\n\nTask 2\n");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        // Третье задание

        System.out.println("\n\nTask 3\n");
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }

        // Четвертое задание

        System.out.println("\n\nTask 4\n");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }

        // Пятое задание

        System.out.println("\n\nTask 5\n");
        for (int i = 1904; i <= 2096; i+=4) {
            System.out.println(i + " год является високосным");
        }

        // Шестое задание

        System.out.println("\n\nTask 6\n");
        for (int i = 0; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

        // Седьмое задание

        System.out.println("\n\nTask 7\n");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }

        // Восьмое задание

        System.out.println("\n\nTask 8\n");
        int money = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // Девятое задание

        System.out.println("\n\nTask 9\n");
        int sum = 29000;
        double totalSum = 0;
        for (int i = 1; i <= 12; i++) {
            totalSum = (totalSum + (totalSum * 0.01) + sum);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSum + " рублей");
        }

        // Десятое задание

        System.out.println("\n\nTask 10\n");

        for (int i = 1; i <= 10; i++) {
            int result = 2 * i;
            System.out.println("2 * " + i + " = " + result);
        }



    }
}