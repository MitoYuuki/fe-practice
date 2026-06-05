package day08_count_target;

public class Main {

  /*
   * targetの出現回数を返す
   */
  public static int countTarget(
    int[] numbers,
    int target
  ){

    int count = 0;

    for(int i = 0; i < numbers.length; i++){

      if(numbers[i] == target){
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {

    int[] numbers = {
      10,
      20,
      10,
      30,
      10
    };

    int result =
      countTarget(numbers, 10);

    System.out.println(result);
  }
}
