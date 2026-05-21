public class Secrets {
    // Secrets.shiftBack(0b1001, 2);
    // # => 0b0010

    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }

    public static int setBits(int value, int mask) {
        return value | mask;
    }

    public static int flipBits(int value, int mask) {
        return value ^ mask;
    }

    public static int clearBits(int value, int mask) {
        return value & ~mask;
    }

    public static void main(String[] args) {
        Secrets secrets = new Secrets();
        System.out.println(secrets.shiftBack(0b1001, 2));
    }
}