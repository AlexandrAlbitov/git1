import java.util.Scanner;

public class Main {
    static String number1;
    static String number2;
    static String operation;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String symbols = scanner.nextLine();
        String[] massiv = symbols.split(" ");

        if (massiv.length != 3) {
            throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один" +
                    "оператор (+, -, /, *)");
        }

        number1 = massiv[0];
        operation = massiv[1];
        number2 = massiv[2];

        Sends(number1, operation, number2);
    }

    public static void Sends(String number1, String operation, String number2) throws Exception {
        Redistribution.distributes(number1, operation, number2);
    }

    public static void outputsArabic(int result) {
        System.out.print(result);
    }

    public static void outputsRoman(String result) {
        System.out.print(result);
    }
}