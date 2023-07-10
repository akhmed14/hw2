public class HW21 {
    public static void main(String[] args) {
        try {
            readAge(0);
        } catch (InvalidNumberException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    public static void readAge(int value) throws InvalidNumberException {
        if (value <= 0) {
            throw new InvalidNumberException("Число не корректно");
        }
        System.out.println("Число " + value + " корректно!");
    }

}

class InvalidNumberException extends Exception {

    public InvalidNumberException(String message) {
        super(message);
    }
}