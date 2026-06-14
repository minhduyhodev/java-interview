class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        if (numberToCheck < 0) {
            return false;
        }

        int originalNumber = numberToCheck;
        int sum = 0;
        int count = String.valueOf(numberToCheck).length();

        while (numberToCheck > 0) {
            int digit = numberToCheck % 10;
            sum += (int) Math.pow(digit, count);
            numberToCheck /= 10;
        }

        return sum == originalNumber;
    }
}