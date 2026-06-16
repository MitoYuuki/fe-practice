package day17_count_digits;

public class Main {

  /*
   * 数字の個数を返す
   */
  public static int countDigits(
    String text
  ){

    int count = 0;

    for(int i = 0; i < text.length(); i++){

      char c = text.charAt(i);

      if(c >= '0' && c <= '9'){
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {

    int result =
      countDigits("abc123xyz45");

    System.out.println(result);
  }
}
