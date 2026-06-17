package day18_count_lowercase;

public class Main {

  /*
   * 小文字の数を返す
   */
  public static int countLowercase(
    String text
  ){

    int count = 0;

    for(int i = 0; i < text.length(); i++){

      char c = text.charAt(i);

      if(c >= 'a' && c <= 'z'){
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {

    int result =
      countLowercase("AbCdEfg");

    System.out.println(result);
  }
}