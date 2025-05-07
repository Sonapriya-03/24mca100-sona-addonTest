package basicintemediate;

public class RemoveDuplicates {
	public class program4
    public static void main(String[] args) {
        String s = "programming";

        String result = removeDuplicates(s);

        System.out.println("Result = " + result);
    }

    public static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> seen = new LinkedHashSet<>();

        for (char c : s.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        return result.toString();
    }
}