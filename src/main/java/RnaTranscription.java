class RnaTranscription {

    String transcribe(String dnaStrand) {
        if (dnaStrand.isEmpty())
            return "";

        StringBuilder rnaStrand = new StringBuilder();

        for (int i = 0; i < dnaStrand.length(); i++) {
            char nucleotide = dnaStrand.charAt(i);

            switch (nucleotide) {
                case 'G':
                    rnaStrand.append('C');
                    break;
                case 'C':
                    rnaStrand.append('G');
                    break;
                case 'T':
                    rnaStrand.append('A');
                    break;
                case 'A':
                    rnaStrand.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Invalid DNA nucleotide: " + nucleotide);
            }
        }

        return rnaStrand.toString();
    }
}
