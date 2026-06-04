package day06_linear_search;

public class Main {

  /*
   * targetが存在するか調べる
   */
  public static boolean contains(
    int[] numbers,
    int target
  ){

    for(int i = 0; i < numbers.length; i++){

      if(numbers[i] == target){
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {

    int[] numbers = {
      10,
      20,
      30,
      40,
      50
    };

    boolean result =
      contains(numbers, 30);

    System.out.println(result);
  }
}