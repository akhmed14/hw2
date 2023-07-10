public class HW22 {
    public static void main(String[] args) {
        try {
            divideByZero(12, 0);
        } catch (DivisionByZeroException  e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    public static void divideByZero(int value1, int value2) throws DivisionByZeroException  {
        if (value2 == 0) {
            throw new DivisionByZeroException ("Делить на ноль нельзя");
        }
        System.out.println( value1 + " поделить на "+ value2 + " = " + value1/value2);
    }

}

class DivisionByZeroException extends Exception {

    public DivisionByZeroException (String message) {
        super(message);
    }
}