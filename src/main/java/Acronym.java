class Acronym {
    private final String acronym;

    Acronym(String phrase) {
        StringBuilder result = new StringBuilder();
        String[] words = phrase.split("[^A-Za-z]+");

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        this.acronym = result.toString();
    }

    String get() {
        return acronym;
    }
}
