package _15_StringBuilder;

public class C02_isPalindrome {
    // Write a java program which accepts a sentence as parameter, then reverses the sentence by using StringBuilder
    // and checks is it palindrome or not.
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I love Java");
        StringBuilder sbreverse = new StringBuilder("");
        for (int i = sb.length() - 1; i >= 0; i--) {
            sbreverse.append(sb.subSequence(i, i + 1));
        }
        if (sb.toString().equalsIgnoreCase(sbreverse.toString())) {
            System.out.println("Reversed sentence : " + sbreverse + " . " + "It is a palindrome");
        } else System.out.println("Reversed sentence : " + sbreverse + " . " + "It is not a palindrome");
    }
}

