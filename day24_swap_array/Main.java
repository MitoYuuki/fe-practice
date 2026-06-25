package day24_swap_array;

public class Main {

  /*
   * 配列の2つの要素を入れ替える
   */
  public static void swap(
    int[] numbers,
    int index1,
    int index2
  ){

    int temp = numbers[index1];

    numbers[index1] = numbers[index2];

    numbers[index2] = temp;
  }

  public static void main(String[] args) {

    int[] numbers = {
      10,
      20,
      30,
      40
    };

    swap(numbers, 1, 3);

    for(int i = 0; i < numbers.length; i++){
      System.out.println(numbers[i]);
    }
  }
}