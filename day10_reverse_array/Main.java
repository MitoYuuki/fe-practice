package day10_reverse_array;

public class Main {

  /*
   * 配列を逆順に表示する
   */
  public static void printReverse(
    int[] numbers
  ){

    for(int i = numbers.length - 1;
        i >= 0;
        i--){

      System.out.println(
        numbers[i]
      );
    }
  }

  public static void main(String[] args) {

    int[] numbers = {
      1,
      2,
      3,
      4,
      5
    };

    printReverse(numbers);
  }
}