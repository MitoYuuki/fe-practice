package day04_average;

public class Main {

  /*
   * 配列の平均値を返す
   */
  public static double getAverage(int[] numbers){

    int sum = 0;

    for(int i = 0; i < numbers.length; i++){

      sum += numbers[i];
    }

    return (double)sum / numbers.length;
  }

  public static void main(String[] args) {

    int[] numbers = {
      10,
      20,
      30,
      40,
      50
    };

    double result =
      getAverage(numbers);

    System.out.println(result);
  }
}