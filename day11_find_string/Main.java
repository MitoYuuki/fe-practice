package day11_find_string;

public class Main {

  /*
   * targetが含まれているか調べる
   */
  public static boolean containsChar(
    String text,
    char target
  ){

    for(int i = 0; i < text.length(); i++){

      if(text.charAt(i) == target){
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {

    String text = "apple";

    boolean result =
      containsChar(text, 'p');

    System.out.println(result);
  }
}