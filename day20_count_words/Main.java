package day20_count_words;

public class Main {

  /*
   * 単語数を返す
   */
  public static int countWords(
    String text
  ){

    String[] words = text.split(" ");

    return words.length;
  }

  public static void main(String[] args) {

    int result =
      countWords("I love Java");

    System.out.println(result);
  }
}
