//FirstLastN
public class Classwork
{
  public static void main(String[] args)
  {
    //FirstLastN
    String word = FirstlastN("dictionary", 3);
    System.out.println(word);
    //DelEnd
    word = delEnd("computer", 5);
    System.out.println(word);
    //CompareLowerCase
    int compare = compareLower("framing","framING");
    System.out.println(compare);
    int length = LengthFirst("Down is the new up");
    System.out.println(length);
  }

  public static String FirstlastN(String s, int n)
  {
    String output = s.substring(0, n);
  
    int endingIndex = s.length() - n;
    String output2 = s.substring(endingIndex);
    return (output + output2);
  }
// DelEnd
  public static String delEnd(String s, int n)
  {
    int stoppingIndex = s.length() - n;
    String output = s.substring(0, stoppingIndex);
    return output;
  }

// ComparingLowerCase 
  public static int compareLower(String s, String i)
  {
    s = s.toLowerCase();
    i = i.toLowerCase();
    return(s.compareTo(i));
  }
// LengthFirst
public static int LengthFirst(String sentence)
{
  int s = sentence.indexOf(" ");
  String output = sentence.substring (0, s);
  return output.length();
}
}
