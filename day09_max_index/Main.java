package day09_max_index;

public class Main {

  /*
   * 最大値の添字を返す
   */
  public static int getMaxIndex(int[] numbers){

    int max = numbers[0];
    int maxIndex = 0;

    for(int i = 1; i < numbers.length; i++){

      if(numbers[i] > max){

        max = numbers[i];
        maxIndex = i;
      }
    }

    return maxIndex;
  }

  public static void main(String[] args) {

    int[] numbers = {
      10,
      50,
      30,
      20
    };

    int result =
      getMaxIndex(numbers);

    System.out.println(result);
  }
}