package day13_reverse_string;

public class Main {

  /*
   * 文字列を逆順にして返す
   */
  public static String reverseString(
    String text
  ){

    String result = "";

    for(
      int i = text.length() - 1;
      i >= 0;
      i--
    ){

      result += text.charAt(i);
    }

    return result;
  }

  public static void main(String[] args) {

    String result =
      reverseString("apple");

    System.out.println(result);
  }
}