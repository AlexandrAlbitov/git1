public class Redistribution {
    public static void distributes(String number1, String operation, String number2) throws Exception {
        boolean variable1 = false;
        boolean variable2 = false;
        for (int i = 0; i < Arab.arabNumbers.length; i++) {
            variable1 = number1.equals(Arab.arabNumbers[i]);
            if (variable1) {
                break;
            }
        }
        for (int i = 0; i < Arab.arabNumbers.length; i++) {
            variable2 = number2.equals(Arab.arabNumbers[i]);
            if (variable2) {
                break;
            }
        }
        if (variable1 != variable2) {
            throw new Exception("т.к. используются одновременно разные системы счисления");
        }
        if (variable1 & variable2) {
            Arab.calculates(number1, number2, operation);
        }
        for (int i = 0; i < Rome.romanNumbers.length; i++) {
            variable1 = number1.equals(Rome.romanNumbers[i]);
            if (variable1) {
                break;
            }
        }
        for (int i = 0; i < Rome.romanNumbers.length; i++) {
            variable2 = number2.equals(Rome.romanNumbers[i]);
            if (variable2) {
                break;
            }
        }
        if (variable1 & variable2) {
            Rome.calculates(number1, number2, operation);
        }

    }
}