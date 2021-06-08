public class StringManipulatorTesting{
    public static void main(String[] args){

    StringManipulator trim = new StringManipulator();
    String str = trim.trimAndConcat("    Hello     ","     World    ");
    System.out.println(str);

    StringManipulator index = new StringManipulator();
    char letter = 'o';
    Integer a = index.getIndexOrNull("Coding", letter);
    Integer b = index.getIndexOrNull("Hello World", letter);
    Integer c = index.getIndexOrNull("Hi", letter);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    StringManipulator manString = new StringManipulator();
    String word = "Hello";
    String subString = "llo";
    String notSubString = "world";
    Integer s = manString.getIndexOrNull(word, subString);
    Integer k = manString.getIndexOrNull(word, notSubString);
    System.out.println(s);
    System.out.println(k);

    StringManipulator sub = new StringManipulator();
    String phrase = sub.concatSubstring("Hello", 1, 2, "world");
    System.out.println(phrase);
    }
}