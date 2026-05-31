package day02_min_value;

public class Main {

  /*
   * 配列の最小値を返す
   */
  public static int getMin(int[] numbers){

    int min = numbers[0];

    for(int i = 1; i < numbers.length; i++){

      if(numbers[i] < min){
        min = numbers[i];
      }
    }

    return min;
  }

  public static void main(String[] args) {

    int[] numbers = {
      15,
      8,
      27,
      3,
      20
    };

    int result =
      getMin(numbers);

    System.out.println(result);
  }
}