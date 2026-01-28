class GCDOfStrings {
    public static String gcdOfString(String str1, String str2) {
        if (str1.equals(str2)) {
            return str1; // If the two strings are equal, return either of them as the GCD
        }

        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 < len2) {
            return gcdOfString(str2, str1); // Swap str1 and str2 if len1 is smaller than len2
        }

        // Check if str2 is a prefix of str1
        if (str1.startsWith(str2)) {
            // Recursively check the GCD of the remaining part of str1 and str2
            return gcdOfString(str1.substring(len2), str2);
        }

        return ""; // If no common divisor is found
    }
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        // System.out.println(gcdOfString(str1, str2)); // Output: "ABC"

        // Example 2
        str1 = "HELLO";
        str2 = "LL";
        System.out.println(gcdOfString(str1, str2)); // Output: "AB"

        // // Example 3
        // str1 = "LEET";
        // str2 = "CODE";
        // System.out.println(gcdOfString(str1, str2)); // Output: ""
    }
}
