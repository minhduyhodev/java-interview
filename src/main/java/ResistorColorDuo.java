class ResistorColorDuo {
    int value(String[] colors) {
        return colorCode(colors[0]) * 10 + colorCode(colors[1]);
    }

    private int colorCode(String color) {
        return switch (color) {
            case "black" -> 0;
            case "brown" -> 1;
            case "red" -> 2;
            case "orange" -> 3;
            case "yellow" -> 4;
            case "green" -> 5;
            case "blue" -> 6;
            case "violet" -> 7;
            case "grey" -> 8;
            case "white" -> 9;
            default -> throw new IllegalArgumentException("Unknown color: " + color);
        };
    }
}
