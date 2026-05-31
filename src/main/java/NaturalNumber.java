class NaturalNumber {
    private final int number;

    NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }

        this.number = number;
    }

    Classification getClassification() {
        int divisorSum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisorSum += i;
            }
        }

        if (divisorSum == number) {
            return Classification.PERFECT;
        }

        if (divisorSum > number) {
            return Classification.ABUNDANT;
        }

        return Classification.DEFICIENT;
    }
}
