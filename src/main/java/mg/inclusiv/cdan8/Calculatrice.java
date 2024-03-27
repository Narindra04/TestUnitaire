package mg.inclusiv.cdan8;

public class Calculatrice {
    public static double addition(double number1, double number2) {
        return number1 + number2;
    }

    public static double soustraction(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    public static double division(double number1, double number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("le diviseur ne peut pas etre 0");
        } else {
            return number1 / number2;
        }
    }
}
