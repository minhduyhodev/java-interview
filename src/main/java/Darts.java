class Darts {
    int score(double xOfDart, double yOfDart) {
        double distanceFromCenter = Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));

        if (distanceFromCenter <= 1) {
            return 10;
        }

        if (distanceFromCenter <= 5) {
            return 5;
        }

        if (distanceFromCenter <= 10) {
            return 1;
        }

        return 0;
    }
}
