package day19_sum_digits;

public class Main {

  /*
   * 文字列中の数字の合計を返す
   */
  public static int sumDigits(
    String text
  ){

    int sum = 0;

    for(int i = 0; i < text.length(); i++){

      char c = text.charAt(i);

      if(c >= '0' && c <= '9'){

        sum += c - '0';
      }
    }

    return sum;
  }

  public static void main(String[] args) {

    int result =
      sumDigits("a1b2c3");

    System.out.println(result);
  }
}