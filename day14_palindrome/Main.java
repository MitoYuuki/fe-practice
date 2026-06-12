package day14_palindrome;

public class Main {

  /*
   * 回文か判定する
   */
  public static boolean isPalindrome(
    String text
  ){

    String reversed = "";

    for(
      int i = text.length() - 1;
      i >= 0;
      i--
    ){

      reversed += text.charAt(i);
    }

    return text.equals(reversed);
  }

  public static void main(String[] args) {

    boolean result =
      isPalindrome("level");

    System.out.println(result);
  }
}
