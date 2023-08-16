public class Arab {
    static String[] arabNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
            "31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
            "41", "42", "43", "44", "45", "46", "47", "48", "49", "50",
            "51", "52", "53", "54", "55", "56", "57", "58", "59", "60",
            "61", "62", "63", "64", "65", "66", "67", "68", "69", "70",
            "71", "72", "73", "74", "75", "76", "77", "78", "79", "80",
            "81", "82", "83", "84", "85", "86", "87", "88", "89", "90",
            "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"};

    public static void calculates(String number1, String number2, String operation) throws Exception {
        int newNumber1 = 0;
        int newNumber2 = 0;
        for (int i = 0; i < arabNumbers.length; i++) {
            boolean znach = number1.equals(arabNumbers[i]);
            if (znach) {
                newNumber1 = i + 1;
            }
        }
        for (int i = 0; i < arabNumbers.length; i++) {
            boolean her = number2.equals(arabNumbers[i]);
            if (her) {
                newNumber2 = i + 1;
            }
        }
        if (newNumber1 <= 10) {
        } else {
            throw new Exception("Число больше 10");
        }
        if (newNumber2 <= 10) {
        } else {
            throw new Exception("Число больше 10");
        }
        decides(newNumber1, newNumber2, operation);
    }

    public static void decides(int number1, int number2, String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }
        directs(result);
    }

    public static void directs(int result) {
        Main.outputsArabic(result);
    }
}