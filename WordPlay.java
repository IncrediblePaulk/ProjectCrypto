public class WordPlay {
    public static void main(String[] args) {

        System.out.println(isVowel('e'));
        System.out.println(replaceVowels("Hello World", '*'));

    }

    public static boolean isVowel(char ch) {
        boolean vowel;

        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
           ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowel = true;
        }else {
            vowel = false;
        }
        return vowel;
    }

    public static String replaceVowels(String phrase, char ch) {
        String newPhrase = "";

        for(int i = 0; i < phrase.length(); i++) {
            if(isVowel(phrase.charAt(i))) {
                newPhrase = phrase.replace(phrase.charAt(i), ch);
            }
        }
        return newPhrase;
    }
}
