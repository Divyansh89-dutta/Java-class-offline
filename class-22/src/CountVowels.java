public class CountVowels {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("StringBuilderExample");
        int vowels = 0;
        for (int i = 0; i < sb.length(); i++) {
            char ch = Character.toLowerCase(sb.charAt(i));
            if ("aeiou".indexOf(ch) != -1) vowels++;
        }
        System.out.println("Vowel Count: " + vowels);
    }
}
