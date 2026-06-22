package day22_max_difference;

public class Main {

  /*
   * 最大値と最小値の差を返す
   */
  public static int getDifference(
    int[] numbers
  ){

    int max = numbers[0];
    int min = numbers[0];

    for(int i = 1; i < numbers.length; i++){

      if(numbers[i] > max){
        max = numbers[i];
      }

      if(numbers[i] < min){
        min = numbers[i];
      }
    }

    return max - min;
  }

  public static void main(String[] args) {

    int[] numbers = {
      10,
      5,
      30,
      20
    };

    int result =
      getDifference(numbers);

    System.out.println(result);
  }
}
