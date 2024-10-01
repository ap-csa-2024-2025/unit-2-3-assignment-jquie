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
    System.out.println(str1.comparetostr2);
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
  public static String compareLower(String s, String i)
  {
    String str1 = s;
    String str2 = i;
  }
}
