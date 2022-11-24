public class Main {
    public static boolean isPalindrom (String text){
        String clean = text.replaceAll(" ", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward >= forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (backwardChar != forwardChar)
                return false;
        }
        return true;
        }

    public static void main(String[] args) {
    String text = "Mad am";
        System.out.println(isPalindrom(text));
    }
}