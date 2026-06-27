package day25_bubble_pass;

public class Main {

  /*
   * バブルソートを1周だけ行う
   */
  public static void bubblePass(
    int[] numbers
  ){

    for(int i = 0; i < numbers.length - 1; i++){

      if(numbers[i] > numbers[i + 1]){

        int temp = numbers[i];
        numbers[i] = numbers[i + 1];
        numbers[i + 1] = temp;
      }
    }
  }

  public static void main(String[] args) {

    int[] numbers = {
      5,
      3,
      8,
      1
    };

    bubblePass(numbers);

    for(int i = 0; i < numbers.length; i++){
      System.out.println(numbers[i]);
    }
  }
}