package day07_find_index;

public class Main {

  /*
   * targetの添字を返す
   * 見つからなければ-1
   */
  public static int findIndex(
    int[] numbers,
    int target
  ){

    for(int i = 0; i < numbers.length; i++){

      if(numbers[i] == target){
        return i;
      }
    }

    return -1;
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
      findIndex(numbers, 30);

    System.out.println(result);
  }
}
