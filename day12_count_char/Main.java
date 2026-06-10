package day12_count_char;

public class Main {

  /*
   * targetの出現回数を返す
   */
  public static int countChar(
    String text,
    char target
  ){

    int count = 0;

    for(int i = 0; i < text.length(); i++){

      if(text.charAt(i) == target){
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {

    String text = "banana";

    int result =
      countChar(text, 'a');

    System.out.println(result);
  }
}