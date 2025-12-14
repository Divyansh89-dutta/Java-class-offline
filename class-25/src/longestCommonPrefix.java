public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        String prefix = longestCommonPrefix(words);
        System.out.println("Longest Common Prefix: " + prefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        // Start with the first string as prefix
        String prefix = strs[0];
        // Compare prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Keep shortening prefix until it matches the start of strs[i]
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
