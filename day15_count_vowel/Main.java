package day15_count_vowel;

public class Main {

  /*
   * 母音の数を返す
   */
  public static int countVowel(
    String text
  ){

    int count = 0;

    for(int i = 0; i < text.length(); i++){

      char c = text.charAt(i);

      if(
        c == 'a' ||
        c == 'e' ||
        c == 'i' ||
        c == 'o' ||
        c == 'u'
      ){
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {

    int result =
      countVowel("education");

    System.out.println(result);
  }
}