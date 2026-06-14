class CountWordsWithoutVowels {

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public int countWordsWithoutVowels(String sentence) {
        String[] words = sentence.split(" ");
        int count = 0;

        for (String word : words) {
            boolean hasVowel = false;

            for (int i = 0; i < word.length(); i++) {
                if (isVowel(word.charAt(i))) {
                    hasVowel = true;
                    break; // 🔥 early exit
                }
            }

            if (!hasVowel) {
                count++;
            }
        }

        return count;
    }
}
