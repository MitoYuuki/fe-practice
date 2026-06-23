package day23_second_max;

public class Main {

  /*
   * 2番目に大きい値を返す
   */
  public static int getSecondMax(
    int[] numbers
  ){

    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for(int i = 0; i < numbers.length; i++){

      if(numbers[i] > max){

        secondMax = max;
        max = numbers[i];

      }else if(numbers[i] > secondMax){

        secondMax = numbers[i];
      }
    }

    return secondMax;
  }

  public static void main(String[] args) {

    int[] numbers = {
      10,
      50,
      30,
      20
    };

    int result =
      getSecondMax(numbers);

    System.out.println(result);
  }
}