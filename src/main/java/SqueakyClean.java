class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < identifier.length(); i++) {
            char current = identifier.charAt(i);

            if (Character.isWhitespace(current)) {
                result.append('_');
            } else if (current == '-') {
                capitalizeNext = true;
            } else if (Character.isDigit(current)) {
                switch (current) {
                    case '4':
                        result.append('a');
                        break;
                    case '3':
                        result.append('e');
                        break;
                    case '0':
                        result.append('o');
                        break;
                    case '1':
                        result.append('l');
                        break;
                    case '7':
                        result.append('t');
                        break;
                    default:
                        result.append(current);
                }
            } else if (Character.isLetter(current)) {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(current));
                    capitalizeNext = false;
                } else {
                    result.append(current);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Test 1: " + clean("a-bc")); // aBc
        System.out.println("Test 2: " + clean("hello-world")); // helloWorld
        System.out.println("Test 3: " + clean("foo bar-baz")); // foo_barBaz
        System.out.println("Test 4: " + clean("my-var-name")); // myVarName
        System.out.println("Test 5: " + clean("hello world")); // hello_world
        System.out.println("Test 6: " + clean("test-one-two-three"));// testOneTwoThree
        // Test cases với số
        System.out.println("Test 7: " + clean("H3ll0 W0rld")); // Hello_World
        System.out.println("Test 8: " + clean("4 73s7"));

    }
}