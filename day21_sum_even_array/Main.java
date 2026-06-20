package day21_sum_even_array;

public class Main {

  /*
   * 偶数の合計を返す
   */
  public static int sumEvenNumbers(
    int[] numbers
  ){

    int sum = 0;

    for(int i = 0; i < numbers.length; i++){

      if(numbers[i] % 2 == 0){

        sum += numbers[i];
      }
    }

    return sum;
  }

  public static void main(String[] args) {

    int[] numbers = {
      1,
      2,
      3,
      4,
      5,
      6
    };

    int result =
      sumEvenNumbers(numbers);

    System.out.println(result);
  }
}
