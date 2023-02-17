public class HiddenWordTester{
  public static void main (String[] args){
    HiddenWord word = new HiddenWord("HARPS");
    System.out.println(word.getHint("AAAAA"));
    System.out.println(word.getHint("HELLO"));
    System.out.println(word.getHint("HEART"));
    System.out.println(word.getHint("HARMS"));
    System.out.println(word.getHint("HARPS"));
    HiddenWord word2 = new HiddenWord("EXCELLENT");
    System.out.println(word2.getHint("CAT"));
  }
}

/* 
 Output:
 
+A+++ 
H**** 
H*++* 
HAR*S 
HARPS 
+*+ 

*/