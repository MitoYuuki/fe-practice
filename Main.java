public class Main {

  /*
   * 配列の最大値を返す
   */
  public static int getMax(int[] numbers){

    int max = numbers[0];

    for(int i = 1; i < numbers.length; i++){

      if(numbers[i] > max){
        max = numbers[i];
      }
    }

    return max;
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
      getMax(numbers);

    System.out.println(result);
  }
}