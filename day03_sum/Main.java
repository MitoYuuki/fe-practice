package day03_sum;

public class Main {

  /*
   * 配列の合計値を返す
   */
  public static int getSum(int[] numbers){

    int sum = 0;

    for(int i = 0; i < numbers.length; i++){

      sum += numbers[i];
    }

    return sum;
  }

  public static void main(String[] args) {

    int[] numbers = {
      10,
      20,
      30,
      40,
      50
    };

    int result =
      getSum(numbers);

    System.out.println(result);
  }
}