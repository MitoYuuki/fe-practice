package day16_count_uppercase;

public class Main {

  /*
   * 大文字の数を返す
   */
  public static int countUppercase(
    String text
  ){

    int count = 0;

    for(int i = 0; i < text.length(); i++){

      char c = text.charAt(i);

      if(c >= 'A' && c <= 'Z'){
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {

    int result =
      countUppercase("AbCDeF");

    System.out.println(result);
  }
}
