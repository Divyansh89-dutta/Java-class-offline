public class Main {
    public static void main(String[] args) {
        String str = "  Hello Java World  ";
        String str2 = "hello java world";

        // lenght()
        System.out.println("Lenght: " + str.length());
        // trim()
        System.out.println("Trimmed: " + str.trim());
        // toUperCase
        System.out.println("UperCase: " + str.toUpperCase());
        // toLowerCase
        System.out.println("To LowerCase: " + str.toLowerCase());
        // charAt()
        System.out.println("Character at index 3: " + str.charAt(3));
//        substring()
        System.out.println("Substring from index 2: " + str.substring(2));
        System.out.println("Substring (2, 8)" + str.substring(2,3));
        //equals() and equalsIgnoreCase()
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Starts with '  He': " + str.startsWith("  He"));
        System.out.println("Ends with 'World  ': " + str.endsWith("World  "));
        // indexOf() and lastIndexOf()
        System.out.println("Index of a: " + str.indexOf('a'));
        System.out.println("last index of a: " + str.lastIndexOf('a'));
        //replace()
        System.out.println("Replace 'a' with '@': " + str.replace('a', '@'));
        //split()
        String[] words = str.trim().split(" ");
        System.out.println("Words after split:");
        for (String w : words) {
            System.out.println(w);
        }
        String empty = "";
        System.out.println("Is empty string: " + empty.isEmpty());
        // concat()
        String joined  = "Hello".concat("World");
        System.out.println("Concatenated String: " + joined);
        //compareTo()
        System.out.println("CompareTo Example: " + "abc".compareTo("abd"));
        // reversal

    }
}