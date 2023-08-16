public class Rome {
    static String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

    public static void calculates(String number1, String number2, String operation) throws Exception {
        int number = 0;
        int number0 = 0;
        int i;
        for (i = 0; i < romanNumbers.length; i++) {
            boolean znach = number1.equals(romanNumbers[i]);
            if (znach) {
                number = i + 1;
            }
        }
        for (i = 0; i < romanNumbers.length; i++) {
            boolean znach = number2.equals(romanNumbers[i]);
            if (znach) {
                number0 = i + 1;
            }
        }
        if (number <= 10) {
        } else {
            throw new Exception("Число больше 10");
        }
        if (number0 <= 10) {
        } else {
            throw new Exception("Число больше 10");
        }
        decides(number, number0, operation);
    }

    public static void decides(int number1, int number2, String operation) throws Exception {
        int result = 0;
        switch (operation){
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
        converts(result);
    }

    public static void converts(int result) throws Exception {
        if (result <= 0) {
            throw new Exception("В римской системе нет отрицвтельных значений");
        }
        String result1 = romanNumbers[result - 1];
        directs(result1);
    }

    public static void directs(String result1) {
        Main.outputsRoman(result1);
    }
}