package day05_even_count;

public class Main {

  /*
   * 偶数の個数を返す
   */
  public static int countEven(int[] numbers){

    int count = 0;

    for(int i = 0; i < numbers.length; i++){

      if(numbers[i] % 2 == 0){
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {

    int[] numbers = {
      1,
      2,
      3,
      4,
      5,
      6
    };

    int result =
      countEven(numbers);

    System.out.println(result);
  }
}
